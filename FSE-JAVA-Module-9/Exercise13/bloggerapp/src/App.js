import {Component} from "react";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

class App extends Component {

    render() {

        return (

            <div>

                <BookDetails/>

                <hr/>

                <BlogDetails/>

                <hr/>

                <CourseDetails/>

            </div>

        )

    }


}

export default App;