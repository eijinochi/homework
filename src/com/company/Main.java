package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ballOne = new Ball();

        ballOne.color = "BLUE";
        ballOne.price = 20;
        ballOne.radius = 6;
        ballOne.producerCountry = "GERMANY";

        System.out.println(ballOne.color + " " + ballOne.price + " " + ballOne.radius + " " + ballOne.producerCountry);
        Student studentOne = new Student();
        studentOne.growth = 187;
        studentOne.name = "Eiji";
        studentOne.grade = 11;

        Student studentTwo = new Student();
        studentTwo.growth = 170;
        studentTwo.name = "Kirito";
        studentTwo.grade = 11;

        Student studentThree = new Student();
        studentThree.growth = 185;
        studentThree.name = "Clain";
        studentThree.grade = 11;

        System.out.println(studentOne.name + ": " + studentOne.growth + "sm , " + studentOne.grade + "th grade");
        System.out.println(studentTwo.name + ": " + studentTwo.growth + "sm , " + studentTwo.grade + "th grade");
        System.out.println(studentThree.name + ": " + studentThree.growth + "sm , " + studentThree.grade + "th grade");

        Smartphone iPhone = new Smartphone();
        iPhone.name = "iPhone 12 Pro Max";
        iPhone.ram = 3;
        iPhone.rom = 128;
        iPhone.camera = 64;
        iPhone.cpu = "A14 Bionic";
        iPhone.battery = 2800;
        iPhone.touchpad = "Super Amoled";

        Smartphone Samsung = new Smartphone();
        Samsung.name = "Samsung Galaxy S20 Ultra";
        Samsung.ram = 8;
        Samsung.rom = 128;
        Samsung.camera = 64;
        Samsung.cpu = "Exynos 980";
        Samsung.battery = 4100;
        Samsung.touchpad = "Super Amoled";

        Smartphone Xiaomi = new Smartphone();
        Xiaomi.name = "Xiaomi Mi 9T Pro";
        Xiaomi.ram = 6;
        Xiaomi.rom = 64;
        Xiaomi.camera = 48;
        Xiaomi.cpu = "Snapdragon 855";
        Xiaomi.battery = 4180;
        Xiaomi.touchpad = "IPS";

        System.out.println(iPhone.name + ": \nRAM: " + iPhone.ram + "\nROM: " + iPhone.rom + "\nCamera: " + iPhone.camera + "mpx \nCPU: " + iPhone.cpu + " \nBattery: " + iPhone.battery + "mah \nTouchpad: " + iPhone.touchpad);
        System.out.println(Samsung.name + ": \nRAM: " + Samsung.ram + "\nROM: " + Samsung.rom + "\nCamera: " + Samsung.camera + " mpx \nCPU: " + Samsung.cpu + " \nBattery: " + Samsung.battery + "mah \nTouchpad: " + Samsung.touchpad);
        System.out.println(Xiaomi.name + ": \nRAM: " + Xiaomi.ram + " \nROM: " + Xiaomi.rom + " \nCamera: " + Xiaomi.camera + " mpx \nCPU: " + Xiaomi.cpu + " \nBattery: " + Xiaomi.battery + "mah \nTouchpad: " + Xiaomi.touchpad);

    }
}
