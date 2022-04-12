package com.javas.singleton;

public class SingletonConnection {

    private static SingletonConnection singletonConnection;
    private static String connection;

    private SingletonConnection(String connection) {
        SingletonConnection.connection = connection;
    }

    public static SingletonConnection getSingletonConnection(String connection) {
        if (singletonConnection == null)
            singletonConnection = new SingletonConnection(connection);

        return singletonConnection;
    }

    public String connect() {
        return connection;
    }

}
