package ru.mirea.pr1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("lion ", 4);
        Dog d2 = new Dog("Zoom ", 10);
        Dog d3 = new Dog("Biba ");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

    }
}

