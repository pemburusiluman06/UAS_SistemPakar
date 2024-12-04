package Controller;

public class Sayuran {
    
    String id_sayuran, nama_sayuran, deskripsi_sayuran;

    public Sayuran(String id_sayuran, String nama_sayuran, String deskripsi_sayuran) {
        this.id_sayuran = id_sayuran;
        this.nama_sayuran = nama_sayuran;
        this.deskripsi_sayuran = deskripsi_sayuran;
    }

    public String getId_sayuran() {
        return id_sayuran;
    }

    public void setId_sayuran(String id_sayuran) {
        this.id_sayuran = id_sayuran;
    }

    public String getNama_sayuran() {
        return nama_sayuran;
    }

    public void setNama_sayuran(String nama_sayuran) {
        this.nama_sayuran = nama_sayuran;
    }

    public String getDeskripsi_sayuran() {
        return deskripsi_sayuran;
    }

    public void setDeskripsi_sayuran(String deskripsi_sayuran) {
        this.deskripsi_sayuran = deskripsi_sayuran;
    }
    
}
