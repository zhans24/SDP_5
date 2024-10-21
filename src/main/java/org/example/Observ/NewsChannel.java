package org.example.Observ;

class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String headline) {
        System.out.println(name + " received a new headline: " + headline);
    }
}
