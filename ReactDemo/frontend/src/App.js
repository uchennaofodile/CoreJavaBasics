import React from 'react'
import Card from './Components/Card'

const alertMsg = 'Hello from Spain';


// There are several reasons why it might be better to include the onAlert prop in App.js rather than in Card.jsx:

//Separation of Concerns: The Card component should ideally be concerned only with displaying the card content and handling user interactions specific to the card. By passing the onAlert prop down from App to Card, we keep the responsibility of handling the alert message within the App component, which is responsible for the overall application logic.

//Reusability: By passing down the onAlert prop from App to Card, we make the Card component more reusable across different parts of the application. If we included the onAlert prop within the Card component, it would limit its reusability, as it would only be useful in cases where an alert message is needed.

//Flexibility: By passing down the onAlert prop from App to Card, we give the App component more control over how the Card component behaves. For example, if we wanted to use a different function to handle user interactions specific to the Card component, we could simply pass down a different prop to Card without modifying the Card component itself.

// Overall, passing down the onAlert prop from App to Card is a common pattern in React that helps keep code modular, reusable, and flexible.

//title and content are passed into props
 function App() {
  function onAlert(){
    alert(alertMsg);
  }
  return (
    <div className="App">
      <Card title="Card 1" content="This is card 1" onAlert ={onAlert}/>
      <Card title="Card 2" content="This is card 2" onAlert={onAlert}/>
      <Card title="Card 3" content="This is card 3" onAlert={onAlert}/>
    </div>
  );
}

export default App;
