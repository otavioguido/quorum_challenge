import React from 'react';
import Table from '../../components/table/Table';

function Legislators() {
  return (
    <Table headers={['ID', 'Legislator', 'Supported bills', 'Opposed bills']} data={null}></Table>
  );
}

export default Legislators;