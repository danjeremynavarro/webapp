import {createGlobalStyle} from 'styled-components';

export const lightTheme = {
    body: '#e1e1ea',
    text: '#363537',
    toggleBorder: '#FFF',
    background: '#FFFFFF',
  };
  
  export const darkTheme = {
    body: '#363537',
    text: '#FAFAFA',
    toggleBorder: '#6B8096',
    background: '#999',
  };
  
  export const GlobalStyle = createGlobalStyle`
    body {
      background-color: ${({ theme }) => theme.body};
      color: ${({ theme }) => theme.text};
      transition: all 0.20s ease-in;
    }
    .card {
      background-color: ${({ theme }) => theme.background};
      color: ${({ theme }) => theme.text};
    }
    .jumbotron {
      background-color: ${({ theme }) => theme.background};
      color: ${({ theme }) => theme.text};   
    }
    .disabled{
        pointer-events: none;
    }
    .nav-item.btn{
        border-width: 5px,
        border-color: #FFFFFF, 
    }
  `;

  export const BoldText = (props) => {
    return (
        <span className="font-weight-bold">
            {props.children}
        </span>
    )
};