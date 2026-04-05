package week1.Assignment.Lab5.duck.sound;

import week1.Assignment.Lab5.duck.interfaceType.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeaking");

    }
}
