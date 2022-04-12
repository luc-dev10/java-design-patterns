package com.javas.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        SingletonConnection singletonConnection = SingletonConnection.getSingletonConnection("Connecting...");
        System.out.println(singletonConnection.connect());
    }
}
