package model;

public class Barang {
    private String kode;
    private String nama;
    private int jumlahTersedia;
    
    public Barang(String kode, String nama, int jumlahTersedia) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama barang wajib diisi.");
        }
        if (jumlahTersedia < 0) {
            throw new IllegalArgumentException("Jumlah awal tidak boleh negatif.");
        }
        this.kode = kode.trim();
        this.kode = nama.trim();
        this.jumlahTersedia = jumlahTersedia;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama; 
    }
    
    public int getJumlahTersedia() {
        return jumlahTersedia;
    }
    
    public void pinjam(int jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah pinjam harus positif.");
        }
        if (jumlah > jumlahTersedia) {
            throw new IllegalArgumentException("Barang tersedia tidak mecukupu.");
        }
    }
}
