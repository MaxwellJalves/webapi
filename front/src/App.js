import React, { Component } from 'react';
import FormComponent from './components/FormComponent';
import ListMap from './components/ListMap';
import { ConsumerSpringApi } from './components/ConsumerSpring';

export default class App extends Component {

  render() {

    return (
      <div>
        <FormComponent />
        <ConsumerSpringApi />
        <ListMap/>
      </div>
    );
  }
}


