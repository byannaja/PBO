package uts;

public class Laboratorium {
    private String kode;
    private Mahasiswa[] peserta;
    private int jumlah;

    public Laboratorium(String kode, int kapasitas) {
        this.kode = kode;

        if (kapasitas < 1) {
            kapasitas = 1;
        }

        peserta = new Mahasiswa[kapasitas];
        jumlah = 0;
    }

    public boolean tambahPeserta(Mahasiswa m) {
        if (m == null || isPenuh()) {
            return false;
        }

        peserta[jumlah] = m;
        jumlah++;

        return true;
    }

    public boolean isPenuh() {
        return jumlah >= peserta.length;
    }

    public String getKode() {
        return kode;
    }

    public void tampilPeserta() {
        System.out.print(kode + ": ");

        for (int i = 0; i < jumlah; i++) {
            if (peserta[i] != null) {
                if (i > 0) {
                    System.out.print(", ");
                }

                System.out.print(peserta[i].getNama());
            }
        }

        System.out.println();
    }
}
