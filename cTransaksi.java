package Project;

public class cTransaksi {
    private cBarang barang[];
    private cPembeli pembeli;
    private int jbrg, maksbrg;

    // constructor
    cTransaksi(int maks) {
        maksbrg = maks;
        barang = new cBarang[maksbrg];
        jbrg = 0;
    }

    public void isiPembeli(cPembeli p) {
        pembeli = new cPembeli (p.getNama());
        System.out.println("\nIsi pembeli sukses..");
    }
    public void tambahBarang(cBarang m) {
        if(jbrg >= maksbrg) {
            System.out.println("\nKeranjang penuh..");
        }
        else {
            barang[jbrg] = new cBarang(m.getNama(), m.getHarga());
            jbrg++;
            System.out.println("\nPenambahan sukses..");
        }
    }
    public void lihatBarang() {
        System.out.println("\nBarang belanjaan :");
        if(jbrg <= 0) {
            System.out.println("\nKeranjang kosong..");
        }
        else {
            for (int i = 0; i < jbrg; i++) {
                System.out.println((i+1)+". "+barang[i].ToString());
            }
        }
    }
    public void struk() {
        System.out.println("\n-----------Struk-----------\n");
        System.out.println(pembeli.ToString());
        System.out.println("---------------------------");
        if(jbrg <= 0) {
            System.out.println("\nKeranjang kosong..");
        }
        else {
            for (int i = 0; i < jbrg; i++) {
                System.out.println((i+1)+". "+barang[i].ToString());
            }
        }
        System.out.println("---------------------------");
    }
    public void hapusBarang(String hapus) {
        if(jbrg <= 0) {
            System.out.println("\nKeranjang kosong..");
        }
        else {
            // mencari barang yg mau dihapus
            boolean ada = false;
            for (int i = 0; i < jbrg; i++) {
                if(hapus.equalsIgnoreCase(barang[i].getNama())) {
                    ada = true;
                    barang[i] = null;
                    // menggeser elemen array yang dibelakang
                    for (int j = 1; j < jbrg; j++) {
                        if(j == jbrg - 1) {
                            barang[j] = null;
                        }
                        else {
                            barang[j] = barang[j+1];
                        }
                    }
                    jbrg--;
                    System.out.println("\nPenghapusan sukses..");
                    break;
                }
            }
            if(ada == false) {
                System.out.println("\nMakanan tidak ada..");
            }
        }
    }

}   
