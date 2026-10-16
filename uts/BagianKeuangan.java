package uts;

public class BagianKeuangan {
    private String nama;

    public BagianKeuangan(String nama) {
        this.nama = nama;
    }

    public void cetakTagihan(Mahasiswa m) {
        if (m == null) {
            return;
        }

        String namaWali = "Belum ada";

        if (m.getDosenWali() != null) {
            namaWali = m.getDosenWali().getNama();
        }

        System.out.println("Tagihan UKT " + m.getNama()
                + " (" + m.getJenis() + ") - Wali: "
                + namaWali + " : " + m.hitungUKT());
    }
}