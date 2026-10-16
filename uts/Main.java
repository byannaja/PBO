package uts;

public class Main{
    public static void main(String[] args) {

        Jurusan jurusan = new Jurusan(
            "Teknologi Informasi", 2, 2
        );

        Dosen kajur = new Dosen("198001", "Pak Imam");
        Dosen wali = new Dosen("198002", "Bu Vivi");

        jurusan.setKajur(kajur);

        MahasiswaReguler lestari = new MahasiswaReguler(
            "2341720001", "Lestari", 20
        );

        MahasiswaBeasiswa usman = new MahasiswaBeasiswa(
            "2341720002", "Usman", 24, 50
        );

        MahasiswaReguler anugrah = new MahasiswaReguler(
            "2341720003", "Anugrah", 22
        );

        lestari.setDosenWali(wali);
        usman.setDosenWali(wali);
        anugrah.setDosenWali(wali);

        jurusan.daftarPraktikum(lestari);
        jurusan.daftarPraktikum(usman);
        jurusan.daftarPraktikum(anugrah);

        jurusan.daftarPraktikum(anugrah, 1);

        BagianKeuangan keuangan =
                new BagianKeuangan("Bagian Keuangan");

        keuangan.cetakTagihan(lestari);
        keuangan.cetakTagihan(usman);
        keuangan.cetakTagihan(anugrah);

        jurusan.tampilInfo();
    }
}