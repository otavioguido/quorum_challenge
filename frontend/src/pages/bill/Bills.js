import React, { useEffect, useState } from "react";
import Table from "../../components/table/Table";
import { fetchBillData } from "../../service/ApiService";

function Bills() {
  const [data, setData] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const fetchedData = await fetchBillData();
        setData(fetchedData);
      } catch (error) {
        console.error("Error fetching data:", error);
      }
    };

    fetchData();
  }, []);

  return (
    <Table
      headers={["ID", "Bill", "Supporters", "Opposers", "Primary Sponsor"]}
      data={data}
    ></Table>
  );
}

export default Bills;
