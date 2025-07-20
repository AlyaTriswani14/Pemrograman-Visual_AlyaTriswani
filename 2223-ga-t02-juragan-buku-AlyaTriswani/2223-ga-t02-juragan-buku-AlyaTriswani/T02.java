// 12S23048 - Grace Caldera Situmorang
// 12S23038 - Alya Triswani

import java.util.*;
import java.lang.Math;

class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok;
        String judul, penulis, penerbit, formatbukuelektronik, iSBN, kategori, tahunterbit;
        double hargapembelian, minimummargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        kategori = "Average";
                    } else {
                        if (rating < 3.0) {
                            kategori = "Low";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
