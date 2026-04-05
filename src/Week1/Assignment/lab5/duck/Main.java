package week1.Assignment.Lab5.duck;

import week1.Assignment.Lab5.duck.ducktype.DecoyDuck;
import week1.Assignment.Lab5.duck.ducktype.MallarDuck;
import week1.Assignment.Lab5.duck.ducktype.RedHeadDuck;
import week1.Assignment.Lab5.duck.ducktype.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new MallarDuck(),
                new DecoyDuck(),
                new RedHeadDuck(),
                new RubberDuck()
        };

        for(Duck d: ducks) {
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
            System.out.println();
        }
    }
}