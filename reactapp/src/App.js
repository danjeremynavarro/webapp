import React from 'react';
import {Switch, Route, BrowserRouter as Router} from 'react-router-dom';
import About from './components/about';
import {lightTheme, darkTheme, GlobalStyle} from './components/styles/theme';
import {ThemeProvider} from 'styled-components';

import 'bootswatch/dist/lux/bootstrap.min.css';
import './web.scss';

export const appVersion = "0.1.0";

export default class App extends React.Component{

  constructor(props){
    super(props);
    this.state = {
      theme: lightTheme,
    }
    this.themeToggle = this.themeToggle.bind(this);
  }

  themeToggle(event){
    const prevTheme = this.state.theme;
    event.target.classList.add("disabled");
    this.setState({
      theme: prevTheme == lightTheme ? darkTheme : lightTheme
    });

    switch(event.target.attributes.id.value){ 
      case "light-mode":
        document.getElementById("dark-mode").classList.remove("disabled");
        break;
      case "dark-mode":
        document.getElementById("light-mode").classList.remove("disabled");
        break;
    }
  }
  
  render(){
    return (
      <ThemeProvider theme={this.state.theme}>
        <GlobalStyle />
          <Router>
          <div>
            <nav className="navbar navbar-expand-sm navbar-dark bg-dark px-2 py-2">
              <a className="navbar-brand" href="/">Dan</a>
              <ul className="navbar-nav ml-sm-auto">
                <li>
                <button className="nav-item btn btn-sm btn-warning mr-0 disabled" id="light-mode" onClick={this.themeToggle}>Light</button>
                <button className="nav-item btn btn-sm btn-primary mr-0" id="dark-mode" onClick={this.themeToggle}>Dark</button>
                </li>

              </ul>     
            </nav>
            <div className="main">
            <Switch>
              <Route path="/">
                <About />
              </Route>
            </Switch>
            </div>
          </div>
        </Router>
      </ThemeProvider>
    )
  }
}


