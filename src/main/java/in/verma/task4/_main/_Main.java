package in.verma.task4._main;

import in.verma.task4.event_executor.SwimExecutor;
import in.verma.task4.model.Fish;
import in.verma.task4.model.Ship;

public class _Main {
    public static void main(String[]args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        SwimExecutor swimExecutor = new SwimExecutor();
        SwimExecutor.makeSwim(fish);
        SwimExecutor.makeSwim(ship);




    }
}
