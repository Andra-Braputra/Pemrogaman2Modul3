package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // HashMap untuk menyimpan daftar nama bulan
        Map<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        // LinkedList untuk menyimpan objek Negara
        LinkedList<Negara> negaraList = new LinkedList<>();

        int jumlahNegara = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                int tanggalKemerdekaan = scanner.nextInt();
                int bulanKemerdekaan = scanner.nextInt();
                int tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine(); 

                negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, 
                                          tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
            } else {
                negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            }
        }

        for (Negara negara : negaraList) {
            negara.tampilkanDetail(bulanMap);
        }
        scanner.close();
    }
}
