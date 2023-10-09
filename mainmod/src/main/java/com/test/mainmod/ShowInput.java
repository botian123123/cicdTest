package com.test.mainmod;

import java.util.ResourceBundle;

public class ShowInput {
    static String env;

    public ShowInput() {
        env = getConfig();
    }

    public static String getEnv() {
        return env;
    }

    public void showEnv() {
        System.out.println("current env. is: " + getEnv());
    }

    private static String getConfig() {
        return ResourceBundle.getBundle("envConfig").getString("app.enviorment");
    }
}
