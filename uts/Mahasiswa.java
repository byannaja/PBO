package uts;

public abstract class Mahasiswa {
    protected String nim;
    protected String nama;
    protected int sks;
    private Dosen dosenWali;

    public Mahasiswa(String nim, String nama, int sks) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
    }

    public void setDosenWali(Dosen dosenWali) {
        if (dosenWali != null) {
            this.dosenWali = dosenWali;
        }
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public String getNama() {
        return nama;
    }

    public int hitungUKT() {
        return 150000 * sks;
    }

    public abstract String getJenis();
}