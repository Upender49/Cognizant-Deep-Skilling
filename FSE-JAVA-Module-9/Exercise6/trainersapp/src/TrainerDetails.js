import { useParams } from "react-router-dom";
import trainers from "./TrainersMock";

function TrainerDetails() {

    const { id } = useParams();

    const trainer = trainers.find(
        (t) => t.trainerId === Number(id)
    );

    if (!trainer) {
        return <h2>Trainer Not Found</h2>;
    }
    return (
        <div>
            <h2>{trainer.name}</h2>

            <p>ID: {trainer.trainerId}</p>

            <p>Email: {trainer.email}</p>

            <p>Phone: {trainer.phone}</p>

            <p>Technology: {trainer.technology}</p>

            <p>
                Skills:
                {trainer.skills.join(", ")}
            </p>
        </div>
    );
}

export default TrainerDetails;