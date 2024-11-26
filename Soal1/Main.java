package Soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah dadu
        int jumlahDadu = scanner.nextInt();

        // Membuat LinkedList untuk menyimpan objek Dadu
        LinkedList<Dadu> daduList = new LinkedList<>();

        // Menambahkan objek Dadu ke dalam LinkedList
        for (int i = 0; i < jumlahDadu; i++) {
            daduList.add(new Dadu());  // Setiap dadu akan memiliki nilai acak
        }

        // Menampilkan nilai tiap objek dadu
        int totalNilai = 0;
        for (int i = 0; i < daduList.size(); i++) {
            int nilai = daduList.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
            totalNilai += nilai;  // Menjumlahkan total nilai dadu
        }

        // Menampilkan total nilai dari semua dadu
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        
        scanner.close();
    }
}

