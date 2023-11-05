package com.wit.grocery.models;

import java.util.List;
import java.util.Scanner;

public class Grocery {

    public static void addItems(List<String> groceryList){

        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
        String input = getInput();

        if (input.contains(",")){
            String[] products = input.split(",");
            for (String product: products)
            {
                if (product != null && product.trim().isEmpty()){

                    groceryList.add(product.trim());
                }
            }


        }



    }

    private static String getInput() {
        Scanner getScan = new Scanner(System.in);
        return getScan.nextLine();
    }


}
