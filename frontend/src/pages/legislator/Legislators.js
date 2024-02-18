import React, { useEffect, useState } from "react";
import Table from "../../components/table/Table";
import { fetchLegislatorData } from "../../service/ApiService";

function Legislators() {
  const [data, setData] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const fetchedData = await fetchLegislatorData();
        setData(fetchedData);
      } catch (error) {
        console.error("Error fetching data:", error);
      }
    };

    fetchData();
  }, []);

  return (
    <Table
      headers={["ID", "Legislator", "Supported bills", "Opposed bills"]}
      data={data}
    ></Table>
  );
}

export default Legislators;
