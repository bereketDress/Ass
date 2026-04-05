package week1.Assignment.Lab5.duck.ducktype;

import week1.Assignment.Lab5.duck.flyStatus.CannotFly;
import week1.Assignment.Lab5.duck.Duck;
import week1.Assignment.Lab5.duck.sound.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }
    @Override
    public void display(){
        System.out.println("display");

    }
}
