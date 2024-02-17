import React from 'react';
import Table from '../../components/table/Table';

function Bills() {
  return (
    <Table headers={['ID', 'Bill', 'Supporters', 'Opposers', 'Primary Sponsor']} data={null}></Table>
  );
}

export default Bills;