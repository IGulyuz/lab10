import logo from './logo.svg';
import './App.css';
import React, { useState, useEffect } from 'react';

function App() {
    const [message, setMessage] = useState('');

    useEffect(() => {
        fetch('http://localhost:8080/greet') // This should match your Spring Boot API
            .then(response => response.text())
            .then(data => setMessage(data));
    }, []);

    return ( <
        div >
        <
        h1 > React + Spring Boot < /h1> <
        p > { message } < /p> <
        /div>
    );
}

export default App;