package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Book;
import com.xworkz.overriding.internal.Novel;

public class BookRunner
{
    public static void main(String[] args) {
        Book book = new Book();
        book.describe();

        Novel novel = new Novel();
        novel.describe();
        novel.readStory();

        Book book1 = new Novel();
        book1.describe();
    }
}
