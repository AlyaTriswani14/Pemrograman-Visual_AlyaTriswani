// 12S23048 - Grace Caldera Situmorang
// 12S23038- Alya Triswani

import java.util.*;
import java.lang.Math;

class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalkredit, indeks;
        double performa1, performaakhir, nilaiangka;
        String nilaihuruf, kredit;

        totalkredit = (int) 0.0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            nilaihuruf = input.nextLine();
            if (nilaihuruf.equals("A")) {
                nilaiangka = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    nilaiangka = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        nilaiangka = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            nilaiangka = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                nilaiangka = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    nilaiangka = 1.0;
                                } else {
                                    if (nilaihuruf.equals("E")) {
                                        nilaiangka = 0.0;
                                    } else {
                                        nilaiangka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa1 = totalkredit * nilaiangka;
            System.out.println(performa1);
            performaakhir = performa1 + performa1;
            kredit = input.nextLine();
        }
    }
}
