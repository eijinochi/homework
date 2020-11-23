package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ballOne = new Ball();

        ballOne.color = "BLUE";
        ballOne.price = 20;
        ballOne.radius = 6;
        ballOne.producerCountry = "GERMANY";

        System.out.println(ballOne.color + " " + ballOne.price + " " + ballOne.producerCountry);
    }
}
