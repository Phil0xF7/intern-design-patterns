# Composite

## A short overview of the pattern
The Composite Pattern allows you to build structures of objects in the form of trees that contain both compositions of objects and individual objects as nodes. This allows the client to perform operations on both composites and individual objects uniformly.

## The problem that it solves
Allows you to access all composite and leaf nodes in a tree structure uniformly. You don't have to detect whether your object is a composite or individual leaf node which reduces code complexity.

## What's good and what's bad about it
#### Good
Client is able to access composites or leaf nodes uniformly which reduces code complexity.

#### Bad
Leaf node objects may inherit methods it does not use  
Breaks the Single Responsibility Principle since it's managing either a composite or an individual leaf node. This is a tradeoff for client transparency.

## How it fits with related patterns
Decorator Pattern attaches additional responsibilities dynamically to an object  
Can be viewed as a composite with only one component  
Decorates a single component while a Composite composes multiple components  
  
## My Impressions
This pattern is a great way to simplify operations for the client while processing groups of different objects.

## An example of an API that uses the pattern
Eclipse SWT - graphical widget toolkit  
GUI objects such as buttons and text areas and GUI composites such as windows. The client would call a render function from the parent window which would render the windows and all the objects within the windows.

## Code Example
I implemented the Menu example from the Head First Design Patterns book
in Ruby.
The menu data structure contains menus(composites) and menu items(leaf
nodes) and we use the printObject method on each component recursively
through the tree to print the menu.

Run `example_menu.rb` to print out the entire menu.
