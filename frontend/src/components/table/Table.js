import React from 'react';
import './Table.css'

function Table({headers, data}) {
  return (
    <div className='table-container'>
        <table>
        <thead>
          <tr>
            {headers.map((header, index) => (
              <th key={header.id}>{header}</th>
            ))}
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>
  );
}

export default Table;