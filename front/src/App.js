import { Component } from 'react';
import api from './api';

class App extends Component{

  state ={
    clientes :[],

  }

  async componentDidMount(){
    const response = await api.get('');
    console.log(response)
    this.setState({clientes:response.data})
    
  }
  render(){

    return (
      <div>
        
        <h1>CONSULTA</h1>


      </div>
    );
  }
}

export default App;
