package Project;

public class cPembeli {
    private String nama;

    // constructor
    cPembeli(String nm) {
        nama = nm;
    }
    // setter
    void setNama(String nm) {
        nama = nm;
    }
    // getter
    String getNama() {
        return nama;
    }
    // ToString
    String ToString() {
        return "Pembeli   = "+nama;
    }
}
