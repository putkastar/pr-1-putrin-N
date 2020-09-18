package ru.mirea.pr1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Думай и богатей","Наполеон Хилл", 350, 750);
        Book d2 = new Book("451 градус по Фаренгейту","Рей Брэдбери", 200, 300);
        Book d3 = new Book("Мастер и Маргарита","Михаил Булгаков", 440, 200);
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();
    }
}
