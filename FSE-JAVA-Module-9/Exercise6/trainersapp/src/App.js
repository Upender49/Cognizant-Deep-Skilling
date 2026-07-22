import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter,
  Routes,
  Route,
  Link
} from "react-router-dom";
import Home from "./Home";
function App() {
  return (
      <BrowserRouter>
        <nav>
          <Link to="/" >Home </Link>
          <Link to="/trainers" >Trainers </Link>
        </nav>
        <Routes>
          <Route path="/"
                 element={<Home/>}/>
            <Route path="/trainers"
                 element={<Home/>}/>
        </Routes>
      </BrowserRouter>

  );
}

export default App;
