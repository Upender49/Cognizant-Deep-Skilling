import {Component} from 'react';
class ListofPlayers extends Component{
    constructor() {
        super();
        this.players = [
            { name: "Virat", score: 95 },
            { name: "Rohit", score: 82 },
            { name: "Gill", score: 65 },
            { name: "Rahul", score: 72 },
            { name: "Hardik", score: 45 },
            { name: "Pant", score: 88 },
            { name: "Sky", score: 55 },
            { name: "Jadeja", score: 78 },
            { name: "Ashwin", score: 60 },
            { name: "Bumrah", score: 90 },
            { name: "Shami", score: 68 }
        ];
    }

    render() {
        const lowscore = this.players.filter(player => player.score < 70);
        return(
            <div>
                <table border="1" cellPadding="8">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.players.map((player,index)=>(
                            <tr key={index}>
                                <td>{player.name}</td>
                                <td>{player.score}</td>
                            </tr>
                        ))
                    }

                    </tbody>
                </table>
                <h2>Players With Score Below 70</h2>

                <ul>
                    {
                        lowscore.map((p, i) => (
                            <li key={i}>
                                {p.name} - {p.score}
                            </li>
                        ))
                    }
                </ul>
            </div>
        )
    }
}
export default ListofPlayers;