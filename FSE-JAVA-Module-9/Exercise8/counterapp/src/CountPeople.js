import {Component} from 'react';
class CountPeople extends Component{
    constructor(props) {
        super(props);
        this.state ={
            inCount : 0,
            outCount : 0
        }
    }
    Enter = () =>{
        this.setState({
            inCount : this.state.inCount +1
        })
    }
    Exit = () =>{
        this.setState({
            outCount : this.state.outCount +1
        })
    }
    render() {
        return(
            <div>
                <h1>Entered {this.state.inCount}</h1>
                <button onClick={this.Enter}>Enter</button>
                <h1>Exited {this.state.outCount}</h1>
                <button onClick={this.Exit}>Exit</button>
            </div>
        )
    }

}
export default CountPeople;