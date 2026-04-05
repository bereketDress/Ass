package week1.Assignment.Lab5.duck.ducktype;

import week1.Assignment.Lab5.duck.Duck;
import week1.Assignment.Lab5.duck.flyStatus.FlyWithWings;
import week1.Assignment.Lab5.duck.sound.Quack;

public class MallarDuck extends Duck {
    public MallarDuck() {
        flyBehavior =new FlyWithWings();
        quackBehavior =new Quack();
    }
    @Override
    public void display(){
        System.out.println("display");

    }
}
