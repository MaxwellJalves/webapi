import React, { Component } from 'react';
import FormComponent from './components/FormComponent';
import { ConsumerSpringApi } from './components/ConsumerSpring';

export default class App extends Component {

  render() {

    return (
      <div>
        <FormComponent />
        <ConsumerSpringApi />
      </div>
    );
  }
}


