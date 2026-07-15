import trainers from "./TrainersMock";
import { Link } from "react-router-dom";
function TrainersList() {
    return (
        <div>
            <h2>Trainer List</h2>

            <ul>
                {
                    trainers.map((trainer)=>{
                        return(
                            <li key={trainer.trainerId}>
                                {trainer.name}
                            </li>

                        )
                    })
                }
            </ul>

        </div>
    );
}

export default TrainersList;