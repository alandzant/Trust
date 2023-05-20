package org.example;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Капитанская Дочка","Пушкин",1852);
        System.out.println(book.ToString());

        Book book1 = new Book("Муму","Тургенев",1852);
        book1.up();
        System.out.println(book1.ToString());

        Book book2 = new Book("Шерлок Холмс","Артур Конан Дойл",1891);
        book2.append("Это элементарно, Ватсон!");
        book2.down();
        System.out.println(book2.ToString());
    }
}