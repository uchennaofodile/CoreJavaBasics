//state
import {useState, useEffect} from 'react';

import './App.css';

//Sample Component
// const Person = (props) => {
//   return (
//     <>
//       <h1>Name: {props.name}</h1>
//       <h2>Last: {props.LastName}</h2>
//       <h2>Age: {props.age}</h2>
//     </>


//   )

// }



const App = () => {
  //variables
  // const name = '';
  // if (name) {
  //   return 'It\'s correct';  
  // } else{
  //   return 'Not right';
  // }

  // const name = 'Uchenna';
  // const isNameShowing = false;
  // const isUserLoggedIn = true;

  //counter is name of variable
  //setCounter is how we are changing state of counter
  //useState is starting number
  const[counter, setCounter] = useState(0);


  // useEffect(()=>{
  //   alert('Reload')
  // });
  //wrong -- Never set state manually and this won't work
  // useEffect(()=>{
  //   counter=100;
  // });
//dependency array
//useEffect would only run when the value of counter changes
  //useEffect(()=>{setCounter(100)},[counter]);
  useEffect(()=>{alert(`You've changed the counter to ${counter}`)},[counter]);
  return (
    <div className="App">
      {/* <h1>Hello, {isNameShowing ? name : 'Someone else is showing'}!</h1>
     <h2>Hello {2+4}</h2>
     { name ? (
      <> <h1>{name}</h1></>
    ) :  (<>
        <h1>test</h1>
        <h2>There is no name</h2>
        </>
        )} */}
      {/* <Person
        name={'Ifeanyi'}
        LastName={'Nzute'}
        age={'27'}
      />
      <Person
        name='Emenike'
        LastName='Nzute'
        Nzute age={32 + 4}
      /> */}

{/* <button onClick={()=> alert('clicked')}>-</button> */}
{/* <button onClick={()=> setCounter(-5)}>-</button> */}
<button onClick={() => setCounter((prevCount)=> prevCount -1) }>-</button>
<h1>{counter}</h1>
<button onClick={()=>setCounter((prevCount)=> prevCount+1)}>+</button>
    </div>
  );
}

export default App;
