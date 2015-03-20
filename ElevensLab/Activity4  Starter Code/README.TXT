Questions for Activity 4:
1. public static String flip(){
        
        //ratio = countHeads/countTails;
        
        if(countHeads < 2){
            //System.out.println("ratio: "+ratio);
            countHeads++;
            return heads;   
        }
        
        else{ 
            countTails=0;
            countHeads=0;
            return tails;
        }
    }
2. public static boolean arePermutations(int[] arry1, int[] arry2){
		int count=0;
		if(arry1.length == arry2.length){
			for(int i=0;i<arry1.length;i++){
				
				for(int j=0; j<arry1.length;j++){
					if(arry1[i] == arry2[j]){
						count++;
						if(count == arry1.length){
							return true;
						}
					}
				}
			}
		}
		return false;
		
	}

3. values should be in the order of {2,3,4,1}   


Questions for Activity 5:

1. isEmpty() should check for the size of the of the deck <= 0 and return 
true if this condition is statisfied.

2. deck constructor has not been initialized correctly

3. assertion should be allMatch not !allMatch otherwise it is recieving the 
opposite value of allMatch.
 
4. deck constructor has not been initialized correctly

5. shuffle() k should never have a value less than 0 because the arraylist 
index starts froma  position of zero. 


Questions for Activity 6:
1. Combinations: 
   - 5 of spades and 6 of clubs
   - 5 of clubs and 6 of clubs

2. In the game there are only 2 possible legal movements
   a. a sum with the total of 11
   b. jack,queen,king selected in any order
   therefore jack,queen,king can only be the possible cards left if the deck is empty
   
3. The game depends on the computer generated shuffle/deal and on strategy. And if there 
   are multiple ways to play a legal move it does matter what move is playd first. It could
   be possible that the first move choosen could lead into a loss while the other move if 
   chosen first would have lead to a in.
   
   
   
   
   