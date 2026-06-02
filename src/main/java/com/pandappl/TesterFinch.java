package com.pandappl;

public class TesterFinch {
    
public static void main(String[] args) {
    FinalFinch bird = new FinalFinch("A");
   bird.playNote(60,1);
    bird.setBeak(60, 50, 70);
    bird.playNote(61,2);
  
//   // make the box
    bird.setMove("F", 10, 100);
    bird.setTurn("L", 90, 100);
    bird.setMove("F", 10, 100);
    bird.setTurn("L", 90, 100);
    bird.setMove("F", 10, 100);
   
//    // the top
    bird.setTurn("L", 45, 100);
    bird.setMove("F", 8, 100);
    bird.setTurn("L", 100, 100);
    bird.setMove("F", 8, 100);
   

//     // back to bottom right
    bird.setTurn("L", 129.7, 100);
    bird.setMove("F", 10.5, 100);
    bird.setTurn("R", 89.5, 100);
    bird.setMove("F", 10, 100);
    
//     // form the thrusters
    bird.setTurn("L", 45, 100);
    bird.setMove("F", 10, 100);
  
  
    bird.setTurn("R", 140, 100);
//     bird.setMove("F", 8, 100);
   
    
      




    bird.playNote(63,3);
    
    
    
}



}
