package com.example.admin.jungleanimals;

public class MainClass {

    public static void main(String [] args){
        Tiger tiger1 = new Tiger();
        System.out.println("Tiger" + Tiger.tigerCounts);
        tiger1.makingSound();
        System.out.println("Energy Level: " + tiger1.energyLevel);

        Tiger tiger2 = new Tiger();
        System.out.println("Tiger" + Tiger.tigerCounts);
        tiger2.makingSound();
        tiger2.eatingFood("grain");
        System.out.println("Energy Level: " + tiger2.energyLevel);

        Tiger tiger3 = new Tiger();
        System.out.println("Tiger" + Tiger.tigerCounts);
        tiger3.makingSound();
        tiger3.sleeping();
        System.out.println("Energy Level: " + tiger3.energyLevel);

        Tiger tiger4 = new Tiger();
        System.out.println("Tiger" + Tiger.tigerCounts);
        tiger4.makingSound();
        tiger4.eatingFood("meat");
        System.out.println("Energy Level: " + tiger4.energyLevel);

        System.out.println("------------------------------------------");

        Monkey monkey1 = new Monkey();
        System.out.println("Monkey" + Monkey.monkeyCounts);
        monkey1.makingSound();
        System.out.println("Energy Level: " + monkey1.energyLevel);

        Monkey monkey2 = new Monkey();
        System.out.println("Monkey" + Monkey.monkeyCounts);
        monkey2.makingSound();
        monkey2.eatingFood("grain");
        System.out.println("Energy Level: " + monkey2.energyLevel);

        Monkey monkey3 = new Monkey();
        System.out.println("Monkey" + Monkey.monkeyCounts);
        monkey3.makingSound();
        monkey3.sleeping();
        monkey3.play();
        System.out.println("Energy Level: " + monkey3.energyLevel);

        Monkey monkey4 = new Monkey();
        System.out.println("Monkey" + Monkey.monkeyCounts);
        monkey4.sleeping();
        monkey4.play();
        System.out.println("Energy Level: " + monkey4.energyLevel);

        System.out.println("------------------------------------------");

        Snake snake1 = new Snake();
        System.out.println("Snake" + Snake.snakeCount);
        snake1.makingSound();
        System.out.println("Energy level: " + snake1.energyLevel);

        Snake snake2 = new Snake();
        System.out.println("Snake" + Snake.snakeCount);
        snake2.makingSound();
        snake2.eatingFood("bugs");
        System.out.println("Energy level: " + snake2.energyLevel);

        Snake snake3 = new Snake();
        System.out.println("Snake" + Snake.snakeCount);
        snake3.makingSound();
        snake3.eatingFood("meat");
        snake3.sleeping();
        System.out.println("Energy level: " + snake3.energyLevel);

    }
}
