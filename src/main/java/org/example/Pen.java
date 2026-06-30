package org.example;

public class Pen implements Writer {
    public Pen(){
        System.out.println("Pen is Created...");
    }
    public void write(){
        System.out.println("Writing using pen");
    }
}
