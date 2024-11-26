package Soal1;

import java.util.Random;

class Dadu {
    private int nilai;

    // Constructor
    public Dadu() {
        acakNilai();
    }

    // Method untuk menghasilkan nilai acak antara 1 hingga 6
    public void acakNilai() {
        Random random = new Random();
        this.nilai = random.nextInt(6) + 1; 
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}

