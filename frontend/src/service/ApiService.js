// Create a function to fetch data
export function fetchLegislatorData() {
  return fetchData("http://localhost:8080/legislators");
}

export function fetchBillData() {
  return fetchData("http://localhost:8080/bills");
}

async function fetchData(path) {
  try {
    const response = await fetch(path);
    if (!response.ok) {
      throw new Error("Network response was not ok");
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error("There was a problem with the fetch operation:", error);
  }
}
