import React from 'react'

//passes props down so we can reuse this component over and over
export default function Card({title, content, onAlert}){

return(

<div>
<h1>{title}</h1>
<p>{content}</p>
<button onClick={onAlert}>Click Me</button>
</div>




)



}