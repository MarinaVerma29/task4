package in.verma.task4.model;

import in.verma.task4.util.CanSwim;

public class Fish implements CanSwim{
    @Override
    public void swim(){
        eat();
        System.out.println("Я рыбка буль-буль и я плыву!");
    }

    private void eat(){
        System.out.println("Я рыбка и я кушаю.");
    }



}
