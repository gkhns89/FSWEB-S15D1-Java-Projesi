package com.wit.grocery.models;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static void addItems(List<String> groceryList, Integer type) {

        System.out.println("Eklenmesini istediğiniz elemanları giriniz:");
        String input = getInput().trim().toLowerCase();

        if (input.contains(",")) {
            String[] products = input.split(",");
            for (String product : products) {
                if (!isEmpty(product, type) && !isExist(groceryList, product)) {
                    System.out.println("Ekleniyor..." + product);
                    groceryList.add(product.trim());
                }
            }
            printSorted(groceryList);
        } else {
            if (!input.isEmpty() && !isExist(groceryList, input)) {
                System.out.println("Ekleniyor..." + input);
                groceryList.add(input);
                printSorted(groceryList);
            }
        }
    }

    public static void deleteItems(List<String> groceryList, Integer type) {

        System.out.println("Çıkarılmasını istediğiniz elemanları giriniz:");
        String input = getInput().trim().toLowerCase();

        if (input.contains(",")) {
            String[] products = input.split(",");
            for (String product : products) {
                if (!isEmpty(product, type) && isExist(groceryList, product)) {

                    System.out.println("Siliniyor..." + product);
                    groceryList.remove(product.trim());

                } else {
                    System.out.println("Silmek istediğiniz ürün sepette mevcut değil!");
                }
            }
            printSorted(groceryList);
        } else {
            if (!input.isEmpty() && isExist(groceryList, input)) {
                System.out.println("Siliniyor..." + input);
                groceryList.remove(input);
                printSorted(groceryList);
            }
        }
    }

    public static boolean isEmpty(String productToBeChecked, Integer controlType) {

        if (controlType == 1) {
            if (productToBeChecked.trim().isEmpty()) {
                System.out.println("Sepete eklenmeye çalışılan değer boş!");
                return true;
            } else {
                return false;
            }

        } else if (controlType == 2) {
            if (productToBeChecked.trim().isEmpty()) {
                System.out.println("Sepetten silinmeye çalışılan değer boş!");
                return true;
            } else {
                return false;
            }

        } else {
            System.out.println("Girilen değer kontrol hatası!");
            return true;
        }
    }

    public static boolean isExist(List<String> listToBeChecked, String productToBeChecked) {
        if (listToBeChecked.contains(productToBeChecked)) {
            System.out.println("İlgili ürün sepette mevcut!");
        }
        return listToBeChecked.contains(productToBeChecked);
    }

    private static String getInput() {
        Scanner getScan = new Scanner(System.in);
        return getScan.nextLine();
    }

    private static void printSorted(List<String> tobePrinted) {
        if (tobePrinted.isEmpty()) {
            System.out.println("Sepetiniz boş");
        } else {
            Collections.sort(tobePrinted);
            System.out.println(tobePrinted);
        }
    }
}
