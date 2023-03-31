package com.tomoripertamina;

import java.util.Scanner;

public class Fibonanci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0, y = 1, z = 0,a =0;

        System.out.println("Masukan Jumlah Bilangan Fibonanci : ");
        a = input.nextInt();
        for (int i = 0; i < a; i++){
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + "");
        }
    }
}
