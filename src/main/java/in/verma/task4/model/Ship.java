package in.verma.task4.model;

import in.verma.task4.util.CanSwim;

public class Ship implements CanSwim {

    @Override
    public void swim(){
        fuel();
        System.out.println("Я кораблик и я плыву!");

    }

    private void fuel(){
        System.out.println("Я кораблик и я запрввляюсь топливом");
    }
}
