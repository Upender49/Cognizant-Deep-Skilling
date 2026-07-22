import { Component } from "react";

class Counter extends Component {

    constructor(props) {
        super(props);

        this.state = {
            count: 0
        };
    }

    increment = () => {

        this.setState({
            count: this.state.count + 1
        });

    }

    decrement = () => {

        this.setState({
            count: this.state.count - 1
        });

    }
    sayHello = () => {

        alert("Hello! Welcome to React Events.");

    }
    sayWelcome = (msg) =>{
        alert(msg);
    }
    handleIncrement = () =>{
        this.increment();
        this.sayHello();
    }
    onPress = (event) =>{
        alert("I was clicked");

        console.log(event);
    }

    render() {

        return (

            <div>

                <h1>Counter : {this.state.count}</h1>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                <button onClick={this.decrement}>
                    Decrement
                </button>
                <button
                    onClick={() => this.sayWelcome("Welcome")}>
                    Say Welcome
                </button>
                <button onClick={this.onPress}>
                    OnPress
                </button>

            </div>

        );

    }

}

export default Counter;