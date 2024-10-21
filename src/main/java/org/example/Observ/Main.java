package org.example.Observ;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel first = new NewsChannel("1");
        NewsChannel  second = new NewsChannel("2");

        newsAgency.add(first);
        newsAgency.add(second);

        newsAgency.setLatestHeadline("hello");
        newsAgency.setLatestHeadline("Bye");

        newsAgency.remove(first);
        newsAgency.setLatestHeadline("zhasik");
    }
}
