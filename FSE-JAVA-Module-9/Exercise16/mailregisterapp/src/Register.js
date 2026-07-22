import {Component} from 'react';
class Register extends Component {

    constructor(props) {
        super(props);

        this.state = {
            name: "",
            email: "",
            password: "",

            errors: {
                name: "",
                email: "",
                password: ""
            }
        };
    }
    handleChange = (event) =>{
        const {name,value} = event.target;
        let errors = {... this.state.errors}
        switch (name){
            case "name" : errors.name = (value.length < 5) ? "Name should contain at least 5 characters" : ""
                break;
            case "email" :
                const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
                errors.email = emailRegex.test(value) ? "" : "Enter a valid email address";
                break;
            case "password":
                errors.password =
                    value.length < 8
                        ? "Password should contain at least 8 characters"
                        : "";
                break;
            default : break;
        }
        this.setState({
            [name] : value,
            errors : errors
        })

    }
    handleSubmit = (event) => {

        event.preventDefault();

        const { errors, name, email, password } = this.state;

        if (
            errors.name === "" &&
            errors.email === "" &&
            errors.password === "" &&
            name &&
            email &&
            password
        ) {

            alert("Registration Successful");

        } else {

            alert("Please enter valid details.");

        }

    };

    render() {

        return (

            <div>

                <h2>Mail Register</h2>

                <form onSubmit={this.handleSubmit}>

                    <label>Name</label>

                    <br />

                    <input
                        type="text"
                        name="name"
                        value={this.state.name}
                        onChange={this.handleChange}
                    />

                    <br />

                    <span style={{ color: "red" }}>
                        {this.state.errors.name}
                    </span>

                    <br /><br />

                    <label>Email</label>

                    <br />

                    <input
                        type="text"
                        name="email"
                        value={this.state.email}
                        onChange={this.handleChange}
                    />

                    <br />

                    <span style={{ color: "red" }}>
                        {this.state.errors.email}
                    </span>

                    <br /><br />

                    <label>Password</label>

                    <br />

                    <input
                        type="password"
                        name="password"
                        value={this.state.password}
                        onChange={this.handleChange}
                    />

                    <br />

                    <span style={{ color: "red" }}>
                        {this.state.errors.password}
                    </span>

                    <br /><br />

                    <button type="submit">
                        Register
                    </button>

                </form>

            </div>

        );

    }

}

export default Register;


