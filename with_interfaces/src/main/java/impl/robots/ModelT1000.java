package impl.robots;// Created by Neginskiy Gregoriy.

import interfaces.AbstractRobot;
import interfaces.parts.Hand;
import interfaces.parts.Head;
import interfaces.parts.Leg;

public class ModelT1000 implements AbstractRobot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }



    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("T1000 will destroy everything!");
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing right now!");
    }
}
