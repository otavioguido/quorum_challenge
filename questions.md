- Discuss your strategy and decisions implementing the application. Please, considertime
  complexity, effort cost, technologies used and any other variable that you understand
  important on your development process.

I decided to make the backend with Java which I have more experience and the frontend with react which is the framework
I most like and the one I want to work with.

In the backend, I read all the lines of the CSV files according to the operation I'm making, and then I store the data
in a map which the key is the ID of the object I'm manipulating and value is the object itself. This way, both consulting
and adding the data has a complexity of O(1). And in the frontend, I iterate through all the data that I fetch from the
backend, so it has a complexity of O(n).

- How would you change your solution to account for future columns that might be
  requested, such as “Bill Voted On Date” or“Co-Sponsors”?

In the backend, I would have to update the classes with the knew field and the Service which manipulates the CSV files.
In the frontend, I would have to update the header of the tables and the data is rendered dynamically, so I wouldn't
have to make any changes.

- How would you change your solution if instead of receiving CSVs of data, you were given a
  list of legislators or bills that you should generate a CSV for?

By know the structure of the data I would receive, I would get the fields and parse them by adding a colon between the
fields. For example for the Legislator, I would get the id, then add a colon and then add the name.

- How long did you spend working on the assignment?

I took 7h.