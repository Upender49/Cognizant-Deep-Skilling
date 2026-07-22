import logo from './logo.svg';
import './App.css';

function App() {
  const office = {
    name: "Smart Office",
    rent: 55000,
    address: "Madhapur, Hyderabad",
    image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
  };

  const offices = [
    {
      name: "Smart Office",
      rent: 55000,
      address: "Madhapur",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      name: "Tech Park",
      rent: 75000,
      address: "Hitech City",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    },
    {
      name: "Innovation Hub",
      rent: 45000,
      address: "Gachibowli",
      image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2?w=600"
    }
  ];
  return(
      <div style={{margin:"20px"}}>
        <img src={office.image} alt="Office" width="400" height = "200"/>
        <p>Name  : {office.name}</p>
        <p> Rent : <span style={{color : office.rent < 6000 ? "red" : "green"}}>{office.rent}</span></p>
        <br/>
            <hr/>
              {
                offices.map((office,index)=>(
                      <div key={index}>
                        <img src={office.image} height="200" width="450" alt="superr"/>
                        <h4>{office.name}</h4>
                        <p> Rent : <span style={{color : office.rent < 6000 ? "red" : "green"}}>{office.rent}</span></p>
                        <p> Address : {office.address}</p>

                      </div>
                ))
              }
      </div>
  )
}

export default App;
