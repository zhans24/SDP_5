package org.example.Observ;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        newsAgency.add(channel1);
        newsAgency.add(channel2);

        newsAgency.setLatestHeadline("Breaking News: Observer Pattern Implemented!");
        newsAgency.setLatestHeadline("New Java Features Released!");

        newsAgency.remove(channel1);
        newsAgency.setLatestHeadline("Another Headline: Observer Removed!");
    }
}
