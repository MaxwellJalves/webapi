import React, { Component } from 'react';
import api from '../../api';
import './Estilo.css';

export class ConsumerSpringApi extends Component {
    state = {
        clientes: [],
    }

    async componentDidMount() {
        const { data } = await api.get('');
        this.setState({ clientes: data })

    }


    render() {

        const { clientes } = this.state;
        return (
            <div >
                <h1>Lista Api Spring</h1>
                {clientes.map(cli => (
                    <ul key={cli.id}>
                        <div className="card-box">
                            <li>{cli.id}</li>
                            <li>{cli.nome}</li>
                            <li>{cli.tipo}</li>
                        </div>
                    </ul>

                ))}
            </div>
        );

    }
}