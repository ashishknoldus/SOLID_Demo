package com.dip;

public class Book implements Product{

    @Override
    public void seeReviews() {
        System.out.println("The book is awesome");
    }

    @Override
    public void getSample() {
        System.out.println("Book.getSample");
    }
}
