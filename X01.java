// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHEAN

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double total, harga, transaksi, hargapalingmurah;

        harga = Double.parseDouble(input.nextLine());
        total = harga;
        hargapalingmurah = harga;
        while (harga != 0) {
            if (hargapalingmurah < harga) {
                hargapalingmurah = hargapalingmurah;
            } else {
                hargapalingmurah = harga;
            }
            harga = Double.parseDouble(input.nextLine());
            total = harga + total;
        }
        if (total >= 100) {
            transaksi = total - hargapalingmurah;
        } else {
            transaksi = total;
        }
        System.out.println(toFixed(transaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
