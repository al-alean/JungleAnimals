package com.example.admin.jungleanimals;

public class Snake extends JungleAnimals implements Activities {

    public static int snakeCount;

    public Snake(){
        snakeCount++;
    }
    @Override
    public void makingSound() {
        energyLevel -= 3;
        System.out.println("Snake making sound ( -3)");
    }

    @Override
    public void eatingFood(String food) {
        energyLevel += 5;
        System.out.println("Snake eating " + food + " ( +5)");
    }

    @Override
    public void sleeping() {
        energyLevel += 10;
        System.out.println("Snake sleeping ( +10)");
    }
}
