package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1: // Tambah Mahasiswa
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();

                    // Cek apakah NIM sudah ada
                    boolean nimSudahAda = false;
                    for (Mahasiswa m : daftarMahasiswa) {
                        if (m.getNim().equals(nim)) {
                            nimSudahAda = true;
                            break;
                        }
                    }

                    if (nimSudahAda) {
                        System.out.println("NIM sudah ada, gunakan NIM lain.");
                    } else {
                        daftarMahasiswa.add(new Mahasiswa(nama, nim));
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case 2: // Hapus Mahasiswa
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    boolean ditemukan = false;

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim().equals(nimHapus)) {
                            daftarMahasiswa.remove(i);
                            ditemukan = true;
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;

                case 3: // Cari Mahasiswa
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = scanner.nextLine();
                    Mahasiswa mahasiswaDitemukan = null;

                    for (Mahasiswa m : daftarMahasiswa) {
                        if (m.getNim().equals(nimCari)) {
                            mahasiswaDitemukan = m;
                            break;
                        }
                    }

                    if (mahasiswaDitemukan != null) {
                        System.out.println("Data Mahasiswa:");
                        System.out.println("NIM: " + mahasiswaDitemukan.getNim() + ", Nama: " + mahasiswaDitemukan.getNama());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 4: // Tampilkan Daftar Mahasiswa
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa m : daftarMahasiswa) {
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                        }
                    }
                    break;

                case 0: // Keluar
                    System.out.println("Terima kasih!");
                    daftarMahasiswa.clear();
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println(); 
        } while (pilihan != 0);

        scanner.close();
    }
}