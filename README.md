cs201-fall-2014
===============

Introduction to Programming Fall 2014

One of the goals for this course is to develop good software engineering skills.  We can meet this goal by practicing and adhering good software design principles.  Perhaps the most important aspect of writing good software is the notion of modularity and decomposition.  Modularity (or component-based) approach is to design software systems whose parts (or components) can be glued together to make a larger system.  Decomposition is the idea of separating the system's functionality into smaller (and hopefully) more manageable tasks.

For this class, the homework assignment will be a recipe generator.  Each week, we will build homework assignments that will apply the theories we've learned in the classroom and build a sub-system to our larger recipe generator system.

# Homework 1

Let us assume that the ingredients are fixed -- in other words, you've got a receipe in mind.  Your program will determine how much for each of the ingredients to include and, of course, you have have to consider how many people you are serving.

Your assignment is to write a Java program that does the following:

1. For each ingredient item, displays the item and ask the user how much to get for that item
2. After all the ingredient has been "measured", ask the user how many people are coming to dinner
3. Base on the information gathered from steps 1 and 2, display a shopping list

The shopping list is simply a listing of items and the amount of the each item. 

Here is a simple example of shopping list for making strawberry smoothies:

```
Strawberry Smoothie

Strawberries.  How many Kg?  0.50
Bananas.  How many bananas?  1
Blueberries.  How many Kg? 0.25

How many people are we serving? 5

Shopping List
2.5 kg strawberries
5 bananas
1.25 kg blueberries
```

Please submit two files:

1. Recipe.java
2. hw1.jar

It is recommended that you export your assignment as a jar and validate it from the commandline.  The command to run your code from the commandline is:

```
java -jar hw1.jar
``` 
