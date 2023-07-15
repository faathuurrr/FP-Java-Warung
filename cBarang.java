package Project;
import java.util.*;
public class cBarang {
    private String nama;
    int harga;
    static cPembeli pembeli;

    // constructor
    cBarang(String nm, int hg) {
        nama = nm;
        harga = hg;
        System.out.println("\nobjek "+nama+" dibuat..");
    }
    static Scanner s = new Scanner(System.in);
    // setter
    void setNama(String nm) {
        nama = nm;
    }
    void setHarga(int hg) {
        harga = hg;
    }
    // getter
    String getNama() {
        return nama;
    }
    int getHarga() {
        return harga;
    }
    // ToString
    String ToString() {
        return "Menu "+nama+" ["+harga+"]";
    }
    public static int cariBarang(cBarang[] barang, int cariArrayBrg) {
        return cariArrayBrg;
    }
}
