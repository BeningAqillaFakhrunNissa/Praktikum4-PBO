package praktikum4.tugas;

public class MainAset {
    public static void main(String[] args) {
        // Instansiasi objek ManajemenAset
        ManajemenAset manajemen = new ManajemenAset();

        // i. Tambahkan minimal 4 data aset IT
        manajemen.tambahAset(new AsetIT("BA01", "Server Dell", "Ruang Server", "Baik"));
        manajemen.tambahAset(new AsetIT("BA02", "Router Cisco", "Ruang Jaringan", "Baik"));
        manajemen.tambahAset(new AsetIT("BA03", "Switch TP-Link", "Ruang Staff", "Rusak"));
        manajemen.tambahAset(new AsetIT("BA04", "PC Lenovo", "Ruang Desain", "Baik"));

        // ii. Tampilkan semua aset
        System.out.println("-----------------------------------------");
        System.out.println("----------- Data Aset IT Awal -----------");
        manajemen.tampilkanSemuaAset();

        // iii. Hapus salah satu aset menggunakan ID yang valid
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("\n--------- Menghapus aset (ID: BA03) ---------");
        manajemen.hapusAset("BA03");


        // iv. Tampilkan kembali semua aset
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("\n--------- Data Aset IT Setelah Delete ---------");
        manajemen.tampilkanSemuaAset();
    }
}
    

