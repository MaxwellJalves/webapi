import React, { Component } from 'react';

class ListMap extends Component {

    render() {
        return (
            <ul>
                {Array.of("Online", "Programado", "Saiuentrega").map((interando, index) => {
                    return (
                        <li key={index}>
                            <div>
                                {index} -
                                {interando}

                            </div>
                        </li>
                    );
                })}
            </ul>);
    }


}

export default ListMap;