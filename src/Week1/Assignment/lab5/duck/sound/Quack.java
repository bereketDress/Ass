package week1.Assignment.Lab5.duck.sound;

import week1.Assignment.Lab5.duck.interfaceType.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quacking");

    }
}
