import logo from './logo.svg';
import './App.css';
import {Component} from 'react'
import Logout from './Logout';
import Login from './Login';
import User from './User';
import Guest from './Guest'
class App extends Component{
  constructor(props) {

    super(props);

    this.state = {

      isLoggedIn: false

    };

  }
  login = () =>{
    this.setState({
      isLoggedIn : true
    })
  }
  logout = () =>{
    this.setState({
      isLoggedIn : false
    })
  }

   render() {
    let page;
    let button;
    if(this.state.isLoggedIn){
      page = <User/>;
      button = <Logout onLogout={this.logout}/>;
    }
    else{
      page = <Guest/>;
      button = <Login onLogin={this.login}/>;
    }
    return(
        <div>
          {page}
          {button}
        </div>
    )


   }
}
export default App;
