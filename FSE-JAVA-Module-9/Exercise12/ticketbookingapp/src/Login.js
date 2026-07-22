import { Component } from "react";

class Login extends Component {

    render() {

        return (

            <button onClick={this.props.onLogin}>

                Login

            </button>

        );

    }

}

export default Login;