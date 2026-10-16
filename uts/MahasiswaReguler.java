package uts;

public class MahasiswaReguler extends Mahasiswa {

    public MahasiswaReguler(String nim, String nama, int sks) {
        super(nim, nama, sks);
    }

    @Override
    public int hitungUKT() {
        return super.hitungUKT() + 500000;
    }

    @Override
    public String getJenis() {
        return "Reguler";
    }
}