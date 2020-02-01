# Reverse an Array
<!-- Short summary or background information -->
A function called reverse array which takes an array as an argument and returns an array with elements in reverse order.
## Challenge
<!-- Description of the challenge -->
Reverse the order of an inputed array

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
cycle through the array and reverse the order of the index values
## Solution
<!-- Embedded whiteboard image -->
![](https://raw.githubusercontent.com/tcoots88/data-structures-and-algorithms/master/assets/20200106_172537.jpg)

# Array shift
<!-- Short summary or background information -->
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Challenge Description
<!-- Description of the challenge -->
Insert a value into the middle of an array
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
cycle through the array and and insert the new value at the index equal to half of the length of the array
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for Array Shift](https://raw.githubusercontent.com/tcoots88/data-structures-and-algorithms/master/assets/20200107_174333.jpg)


# Singly Linked List
<!-- Short summary or background information -->
Create a Linked List that is empty upon instantiation

## Challenge
<!-- Description of the challenge -->

- Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
- Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
- Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
  - "{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Begin with establishing the empty list and make a method that allows to add a value.  Establish an additional method to check to see if a value is already in the list. 

## API
<!-- Description of each method publicly available to your Linked List -->


# Binary Search
<!-- Short summary or background information -->
A function that  takes in 2 parameters: a sorted array and the search key. Returns the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Challenge Description
A function that  takes in 2 parameters: a sorted array and the search key. Returns the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Determine the mid point by first declaring the the start and end of an array.  Depending on whether the search key is less than, equal to, or greater than the mid point will determine the result.  If nothing is found, return -1. 

## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for Binary Search](https://raw.githubusercontent.com/tcoots88/data-structures-and-algorithms/master/assets/20200108_172151.jpg)
![Whiteboard for Binary Search2](https://raw.githubusercontent.com/tcoots88/data-structures-and-algorithms/master/assets/20200108_172155.jpg)


# Challenge Summary
<!-- Short summary or background information -->


## Challenge Description
<!-- Description of the challenge -->
A function called mergeLists which takes two linked lists as arguments. The two linked lists zip together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. 
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Traverse each linked list. Point the next node of current node in list1 to next node in list2
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for mergeLists](src/main/resources/whiteboard.jpg)



# Stacks and Queues
<!-- Short summary or background information -->
Create a stack class that has a top property and uses methods push, pop, peek, and isEmpty. Similary,
create a queue class that has a front and back property and uses methods
enqueue, dequeue, peek, and isEmpty. 
## Challenge
<!-- Description of the challenge -->
Both classes should have O(1) Time performance.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Stack should use Last in First Out (LIFO) and queue should use First in 
Last Out (FILO)

# PseudoQueue
<!-- Short summary or background information -->
Create a brand new PseudoQueue class. This will mimic the queue functionality using two stacks
## Challenge Description
<!-- Description of the challenge -->
Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Not really sure if I did correctly. I seem to be only utilizing one stack...
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for multiBracket](C:\Users\Coots\Desktop\Codefellows\data-structures-and-algorithms\code401challenges\resources\multiBracketWBPhoto.jpg)


# Challenge Summary
<!-- Short summary or background information -->
Multi-bracket Validation.

## Challenge Description
<!-- Description of the challenge -->
 Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

    Round Brackets : ()
    Square Brackets : []
    Curly Brackets : {}

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Create hashset and hash map for opening and closing brackets
Traverse string(input) and if char is opening, pop char onto stack
if char is closing bracket, check for corresponding opening on stack
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for multiBracket](C:\Users\Coots\Desktop\Codefellows\data-structures-and-algorithms\code401challenges\resources\multiBracketWBPhoto.jpg)

# Challenge Summary
<!-- Short summary or background information -->
Animal Shelter

## Challenge Description
<!-- Description of the challenge -->
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Created an animal class, an a dog class and cat class that both inherits from Animal.

Created a Animal Shelter class that has 2 queues - a dog queue and a cat queue
## Solution
<!-- Embedded whiteboard image -->

# Trees
<!-- Short summary or background information -->

- Tree
    - Create a class with 3 traversals - preorder, inorder and postorder, and return arrays with values for each function
-   BinarySearchTree
    - Create a Binary Search tree class with 2 methods - contains and add
## Challenge
<!-- Description of the challenge -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

   **preOrder** - process the root value first (add it's value to the array list), then process the left node, then process the right node
   <br>
   **inOrder** - process the left node value first (add it's value to the array list), then process the root node, then process the right node
   <br>
   **postOrder** - process the left value first (add it's value to the array list), then process the right node, then process the root node
   <br>
   **add** - checks the root to see if the value is less than or more than the target. If less than, add to left tree, else add to right of the tree
   <br>
   **contains** - uses recursion to search for value in the tree. On each iteration of recursion, checks the root to see if the value is less than or more than the target. If less than, search right of tree, else search right of the tree
<br><br><br>

# FizzBuzz Tree
<!-- Short summary or background information -->
Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value
## Challenge Description
<!-- Description of the challenge -->
Create a fizzBuzzTree class that has a fizzbuzz method that takes in a tree. The method returns a tree with original values that are divisible by 15 with "FizzBuzz", original values that are divisible by 5 only with "Buzz", and original values that are divisible by 3 only with "Fizz"
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
fizzBuzz calls fizzBuzzMethodHelper to process the nodes.
fizzBuzzMethodHelper traverses the tree recursively using preorder traversal 
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for FizzBuzz](src/main/resources/FizzBuzzWB.jpg)

# Find Max Value
<!-- Short summary or background information -->
Create a findMaximum method that which takes a Binary Tree as its unique input and returns the maximum value stored in the tree.
## Challenge Description
<!-- Description of the challenge -->
Create a fizzBuzzTree class that has a fizzbuzz method that takes in a tree. The method returns a tree with original values that are divisible by 15 with "FizzBuzz", original values that are divisible by 5 only with "Buzz", and original values that are divisible by 3 only with "Fizz"
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Time O(n); Space O(n); Use a helper function that takes in the tree's root value and does all the heavy lifting.

    create a variable that stores the maximum
    using inOrder traversal, check each node to see if it is bigger than the maximum. If so, replace the maximum value with that node's value
    return the maximum value
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for MaxValue](src/main/resources/maxValWB.jpg)


# Breadth First Traversal
<!-- Short summary or background information -->
Create a breadth first traversal method that which takes a Binary Tree as its unique input and prints the nodes visited
## Challenge Description
<!-- Description of the challenge -->
Use a helper function that takes in the tree's root value and does all the heavy lifting
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Continuously add nodes to the queue until no further nodes are left to be added. When the node is about to be dequeued, add the children to the queue. Add the value to a string that will be returned after all the nodes in the tree are visited.
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for MaxValue](src/main/resources/BreadthFirstWhiteboard.jpg)










