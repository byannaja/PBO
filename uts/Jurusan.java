package uts;

public class Jurusan {
    private String nama;
    private Laboratorium[] daftarLab;
    private Dosen kajur;

    public Jurusan(String nama, int jumlahLab, int kapasitasLab) {
        this.nama = nama;

        if (jumlahLab < 1) {
            jumlahLab = 1;
        }

        daftarLab = new Laboratorium[jumlahLab];

        for (int i = 0; i < jumlahLab; i++) {
            daftarLab[i] = new Laboratorium(
                "LAB-" + (i + 1), kapasitasLab
            );
        }
    }

    public void setKajur(Dosen kajur) {
        if (kajur != null) {
            this.kajur = kajur;
        }
    }

    public void daftarPraktikum(Mahasiswa m) {
        if (m == null) {
            return;
        }

        for (Laboratorium lab : daftarLab) {
            if (!lab.isPenuh()) {
                lab.tambahPeserta(m);
                return;
            }
        }

        System.out.println("Semua laboratorium penuh, "
                + m.getNama() + " tidak dapat didaftarkan.");
    }

    public void daftarPraktikum(Mahasiswa m, int nomorLab) {
        if (m == null) {
            return;
        }

        if (nomorLab < 1 || nomorLab > daftarLab.length) {
            System.out.println("Nomor laboratorium tidak valid.");
            return;
        }

        Laboratorium lab = daftarLab[nomorLab - 1];

        if (lab.isPenuh()) {
            System.out.println(lab.getKode() + " penuh, "
                    + m.getNama() + " tidak dapat didaftarkan.");
            return;
        }

        lab.tambahPeserta(m);
    }

    public void tampilInfo() {
        System.out.println("\nJurusan: " + nama);

        if (kajur != null) {
            System.out.println("Ketua Jurusan: " + kajur.getNama());
        }

        for (Laboratorium lab : daftarLab) {
            lab.tampilPeserta();
        }
    }
}