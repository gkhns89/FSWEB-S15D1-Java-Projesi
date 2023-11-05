package com.wit.grocery.main;

import com.wit.grocery.models.Grocery;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        List<String> sepet = new LinkedList<>();
        startGrocery(sepet);
    }
    public static void startGrocery(List<String> sepet) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("İstediğiniz işlemi seçiniz:");
                int process = scan.nextInt();

                if (process < 0 || process > 2) {
                    System.out.println("Input value must between 0-2");
                }
                if (process == 0) {
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                }
                if (process == 1) {
                    Grocery.addItems(sepet,process);
                }
                if (process == 2) {
                    Grocery.deleteItems(sepet,process);
                }
            }
            catch (Exception exception){
                System.out.println("Geçersiz giriş değeri, programdan çıkılıyor...");
                break;
            }
        }

    }
}