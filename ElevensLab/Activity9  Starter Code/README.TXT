Questions for Activity 9:

1. The board size shouldn't be abstract because the size is just a value specific
   to each board. Board size isn't a behvaior its an attribute. 
   
2. There are no abstract methods dealing with teh selection of the cards to be
   replaced in the array of cards because it doesn't need it. The individual card 
   doesn't need to be shuffled only the deck does.
   
3. If the Board was an interface isLegal() and anotherPlayIsPossible() would be
   called polymorphically. However using an interface would not work, since 
   there are certain methods that the board class needs to have and in an 
   interface you can only declare methods and not initialize them. 