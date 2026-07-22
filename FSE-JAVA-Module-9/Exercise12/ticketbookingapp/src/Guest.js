import { Component } from "react";

class Guest extends Component {

    render() {

        return (

            <div>

                <h2>Welcome Guest</h2>

                <h3>Flight Details</h3>

                <ul>

                    <li>Hyderabad → Delhi</li>

                    <li>Departure : 10:00 AM</li>

                    <li>Price : ₹4500</li>

                </ul>

                <p>Please Login to Book Tickets.</p>

            </div>

        );

    }

}

export default Guest;