Questions for Activity 7:

1. Instance Variables
   - String[] ranks;
   - String[] suits;
   - int[] pointValues
   - boardsize;
   - Card[] cards;

2. public boolean isLegal(List<Integer> selectedCards) {
        int face=0;
        for(int i=0; i<selectedCards.size(); i++){
            if(selectedCards.get(i)==0){
                face++;
                if(face==3 || containsPairSum11(selectedCards) == true){
                    return true;
                }
            }
        }
        return false;
    }

3. States needed: Card, ElevensGUI, CardGameGUI, Board, Deck, Card
   Behaviors need to be implemented: isLegal(), anotherPlayIsPossible
   
4a. dealMyCards() is called in the constructor

4b. methods:
    - anotherPlayIsPossible()
    - isLegal()
4c. returned List:
    - jack of hearts, 6 of clubs, 2 spades, ace of spades, 4 of hearts

4d. public static String printCards(ElevensBoard board){
    List<Integer> cIndexes = board.card(Indexes);
    int indexVal;
    
    for(int i=0; i<cIndexes.size(); i++){
        indexVal=c.Indexes.get(i);
        str+=indexVal;}
        
4e. both???
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        