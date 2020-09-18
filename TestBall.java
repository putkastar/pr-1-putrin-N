package ru.mirea.pr1;

public class TestBall {
      public static void main(String[] args) {
     Ball b1 = new Ball(20, 40);
     Ball b2 = new Ball(10, 100);
     Ball b3 = new Ball(150, 70);
     Ball b4 = new Ball(60, 80);
     System.out.println(b1);
     System.out.println(b2);
     System.out.println(b3);
     System.out.println(b4);
     b1.move(40, 15);
     b2.move(70, 40);
     b3.move(30, 60);
     b4.move(50, 70);
     System.out.println(b1);
     System.out.println(b2);
     System.out.println(b3);
     System.out.println(b4);
      }
}
