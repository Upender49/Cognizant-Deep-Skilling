import {Component} from 'react';
import Cart from './Cart'
class OnlineShopping extends Component{
    constructor() {
        super();

        this.items = [
            { itemName: "Laptop", price: 65000 },
            { itemName: "Mobile", price: 25000 },
            { itemName: "Keyboard", price: 1500 },
            { itemName: "Mouse", price: 800 },
            { itemName: "Headphones", price: 3000 }
        ];
    }
    render(){
        return(
            <div>
                <h2>Shopping Cart</h2>
                <table border="1">
                <thead>
                <tr>
                    <th>Item</th>
                    <th>Price</th>
                </tr>
                </thead>
                    <tbody>
                    {
                        this.items.map((item,index)=>{
                            return(
                                <Cart  key={index} itemName = {item.itemName} price ={item.price}/>

                            )
                        })
                    }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default OnlineShopping;