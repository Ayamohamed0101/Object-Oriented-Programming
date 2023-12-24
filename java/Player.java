
package oopsheet;
/*a)  as a float
b) No_of _winners that holds the number of winner players given that 
the player will be winner if his score is larger than 3000
The class has the following methods:
a) A constructer that takes a float and puts it in the score
b) A setter and getter for the score
c) A getter for the number of winners
d) Increment_score that takes a float and adds it to the score
e) Decrement_score that takes a float and subtracts it from the score.
f) Tostring, equals and copy methods
In the main, declare an array of n players and take their scores from the user. Print 
the number of winners*/
public class Player {
    private float score;
    private static int no_of_winners=0;
     public Player(){
        }
    public Player(float n){
        score =n;
        if(n>3000){
            no_of_winners++;
        }
        
    }

    public float getScore() {
        return score;
    }

    public void setScore(float s) {
         if(score>3000 && s<3000)no_of_winners--;
         if(score<3000 && s>3000)no_of_winners++;
        score = s;
       
    }

    public static int getNo_of_winners() {
        return no_of_winners;
    }
  public void increment_score(float s) {
      
         if(score<3000 &&  (score+s)>3000)no_of_winners++;
            score+=s;
    } 
  public void decrement_score(float s) {
      if(score>3000 && (score-s)<3000)no_of_winners--;
         score-=s;
    }

    @Override
    public String toString() {
        return "Player{" + "score= " + score + "}";
    }

   
    public Player copy() {
        return this;
    }


    public boolean equals(Player obj) {       
        return this.score == obj.score;
    }


    
}
