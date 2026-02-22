public class MataKuliahMain19 {

    public static void main(String[] args) {

        MataKuliah19 mk1 = new MataKuliah19();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 48;

        MataKuliah19 mk2 = new MataKuliah19("MK002", "Struktur Data", 4, 56);

        System.out.println("Informasi Mata Kuliah mk1:");
        mk1.tampilInformasi();

        System.out.println("Informasi Mata Kuliah mk2:");
        mk2.tampilInformasi();

        mk1.ubahSKS(4);

        mk2.tambahJam(2);

        mk1.kurangiJam(5);

        System.out.println("\nInformasi Setelah Perubahan:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}
