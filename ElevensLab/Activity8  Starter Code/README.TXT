Questions for Activity 8:

1. Similarities:
   - extend from board
   - containsJQK() since all three face card values is legal
   
   Differences:
   - board size
   - override anotherPlayIsPossible() because sum will be different
   - overrid isLegal() because sum will be different

2. Inside Board private instance variables are declared. Once the ElevensBoard extends 
   Board the ElevensBoard does not have access to the priavte instance variables in 
   Board therefore the Elevensboard must create its own in
   
3. Yes because anotherPlayIsPossible() and isLegal() needs to have a sum of 11
   while in the other two boards the methods will check for a different sum. 