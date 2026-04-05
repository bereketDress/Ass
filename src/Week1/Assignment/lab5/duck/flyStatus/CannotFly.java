package week1.Assignment.Lab5.duck.flyStatus;

import week1.Assignment.Lab5.duck.interfaceType.FlyBehavior;

public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can not fly");

    }
}
