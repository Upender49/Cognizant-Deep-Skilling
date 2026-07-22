import {Component} from 'react';
class ComplaintRegister extends Component{
    constructor(props) {
        super(props);
        this.state ={
            name : "",
            problem : ""
        };
    }
    handleChange = (event) =>{
        this.setState({
        [event.target.name] : event.target.value
        })
    }
    handleSubmit = (event) =>{
        event.preventDefault();
        const refnumber = Math.floor(Math.random()*10000);
        alert(`The Complaint is subbmeted with ref num ${refnumber}`);
    }
    render(){
        return(
            <div>
                <h2>Form Exercise</h2>
                <form onSubmit={this.handleSubmit}>
                    <input type={"text"} name={"name"} value={this.state.name} placeholder={"Enter the Name"} onChange={this.handleChange}/>
                    <textarea type={"text"} name={"problem"} value={this.state.problem} placeholder={"Enter the Problem"} onChange={this.handleChange}/>
        <button type={"submit"}>Submit</button>
                </form>
            </div>
        )
    }

}
export default ComplaintRegister;