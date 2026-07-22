import { Component } from "react";

class CurrencyConvertor extends Component {

    constructor(props) {

        super(props);

        this.state = {

            rupees: "",

            euro: ""

        };

    }
    handleChange = (event) =>{
        this.setState({
            rupees : event.target.value
        })

    }
    handleSubmit = (event) =>{
        this.setState ({
            euro:  (this.state.rupees/90).toFixed(2)
        })
    }
    render() {
        return(
        <div>
            <h2>Currency Converter</h2>
            <input type="number" placeholder="Enter the rupees" value={this.state.rupees} onChange={this.handleChange} />
            <button type="btn" onClick={this.handleSubmit}>Submit</button>
            <h3>
                Euro : €{this.state.euro}
            </h3>
        </div>
        );
    }
}
export default CurrencyConvertor;