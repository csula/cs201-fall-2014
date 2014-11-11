cs201-fall-2014
===============

Introduction to Programming Fall 2014

One of the goals for this course is to develop good software engineering skills.  We can meet this goal by practicing and adhering good software design principles.  Perhaps the most important aspect of writing good software is the notion of modularity and decomposition.  Modularity (or component-based) approach is to design software systems whose parts (or components) can be glued together to make a larger system.  Decomposition is the idea of separating the system's functionality into smaller (and hopefully) more manageable tasks.

For this class, the homework assignment will be a recipe generator.  Each week, we will build homework assignments that will apply the theories we've learned in the classroom and build a sub-system to our larger recipe generator system.

# Homework 5 (CS201 Section)

Consider lab 11 and answer the following questions.

"the quick brown fox jumps over the lazy dog"

1. Write a program that finds the shortest word and print it out along with the word's length

   java -jar shortestword.jar < textfile.txt 

2. Write a program that finds all the shortest words and print them out

3. Write a program that prints out the first two shortest words

4. Do at home: 
   (a) repeat for longest words
   (b) print out the shortest words but only once

5. Write a program that sorts the words of the line and print them out in alphebetical order

6. Write a program that prints out the words in an array only once (hint: sort it first)

7. Write a program that prints each word of an array and how many times that word appears!

8. Do at home:
   (a) repeat #7 but use nested loops

For homework assignment, only do question 4b and 8a.

# Homework 4 (CS201 Section)

Let us assume the following information:

1. A string can be splitted into an array of string:

```
String[] array = "this is a string".split("\\s+");
```

In the above example, "this is string" is splitted into 4 words (separated by a white space `\\s+`.

2. We've learned how to read contents of a for our recipe reading assignment (homework 2).

For this homework assignment given a text file.  Read in the content of the text file and printout the total number of words found in your document.

To run the program you'd do the following:

```
java -jar hw4.jar < textfile.txt
```

Your program should then print out the total number of words found in `textfile.txt`

# Homework 4 (CS202 Section)

Your homework task is to "redo" homework 2.  This time you will design three classes: `Recipe`, `Ingredient`, and `Instruction`.  You will now have a main application `App` this application is the driver for your program (we will cover this more in class).

Obviously the `Instruction` class is much more complicated so we won't implement it this homework assignment.  Instead you can simply create an `Instruction.java` file as followed:

```
class Instruction {
  private int step;
  private String task;
  private int nextStep;
} 
```
So now you will have to consider some relationships:

1. Recipe has more than one Ingredient
2. Recipe has more than one Instruction
3. Recipe can sort Ingredients
4. Recipe can print Ingredients (print shopping list)
5. Application has more than one recipe
6. Each Recipe is built using a text file

Note that you do not need to implement the sort functionality for this assignment.  

Your homework is due: 2 November 2014.  If you need more time let me know. 

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

