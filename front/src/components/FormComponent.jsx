import React, { Component } from 'react';

export default class FormComponent extends Component {


    render() {
        return (


            <section>
                <form>
                    <label>Nome:
                        <input type="text" placeholder="@Nome"></input>
                    </label>
                    <label>Tipo de Atendimento:
                        <select name="tipo" id="tipoatendimento">
                            <option value="ONLINE">Atendimento Online</option>
                            <option value="PRESENCIAL">Atendimento Presencial</option>
                            <option value="ENDERECO_PROGRAMADO">Entrega Programada</option>
                        </select>
                    </label>

                </form>
                <header>
                    <p>Sucesso</p>
                </header>
            </section>

        );

    }

}
