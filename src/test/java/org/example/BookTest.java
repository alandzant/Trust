package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    void up() {
        Book book = new Book("Капитанская дочка", "Пушкин", 1825);
        int expect = 4;
        book.up();
        int result = book.rating;


        Assertions.assertEquals(expect,result);
    }

    @Test
    void down() {
        Book book = new Book("Капитанская дочка", "Пушкин", 1825);
        int expect = 2;
        book.down();
        int result = book.rating;

        Assertions.assertEquals(expect,result);
    }

    @Test
    void append() {
        Book book = new Book("Шерлок Холмс","Артур Конан Дойл",1891);
        String expect = "[3] Шерлок Холмс Артур Конан Дойл (1891)  Это элементарно, Ватсон!";
        book.append("Это элементарно, Ватсон!");
        String result = book.ToString();

        Assertions.assertEquals(expect, result);

    }
}