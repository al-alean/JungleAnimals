package com.example.admin.jungleanimals;

public class Tiger extends JungleAnimals implements Activities {

    public static int tigerCounts;

    public Tiger(){
        tigerCounts++;
    }

    @Override
    public void makingSound() {
        energyLevel -= 3;
        System.out.println("Tiger making sound ( -3)");
    }

    @Override
    public void eatingFood(String food) {
        if (food != "grain"){
            energyLevel += 5;
            System.out.println("Tiger eating " + food + " ( +5)");
        }else if(food == "grain") {
            System.out.println("Tigers don't eat " + food + " ( 0)");
        }

    }

    @Override
    public void sleeping() {
        energyLevel += 5;
        System.out.println("Tiger sleeping ( +5)");
    }
}
