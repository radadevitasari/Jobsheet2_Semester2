public class Dosen19 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor default
    public Dosen() {
    }

    // Konstruktor berparameter
    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi lengkap tentang dosen
    void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("----------------------------");
    }

    // Method untuk mengatur status aktif dosen
    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status Dosen " + nama + " telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // Method untuk menghitung masa kerja dosen
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian dosen
    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian Dosen " + nama + " telah diubah menjadi: " + bidangKeahlian);
    }
}
    
