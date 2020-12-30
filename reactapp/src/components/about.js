import React from 'react';
import ReactDom from 'react-dom';
import Section from './section';
import Summary from './summary';

export default class About extends React.Component{
    
    aboutContent(){
        return(
            <div className="jumbotron">
                <h1>Dan Jeremy Navarro</h1>
                <p className="lead">
                    Hey there! My name is Dan Jeremy Navarro. I'm an information technology professional with experience ranging from network and systems administration
                    to full stack development. I'm a naturally curious individual with a go-getter attitude. I believe in getting things done quick and the right way! You can read more about me by scrolling down.
                </p>
                <hr className="my-4"></hr>
                <p>Want my resume? Click the button below!</p>
                <a className="btn btn-primary" href="https://docs.google.com/document/d/1IEv8Pc1YaNH60JuZze82G2XT4jhYuZRNVPExESzR4R4/edit?usp=sharing">Click me!</a>
            </div>
        )
    }

    render(){
        document.title = "About";
        return (
            <div className="container-fluid">
                <Section content={this.aboutContent()} />
                <Summary />
            </div>
        )
    }
}