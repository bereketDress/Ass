package week1.Assignment.Lab5.duck;

import week1.Assignment.Lab5.duck.interfaceType.FlyBehavior;
import week1.Assignment.Lab5.duck.interfaceType.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {

    // Duck has composition relationships with behavior objects
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    @Override
    public void quack() {
        quackBehavior.quack();
    }
    @Override
    public void fly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("Swimming");
    }

    public abstract void display();
}
