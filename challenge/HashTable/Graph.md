# Graphs
<!-- Short summary or background information -->

Implementation a graph data structure in java .

## Challenge
<!-- Description of the challenge -->

Add a constructor, getters, and the following methods to a Graph data structure: addNode, addEdge, getNodes, getNeighbors, and size.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

* Create a generic GraphNode class with value as the graph node type.
* Create variables for each instance (size, HashMap of nodes and their neighbors with corresponding edges).
* Constructors must be defined.
* Define the addNode function, which returns the additional Node after adding it to the HashMap of the graph Nodes with a LinkedList for its neighbors.
* AddEdge is a method that accepts two nodes  and adds them together( Both nodes should be in the graph already).
* Define the getNode method, which returns a HashMap containing all the graph's nodes.
* Define the getNeighbors function, which returns a LinkedList of a Node's neighbors.


## API
<!-- Description of each method publicly available in your Graph -->

`addNode()`: is a method that adds a new node to the graph and  Returns the created node.

`addEdge()`: Creates a new edge between two nodes in the graph , Takes the two nodes that will be linked by the edge into account(Both nodes should be in the Graph already).

`getNodes()`: Returns a collection of all nodes in the graph (set, list, or similar)

`getSize()`: returns the graph's total number of nodes.

`GetNeighbors()`: Returns a list of edges that are linked to the specified node. Takes in a
certain node.