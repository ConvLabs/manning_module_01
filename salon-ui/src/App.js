import React, { Component } from 'react';
import Navbar from 'react-bootstrap/Navbar';
/* 
import Nav from 'react-bootstrap/Nav';
import Form from 'react-bootstrap/Form';
import FormControl from 'react-bootstrap/FormControl';
import Button from 'react-bootstrap/Button';
*/

import './App.css';

export default class App extends Component {
  
  render() {
      return (
        <>
          <Navbar bg="dark" variant="dark">
            <Navbar.Brand href="#">AR Salon & Day Spa</Navbar.Brand>                
          </Navbar>
          <br/>
          <br/>
          <br/>
          <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
              
        </>
      );
  }
}