package com.example.admin.jungleanimals;

public class Monkey extends JungleAnimals implements Activities {

    public static int monkeyCounts;

    public Monkey(){
        monkeyCounts++;
    }

    @Override
    public void makingSound() {
        energyLevel -= 4;
        System.out.println("Monkey making sound ( -4)");
    }

    @Override
    public void eatingFood(String food) {
        energyLevel += 2;
        System.out.println("Monkey eating " + food + " ( +2)");
    }

    @Override
    public void sleeping() {
        energyLevel += 10;
        System.out.println("Monkey sleeping ( +10)");
    }

    public void play(){
        if(energyLevel >= 8){
            energyLevel -= 8;
            System.out.println("Monkey playing Oooo Oooo Oooo  ( -8)");
        }else {
            System.out.println("Monkey is too tired");
        }
    }
}
