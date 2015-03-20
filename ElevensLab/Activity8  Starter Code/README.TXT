Questions for Activity 8:

1. Similarities:
   - extend from board
   
   Differences:
   - board size
   
   - deck: in elevens and tens the deck contains ace thru king while in the game of thirteens
     the deck will contain ace thru queen
     
   - override anotherPlayIsPossible() because sum will be different and in the game of tens
     the cards needs to be in the same rank
     
   - override isLegal() because sum will be different and the legal movements are different 
     in each of the games. 
     
   - containsJQK() because it won't necessary in the thirteens game because the king is removed
     and jack and queen are given a number value. But in the tens game this method will be altered
     to check for a face card of the same rank. 

2. The instance variables in the Board class are initialized through the constructor of the 
   ElevensBoard class.
   
3. Yes because anotherPlayIsPossible() and isLegal() needs to have a sum of 11
   while in the tens and thirteens board the methods will check for a different sum. In
   the game of tens anotherPlayIsPossible() and isLegal() will have to check for
   the same rank of each face card that is selected unlike elevens which checks
   for contains jack, queen, and king. Also in the game of thirteens there is no
   king and the cards up to queen are given a number value therefore does not need
   to check for face cards. 