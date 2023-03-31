package com.tomoripertamina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Masukan jumlah perulangan : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukan jumlah angka : ");
        b = input.nextInt();
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= b; j++) {
                System.out.print(j);
            }
                System.out.println();
        }

        for (int k = 1; k <= a; k++) {
            for (int l = b; l >= 1; l--) {
                System.out.print(l);
                    if (l == 1) {
                        System.out.println();
                    }
            }
        }
    }
}
