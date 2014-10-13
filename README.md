cs201-fall-2014
===============

Introduction to Programming Fall 2014

One of the goals for this course is to develop good software engineering skills.  We can meet this goal by practicing and adhering good software design principles.  Perhaps the most important aspect of writing good software is the notion of modularity and decomposition.  Modularity (or component-based) approach is to design software systems whose parts (or components) can be glued together to make a larger system.  Decomposition is the idea of separating the system's functionality into smaller (and hopefully) more manageable tasks.

For this class, the homework assignment will be a recipe generator.  Each week, we will build homework assignments that will apply the theories we've learned in the classroom and build a sub-system to our larger recipe generator system.

# Homework 3

It's pretty clear that an unorganized shopping list makes it really hard to shop.  Your recipe generator will now need to sort the output by ingredients.  So the output would be as followed

```
Ingredient              1 (person)      2 (persons)     5 (persons)
Bananas (piece)         1               2               5
Greek Yogurt (ounces)   10              20              50
Strawberries (kg)       5               1.0             2.5
```

You will run program the same way as before:

```
java -jar hw3.jar < ingredient.txt
```


# Homework 2

For this homework assignment, we will expand on our recipe builder.  As you can see that hardcoding the ingredient into a recipe is not a practical way to build your recipe builder.  Instead we will feed (no puns intended) the recipe builder with a list of ingredients which can be listed in a file.

```
# comments line
Strawberries
0.50 kg
Bananas
1 piece
Greek Yogurt
10 ounces
==end==
```

You will feed the above ingredient list into your recipe program with this command:

```
java -jar hw2.jar < ingredient.txt
```

And your program will print a simple shopping table in this format:

```
Ingredient              1 (person)      2 (persons)     5 (persons)
Strawberries (kg)       5               1.0             2.5
Bananas (piece)         1               2               5
Greek Yogurt (ounces)   10              20              50
```
A couple of notes: (1) a line is ignored if it begins with a hashtag `#`, (2) unlike homework 1, you no longer specify the number of people, (3) you should use the <b>System.out.printf(...)</b> method (this will require a little bit of experimentation before you'd get correct.

Finally pay attention to the sentinel key `==end==` to denote the end of the ingredient listing.

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

