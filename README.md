# Project Snack Bar

A student that completes this project shows that they can:

* Understand what makes Java a programming language worth studying
* Explain the basic concept of Object Oriented Programming and how they relate to Java
* Create and manipulate the base Java types which include Boolean, byte, char (including Strings), short, int, long, float, and double
* Craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods and instantiate and use Objects of these classes

## Introduction

Variations on the Snack Bar Project have been part of Java Education since Java was created. So, we will do one. The point is to set up vending machines where a person buys snacks from those machines.

Classes should include:

### Snack

Snack has fields (so knows)

* maxId - keep track of last used snack id
* id - automatically generated field
* name
* quantity
* cost
* vending machine id

Snack has methods (so can)

* get id
* set and get name
* set and get cost
* set and get vending machine id
* get quantity
* add quantity when given how many to add
* buy snack when given how many to buy
* get total cost given a quantity

### VendingMachine

Vending machine has fields (so knows)

* maxId - keep track of last used vending machine id
* id - automatically generated field
* name

Vending Machine has methods (so can)

* get id
* set and get name

### Customer

Customer has fields (so knows)

* maxId - keep track of last used customer id
* id - automatically generated field
* name
* cash on hand

Customer has methods (so can)

* get id
* set and get name
* add cash to cash on hand
* get cash on hand
* buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

### MPV

The MVP of this application would produce the following output

```TEXT
Customer 1 cash on hand 37.75
Quantity of snack 4 is 21

Customer 1 cash on hand 35.75
Quanity of snack 3 is 29

Customer 2 cash on hand 28.14
Quantity of snack 4 is 19

Customer 1 cash on hand 45.75

Customer 1 cash on hand 44.75
Quantity of snack 2 is 35

Quantity of snack 3 is 41

customer 2 cash on hand 22.14
Quantity of snack 3 is 38
```

### Stretch Goals

The Stretch Goals would produce the following output. Yes output from the MVP is included in this output!

```TEXT
Customer 1 cash on hand $37.75
Quantity of snack 4 is 21

Customer 1 cash on hand $35.75
Quanity of snack 3 is 29

Customer 2 cash on hand $28.14
Quantity of snack 4 is 19

Customer 1 cash on hand $45.75

Customer 1 cash on hand $44.75
Quantity of snack 2 is 35

Quantity of snack 3 is 41

customer 2 cash on hand $22.14
Quantity of snack 3 is 38

Stretch Goals

Snack: Chips
Vending Machine: Food
Quantity: 36
Total Cost: $63.00

Snack: Chocolate Bar
Vending Machine: Food
Quantity: 35
Total Cost: $35.00

Snack: Pretzel
Vending Machine: Food
Quantity: 38
Total Cost: $76.00

Snack: Soda
Vending Machine: Drink
Quantity: 19
Total Cost: $47.50

Snack: Water
Vending Machine: Drink
Quantity: 20
Total Cost: $55.00
```

## Instructions

* [X] Please fork and clone this repository. This repository does not have a starter project, so create one inside of the cloned repository folder. Regularly commit and push your code as appropriate.

### The Objects Needed

Create the classes mentioned above and then instantiate these objects from those classes

* [X] Snack
* [X] VendingMachine
* [X] Customer

* [X] Instantiate 2 customers
  * [X] Jane with $45.25
  * [X] Bob with $33.14

* [X] Instantiate 3 Vending Machines
  * [X] Food
  * [X] Drink
  * [X] Office

* [X] Instantiate 5 snacks
  * [X] In Vending Machine Food
    * [X] 36 Chips at $1.75
    * [X] 36 Chocolate Bar at $1.00
    * [X] 30 Pretzel at $2.00
  * [X] In Vending Machine Drink
    * [X] 24 Soda at $2.50
    * [X] 20 Water at $2.75

### Processing

* [X] Customer 1 (Jane) buys 3 of snack 4 (Soda).
  * [X] Print Customer 1 (Jane) Cash on hand.
  * [X] Print quantity of snack 4 (Soda).
* [X] Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
  * [X] Print Customer 1 (Jane) Cash on hand.
  * [X] Print quantity of snack 3 (Pretzel).
* [X] Customer 2 (Bob) buys 2 of snack 4 (Soda).
  * [X] Print Customer 2 (Bob) Cash on Hand.
  * [X] Print quantity of snack 4 (Soda).
* [X] Customer 1 (Jane) finds $10.
  * [X] Print Customer 1 (Jane) Cash on Hand.
* [X] Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
  * [X] Print Customer 1 (Jane) Cash on Hand.
  * [X] Print quantity of snack 2 (Chocolate Bar).
* [X] Add 12 more items to snack 3 (Pretzel).
  * [X] Print quantity of snack 3 (Pretzel).
* [X] Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
  * [X] Print Customer 2 (Bob) Cash on hand.
  * [X] Print quantity of snack 3 (Pretzel).

### Stretch Goals

* [ ] Display each snack with
  * [ ] Name
  * [ ] Vending Machine Name
  * [ ] Quantity on hand
  * [ ] Total cost of all of the quantities of this snack on hand
* [ ] Format all dollar amount like $1,234.56
  * [ ] Starts with a dollar sign
  * [ ] comma separating group of 3 numbers
  * [ ] rounded to the nearest cents, hundredths place
