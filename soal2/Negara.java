package soal2;

import java.util.*;

class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    // Constructor
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, 
                  int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this(nama, jenisKepemimpinan, namaPemimpin, -1, -1, -1); // Default untuk monarki
    }

    // Method untuk menampilkan detail negara
    public void tampilkanDetail(Map<Integer, String> bulanMap) {
    	if (jenisKepemimpinan.equalsIgnoreCase ("monarki")){
        System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemimpin);
    	}else {
    		System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
            String namaBulan = bulanMap.getOrDefault(bulanKemerdekaan, "Bulan Tidak Valid");
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan);
        }

        System.out.println();
        
    }
}


