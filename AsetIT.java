package praktikum4.tugas;

public class AsetIT {
    //Atribut
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;
    
    //constructor
    public AsetIT(String idAset, String namaPerangkat, String lokasi, String statusKondisi){
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
    }
    
    //Method
    public void tampilkanInfoAset() {
        System.out.println(idAset + " | " + namaPerangkat + " | " + lokasi + " | " + statusKondisi);
    }
}
