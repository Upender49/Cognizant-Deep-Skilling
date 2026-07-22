import { Component } from "react";

class Logout extends Component {

    render() {

        return (

            <button onClick={this.props.onLogout}>

                Logout

            </button>

        );

    }

}

export default Logout;