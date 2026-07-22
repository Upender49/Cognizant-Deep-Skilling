import {Component} from 'react';

class IndianPlayers extends Component {
    constructor() {
        super();
    }

    render() {
        const players = [
            "Virat",
            "Rohit",
            "Gill",
            "Rahul",
            "Hardik",
            "Pant"
        ];

        const [p1, p2, p3, p4, p5, p6] = players;

        const odd = [p1, p3, p5];
        const even = [p2, p4, p6];

        const t20 = [
            "Virat",
            "Rohit",
            "Sky"
        ];

        const ranji = [
            "Pujara",
            "Rahane",
            "Iyer"
        ];

        const all = [...t20, ...ranji];
        return (
            <div>
                <h2>Odd Team Players</h2>
                <ul>
                    {
                        odd.map((p, i) => (
                            <li key={i}>{p}</li>
                        ))
                    }
                </ul>
                <h2>Even Team Players</h2>
                <ul>
                    {
                        even.map((p, i) => (
                            <li key={i}>{p}</li>
                        ))
                    }
                </ul>
                <h2>Merged Players</h2>
                <ul>
                    {
                        all.map((p, i) => (
                            <li key={i}>{p}</li>
                        ))
                    }
                </ul>
            </div>
        )
    }

}
export default IndianPlayers;