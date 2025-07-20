// 12S23038 - Alya Triswani
// 12S23048 - Grace Caldera Situmorang

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];
        int i;

        i = 0;
        func_default(i, nama);
        inputbuddies(i, nama);
        outputbuddies(i, nama);
    }
    
    public static void func_default(int i, String[] nama) {
        for (i = 0; i <= 3; i++) {
            nama[i] = "";
        }
    }
    
    public static void inputbuddies(int i, String[] nama) {
        for (i = 0; i <= 3; i++) {
            nama[i] = input.nextLine();
            if (nama[i].equals("---")) {
                nama[i] = "";
                i = 3;
            }
        }
    }
    
    public static void outputbuddies(int i, String[] nama) {
        for (i = 0; i <= 3; i++) {
            System.out.println(nama[i]);
        }
    }
}

