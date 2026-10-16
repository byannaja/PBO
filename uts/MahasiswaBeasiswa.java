package uts;

public class MahasiswaBeasiswa extends Mahasiswa {
    private int persenBeasiswa;

    public MahasiswaBeasiswa(String nim, String nama, int sks,
                             int persenBeasiswa) {
        super(nim, nama, sks);

        if (persenBeasiswa < 0) {
            persenBeasiswa = 0;
        } else if (persenBeasiswa > 100) {
            persenBeasiswa = 100;
        }

        this.persenBeasiswa = persenBeasiswa;
    }

    @Override
    public int hitungUKT() {
        int uktDasar = super.hitungUKT();
        int total = uktDasar + 500000;

        return total - (total * persenBeasiswa / 100);
    }

    @Override
    public String getJenis() {
        return "Beasiswa " + persenBeasiswa + "%";
    }
}