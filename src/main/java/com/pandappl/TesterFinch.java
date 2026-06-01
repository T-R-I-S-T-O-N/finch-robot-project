package com.pandappl;

public class TesterFinch {
    
public static void main(String[] args) {
    FinalFinch bird = new FinalFinch("A");
   bird.playNote(60,1);
    bird.setBeak(60, 50, 70);
    bird.playNote(61,2);
    bird.setMove("F", 10, 100);
    bird.setTurn("L", 90, 100);
    bird.setMove("F", 10, 100);
    bird.setTurn("L", 90, 100);
    bird.setMove("F", 10, 100);
    bird.setTurn("L", 45, 100);
    bird.setMove("F", 8, 100);
    bird.setTurn("L", 100, 100);
    bird.setMove("F", 8, 100);
    bird.setTurn("L", 130, 100);
    bird.setMove("F", 10, 100);
    bird.setTurn("R", 90, 100);
    bird.setMove("F", 10, 100);
    bird.setTurn("R", 90, 100);
    bird.setMove("F", 3, 1);
    bird.setTurn("R", 90, 100);
    bird.setMove("F", 5, 100);
    bird.setTurn("L", 90, 100);
    bird.setMove("F", 2, 100);
    bird.setTurn("L", 90, 100);
    bird.setMove("F", 5, 100);
      




    bird.playNote(63,3);
    
    
    //bird.setTurn("L", 90, 100);
    //bird.playNote(64,4);
   // bird.setMove("B", 5, 100);
   // bird.setTurn("L", 90, 100);
   // bird.setMove("B", 5, 100);
   // bird.setTurn("L", 90, 100);
   // bird.setMove("B", 5, 100);
   // bird.setTurn("L", 90, 100);
   // bird.setBeak(60, 20, 20);
}



}
