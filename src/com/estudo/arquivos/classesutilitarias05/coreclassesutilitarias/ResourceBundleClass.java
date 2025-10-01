package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClass {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.of("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println("-----");

        ResourceBundle bundle2 = ResourceBundle.getBundle("message", Locale.of("pt", "BR"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));

        System.out.println("-----");

        System.out.println(bundle.getString("hi"));
    }
}
