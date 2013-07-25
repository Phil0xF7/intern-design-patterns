# Visitor Design Pattern

## What is it?

The visitor design pattern is a way of seperating an object from operations being performed on it. 
It allows you to add functions to a class without having to alter the class itself. This is done using a "visitor"
class. The visitor goes from class to class and performs the appropriate operation depending on which class it is looking at.

![alt text](http://upload.wikimedia.org/wikipedia/en/thumb/7/7f/VisitorClassDiagram.svg/515px-VisitorClassDiagram.svg.png "Visitor UML Diagram")


## What problem is it solving?

As mentioned, the visitor pattern allows you to add functionality to a class without altering the class itself, which
is what makes it useful. On a very basic level, this prevents you from having to modify code we may not want to
deal with or do not have access to. Additionally, if you have a lot of objects which share some piece of
functionality, it reduces the number of places you need to modify code and centralizes functionality.

## Pros and Cons

Pros:
* Allows you to add operations to a Composite structure without changing the structure itself
* Adding new operations is relatively easy
* The code for operations performed by the Visitor is centralized

Cons:
* The Composite classes' encapsulation is broken when the Visitor is used.
* Because the traversal function is involved, changes to the Composite structure are more difficult

## Relation to Other Patterns

The visitor pattern is related to the iterator design pattern in that they both deal with decoupling functionality from
objects. The visitor pattern seperates and "algorithm from object structure" while iterator seperates "algorithm from
container"

## My Example

My example is written in Java. It's a trivial example where I have three objects (bird, plane, and Superman), all of
which are different but share a piece of functionality: flying. However all of the objects fly differently. Each object must implement the "visitable" interface so it is
possible for the FlyingVisitor (ConcreteVisitor) to "visit" them. The FlyingVisitor in turn must implement "Visitor"
interface in order to gain the "visit" methods. However, this is not strictly nessecary in this case since I only have
one concrete visitor.

![alt text](http://i.imgur.com/CI2JyIu.png "Visitor UML Diagram")

## Real World Example

Puppet uses the visitor example in order to easily evaluate all the elements in an AST when parsing Puppet code.

https://github.com/puppetlabs/puppet/blob/master/lib/puppet/pops/model/model_tree_dumper.rb
