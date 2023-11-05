package com.wit.grocery.main;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        startGrocery();

    }

    public static void startGrocery() {

        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("İstediğiniz işlemi seçiniz:");
                int process = scan.nextInt();
                if (process < 0 || process >= 2) {

                    System.out.println("Input value must between 0-2");

                }
                if (process == 0) {

                    System.exit(0);
                }
                if (process == 1) {

                    //addItems();


                }
                if (process == 2) {
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    //deleteItems();
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}