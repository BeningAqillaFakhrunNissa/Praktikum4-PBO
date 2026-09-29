package praktikum4.tugas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManajemenAset {
    List<AsetIT> daftarAset = new ArrayList<>();
    
    //Operasi CREATE (Menambahkan objek ke dalam list)
    public void tambahAset(AsetIT asetBaru) {
        daftarAset.add(asetBaru);
    }
    
    //Operasi READ (menampilkan seluruh data menggunakan For-Each)
    public void tampilkanSemuaAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Data aset kosong.");
            return;
        }
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }
 
    // Operasi DELETE (mencari aset berdasarkan ID menggunakan Iterator)
    public void hapusAset(String idAset) {
        Iterator<AsetIT> it = daftarAset.iterator();
        boolean ditemukan = false;
 
        while (it.hasNext()) {
            AsetIT asetSekarang = it.next();
            if (asetSekarang.idAset.equals(idAset)) {
                it.remove(); // Menghapus secara aman
                ditemukan = true;
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                break;
            }
        }
 
        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID " + idAset + " tidak ditemukan!");
        }   
    }
}
