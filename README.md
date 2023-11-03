# AH8

Algo Hour 8

# Objective

- Fork and clone this repository. Work on the objective(s). Then push up your changes to YOUR fork.

Write a method, `linkedListFind`, that takes in the head of a linked list and a target value. The method should return a boolean indicating whether or not the linked list contains the target.

# Test Cases

1. 
```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

Source.linkedListFind(a, "c"); // true
```

2. 

```java
Node<Integer> node1 = new Node<>(42);

// 42

Source.linkedListFind(node1, 100); // false
```

# Extra Credit

## Objective

Write a method, `getNodeValue`, that takes in the head of a linked list and an index. The method should return the value of the linked list at the specified index.

If there is no node at the given index, then return null.

## Test Cases

1. 
```java
Node<String> node1 = new Node<>("banana");
Node<String> node2 = new Node<>("mango");
Node<String> node3 = new Node<>("kiwi");

node1.next = node2;
node2.next = node3;

// banana -> mango -> kiwi

ECSource.getNodeValue(node1, 0); // "banana"
```

2. 
```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

ECSource.getNodeValue(a, 7); // null
```

In this code, linkedListFind is a method that takes a head node and a target value as arguments. It starts from the head of the linked list and traverses the list until it finds the target value or reaches the end of the list. If the target value is found, it returns true; otherwise, it returns false. The Node class represents a node in the linked list, which contains a value of type T and a reference to the next node in the list. The Source class contains the linkedListFind method. You can create a new linked list and use the linkedListFind method to search for a target value in the list. This code works with linked lists that store values of any type that implements the equals method, such as String, Integer, and custom classes. Please note that this code assumes that the equals method is correctly implemented for the type T. If T is a custom class, you may need to override the equals method in that class. If T is a primitive type, you should use the corresponding wrapper class, such as Integer for int, Double for double, etc. The main method creates a linked list of String nodes and uses the linkedListFind method to check if the list contains the string "c". The result is printed to the console.