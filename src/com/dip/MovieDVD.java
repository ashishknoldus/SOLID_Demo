package com.dip;

public class MovieDVD implements Product{

    @Override
    public void seeReviews() {
        System.out.println("Movie is one time watch");
    }

    @Override
    public void getSample() {
        System.out.println("MovieDVD.getSample");
    }
}
