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
