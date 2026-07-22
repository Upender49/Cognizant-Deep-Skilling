import {Component} from 'react';
class Cart extends Component{
    render(){
        return(
            <div style={{
                border: "1px solid black",
                width: "250px",
                margin: "10px",
                padding: "10px"
            }}>
                <h3>{this.props.itemName}</h3>
                <p>Price : ₹{this.props.price}</p>
            </div>
        );
    }

}
export default Cart;