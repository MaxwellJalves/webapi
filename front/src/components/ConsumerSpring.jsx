import React, { Component } from 'react';
import api from '../api';

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
            <div>
                <h1>Lista Api Spring</h1>
                {clientes.map(cli => (
                    <ul key={cli.id}>
                        <li>{cli.id}</li>
                        <li>{cli.nome}</li>
                        <li>{cli.tipo}</li>
                    </ul>

                ))}
            </div>
        );

    }
}