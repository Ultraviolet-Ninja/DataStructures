# Map Stack

### Description
The Map Stack is a HashMap that acts as a double generic stack controlled by a LinkedList.

### Practical Application
I've used this for is backtracking within a hexagonal maze. In any given position with multiple exits,
a record of previous positions as well as what paths have been taken is important, but if the 
current path doesn't end in an exit, then we can pop off the positions and continue down other routes.

### Backing Structure(s)
- LinkedList - Contains Keys
- HashMap - Contains Keys and Values