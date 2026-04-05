package week1.Assignment.Lab5.duck.ducktype;

import week1.Assignment.Lab5.duck.sound.MuteQuack;
import week1.Assignment.Lab5.duck.flyStatus.CannotFly;
import week1.Assignment.Lab5.duck.Duck;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display(){
        System.out.println("display");

    }
}
