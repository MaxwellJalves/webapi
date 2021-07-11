import React, { Component } from 'react';
import FormComponent from './components/FormComponent';
import ListMap from './components/ListMap';
import { ConsumerSpringApi } from './components/card/ConsumerSpring';

import './assets/app.css'
export default class App extends Component {

  render() {

    return (
      <section className="conteudo">
     
        <FormComponent />
        <section>
        <ConsumerSpringApi />
        </section>

        <section>
        <ListMap/>
        </section>
    
      </section>
    );
  }
}


