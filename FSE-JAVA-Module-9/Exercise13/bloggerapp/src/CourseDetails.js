import { Component } from "react";

class CourseDetails extends Component {

    render() {

        const courses=[

            {
                id:1,
                name:"React"
            },

            {
                id:2,
                name:"Java"
            },

            {
                id:3,
                name:"Spring Boot"
            }

        ];

        return(

            <div>

                <h2>Course Details</h2>

                <ul>

                    {
                        courses.map(course=>(
                            <li key={course.id}>
                                {course.name}
                            </li>
                        ))
                    }

                </ul>

            </div>

        );

    }

}

export default CourseDetails;