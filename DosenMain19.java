public class DosenMain19 {

    public static void main(String[] args) {
       Dosen19 dosen1 = new Dosen19();
        dosen1.tampilInformasi();

        dosen1.idDosen = "D001";
        dosen1.nama = "bu triana fatmawati,S.T.,M.T";
        dosen1.setStatusAktif(true);
        dosen1.tahunBergabung = 2010;
        dosen1.ubahKeahlian("Algoritma Struktur Data");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " tahun\n");

        Dosen19 dosen2 = new Dosen19("D002", "Prof. Siti", true, 2015, "Matematika");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " tahun\n");

        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Statistika");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " tahun");
    }
}