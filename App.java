package Project;
import java.util.*;
// pembeli membeli barang
// class : pembeli, barang, transaksi

public class App {

    // global variable
    static int jumlah = 4;
    static String nm,mn;
    static int hg, jbrg = 0, maksbrg;
    static int pilih, jenis, ubah, CariArrayBrg = 0;
    static boolean found = false;
    static boolean ada;
    static Double total, totalAkhir, diskon;
    

    // object
    static cBarang barang[] = new cBarang[7];
    static cTransaksi transaksi = new cTransaksi(7);
    static cPembeli pembeli = new cPembeli(" ");
    static cBarang belanjaan[] = new cBarang[7];

    static Scanner s = new Scanner (System.in);
    public static void main(String[] args) {

        // variable
        int pilih, pilih1, pilih2, pilih3, pilih4, pilihLogin;
        boolean login = true;
        boolean loginChecker = true;
        String uLogin1 = "fathur";
        String pLogin1 = "mantannyacinta";
        String password1;
        String uLogin2 = "yayan";
        String pLogin2 = "lagijomblo";
        String password2;
        String uLogin3 = "ismia";
        String pLogin3 = "mencarijodoh";
        String password3;
        String username;

        // array of object pokok
        barang[0] = new cBarang("Indomie", 2000);
        barang[1] = new cBarang("Telur", 22000);
        barang[2] = new cBarang("Minyak", 23000);
        barang[3] = new cBarang("Beras", 12000);
        barang[4] = new cBarang("Tepung", 7000);

        System.out.println("\n=== Selamat Datang di Warung Dekat Rumah ===");

        // menu lvl pengguna
        do {
            System.out.println("Silahkan pilih : ");
            System.out.print("1. Pembeli"
                +"\n2. Member"
                +"\n3. Admin"
                +"\n4. Pemilik"
                +"\n5. Exit"
                +"\nPilih = ");
            pilihLogin = s.nextInt();
            switch(pilihLogin) {
                // pembeli
                case 1 : 
                    do {
                        System.out.println("\n    Transaksi Penjualan");
                        System.out.println("    1. Nama Pembeli");
                        System.out.println("    2. Tambah Belanjaan");
                        System.out.println("    3. Hapus Belanjaan");
                        System.out.println("    4. Lihat Belanjaan");
                        System.out.println("    5. Pembayaran");
                        System.out.println("    6. Kembali");
                        System.out.print("    Pilih = ");
                        pilih2 = s.nextInt();
                        switch(pilih2) {
                            case 1 :
                                System.out.print("    Nama pembeli = ");
                                String nm = s.next();
                                pembeli.setNama(nm);
                                transaksi.isiPembeli(pembeli);
                                System.out.println("Penambahan Sukses..");
                                break;
                            case 2 :
                                System.out.print("    Barang = ");
                                mn =s.next();
                                System.out.println("    Tambah barang? 1. Lanjut / 2. Tidak");
                                System.out.print("    Pilih = ");
                                pilih4 = s.nextInt();
                                if(pilih4 == 1) {
                                    boolean ada = false;
                                    for (int i = 0; i < barang.length; i++) {
                                        if(mn.equalsIgnoreCase(barang[i].getNama())) {
                                            ada = true;
                                            transaksi.tambahBarang(barang[i]);
                                            total = total + (barang[i].getHarga());
                                            break;
                                        }
                                    }
                                    if(ada == false) {
                                        System.out.println("\nBarang tidak ada!");
                                    }
                                }
                                else {
                                    System.out.println("    Batal Update..");
                                }
                                break;
                            case 3 :
                                System.out.print("    Barang dihapus = ");
                                String h = s.next();
                                System.out.println("    Hapus? 1. Lanjut / 2. Tidak");
                                System.out.print("    Pilih = ");
                                pilih3 = s.nextInt();
                                if(pilih3 == 1) {
                                    transaksi.hapusBarang(h);
                                }
                                else {
                                    System.out.println("\n    Batal Update..");
                                }
                                break;
                            case 4 :
                                transaksi.lihatBarang();
                                break;
                            case 5 :
                                Double uang;
                                do {
                                    transaksi.struk();
                                    System.out.println("Total     = Rp." + total);
                                    System.out.print("\nUang      = ");
                                    uang = s.nextDouble();
                                    if(uang < total) {
                                    System.out.println("\nUang anda kurang..");
                                    }
                                } while(uang < total);
                                System.out.println("---------------------------");
                                Double kembalian = uang - total;
                                System.out.println("Kembalian = Rp." + kembalian);
                                pilih2 = 6;
                                pilih = 3;
                                break;
                            case 6 :
                                System.out.println("    Kembali..");
                                break;
                        }
                    } while(pilih2 != 6);
                    break;
                // member
                case 2 :
                    String passwordTemp;
                    System.out.println("Login untuk memulai :");
                    System.out.print("Username = ");
                    username = s.next();
                    do {
                        if (username.equals(uLogin1)) {
                            do {
                                System.out.print("Password = ");
                                password1 = s.next();
                                if (password1.equals(pLogin1) && username.equals(uLogin1)) {
                                    login = false;
                                    loginChecker = false;
                                } else {
                                    System.out.println("\nPassword salah...");
                                }
                            } while (login);
                        } else if (username.equals(uLogin2)){
                            do {
                                System.out.print("Password = ");
                                password2 = s.next();
                                if (password2.equals(pLogin2) && username.equals(uLogin2)) {
                                    login = false;
                                    loginChecker = false;
                                } else {
                                    System.out.println("\nPassword salah...");
                                }
                            } while (login);
                        } else if (username.equals(uLogin3)) {
                            do {
                                System.out.print("Password = ");
                                password3 = s.next();
                                if (password3.equals(pLogin3) && username.equals(uLogin3)) {
                                    login = false;
                                    loginChecker = false;
                                } else {
                                    System.out.println("\nPassword salah...");
                                }
                            } while (login);
                        }
                    } while (loginChecker);
                    

                    do {
                        System.out.println("\n    Transaksi Penjualan");
                        System.out.println("    1. Nama Pembeli");
                        System.out.println("    2. Tambah Belanjaan");
                        System.out.println("    3. Hapus Belanjaan");
                        System.out.println("    4. Lihat Belanjaan");
                        System.out.println("    5. Pembayaran");
                        System.out.println("    6. Ubah Password");
                        System.out.println("    7. Kembali");
                        System.out.print("    Pilih = ");
                        pilih2 = s.nextInt();
                        switch(pilih2) {
                            case 1 :
                                System.out.print("    Nama pembeli = ");
                                String nm = s.next();
                                pembeli.setNama(nm);
                                transaksi.isiPembeli(pembeli);
                                System.out.println("Penambahan Sukses..");
                                break;
                            case 2 :
                                System.out.print("    Barang = ");
                                mn =s.next();
                                System.out.println("    Tambah barang? 1. Lanjut / 2. Tidak");
                                System.out.print("    Pilih = ");
                                pilih4 = s.nextInt();
                                if(pilih4 == 1) {
                                    boolean ada = false;
                                    for (int i = 0; i < barang.length; i++) {
                                        if(mn.equalsIgnoreCase(barang[i].getNama())) {
                                            ada = true;
                                            transaksi.tambahBarang(barang[i]);
                                            total = total + (barang[i].getHarga());
                                            break;
                                        }
                                    }
                                    if(ada == false) {
                                        System.out.println("\nBarang tidak ada!");
                                    }
                                }
                                else {
                                    System.out.println("    Batal Update..");
                                }
                                break;
                            case 4 :
                                transaksi.lihatBarang();
                                break;
                            case 5 :
                                Double uang;
                                do {
                                    transaksi.struk();
                                    System.out.println("Total     = Rp." + total);
                                    totalAkhir = total;
                                    diskon = total * 0.05;
                                    totalAkhir = totalAkhir - diskon;
                                    System.out.print("\nUang      = ");
                                    uang = s.nextDouble();
                                    if(uang < totalAkhir) {
                                    System.out.println("\nUang anda kurang..");
                                    }
                                } while(uang < totalAkhir);
                                System.out.println("---------------------------");
                                Double kembalian = uang - totalAkhir;
                                System.out.println("Kembalian = Rp." + kembalian);
                                pilih2 = 6;
                                pilih = 3;
                                break;
                            case 6 :
                                System.out.println("    Ubah password menjadi");
                                System.out.print("    masukkan = ");
                                passwordTemp = s.next();

                                break;
                            case 7 :
                                break;
                        }
                    } while(pilih2 != 6);
                    break;
                // admin
                case 3 : 

                    break;
                // pemilik
                case 4 : 

                    break;
                // exit
                case 5 :
                    break;
            }

        } while(pilihLogin != 5);

        // App
        do {
            System.out.println("\nAPP");
            System.out.println("1. Master Barang");
            System.out.println("2. Transaksi Penjualan");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih = s.nextInt();
            switch(pilih) {
                case 1 : 
                    do {
                        System.out.println("\n    Master Barang");
                        System.out.println("    1. Tambah Data Barang");
                        System.out.println("    2. Ubah Data Barang");
                        System.out.println("    3. Hapus Data Barang");
                        System.out.println("    4. Lihat Data Barang");
                        System.out.println("    5. Kembali");
                        System.out.print("    Pilih = ");
                        pilih1 = s.nextInt();
                        switch(pilih1) {
                            case 1 :
                                tambahDataBarang();
                                break;
                            case 2 :
                                ubahDataBarang();
                                break;
                            case 3 :
                                hapusDataBarang();
                                break;
                            case 4 :
                                lihatDataBarang();
                                break;
                            case 5 :
                                System.out.println("\nKembali..");
                                break;
                        }
                    } while(pilih1 != 5);
                    break;
                case 2 : 
                    
                case 3 : 
                    System.out.println("\nTerima Kasih Telah Berbelanja :)");
                    break;
            }
        } while(pilih != 3);
        System.out.println("\nTerima Kasih Telah Berbelanja :)");
    }

    // method data
    public static void tambahDataBarang() {
        System.out.print("    Nama barang = ");
        nm = s.next();
        System.out.print("    Harga Barang = ");
        hg = s.nextInt();
        jenis = s.nextInt();
        System.out.println("    Tambah data barang? 1. Lanjut / 2. Tidak");
        System.out.print("    Pilih = ");
        pilih = s.nextInt();
        if(pilih == 1) {
            switch(jenis) {
                case 1 : 
                    barang[jumlah] = new cBarang(nm, hg);
                    break;
            }
        } 
        else if(pilih == 2) {
            System.out.println("Batal update..");
        }
    }
    public static void ubahDataBarang() {
        System.out.println("    Jenis barang : \n\t1. Pokok\n\t2. Jajan");
        System.out.print("  Pilih = ");
        jenis = s.nextInt();
        switch(jenis) {
            case 1 :
                ubah = cBarang.cariBarang(barang, CariArrayBrg);
                if(ubah != -1) {
                    found = true;
                }
                break;
        }
        if(found) {
            System.out.print("    Nama = ");
            nm = s.next();
            System.out.print("    Harga = ");
            hg = s.nextInt();
            System.out.println("\n    Barang diubah : " + nm + " [Rp" + (hg)+ "] ");
            System.out.println("        1. Ubah"); 
            System.out.println("        2. Batalkan"); 
            System.out.print("  Pilih = ");
            pilih = s.nextInt();
            if(pilih == 1) {
                switch(jenis) {
                    case 1:
                        barang[ubah].setNama(nm);
                        barang[ubah].setHarga(hg);
                        break;
                }
            }
            else if(pilih == 2) {
                System.out.println("    Update batal..");
            }
        }
    }
    public static void hapusDataBarang() {
        System.out.println("    Jenis barang : \n\t1. Pokok\n\t2. Jajan");
        System.out.print("    Pilih = ");
        jenis = s.nextInt();
        System.out.print("    Nama barang yang dihapus = ");
        String hapus = s.next();
        switch(jenis) {
            case 1 : 
                ada = false;
                for (int i = 0; i < jumlah; i++) {
                    if(hapus.equalsIgnoreCase(barang[i].getNama())) {
                        ada = true;
                        barang[i] = null;
                        for (int j = i; j < jumlah; j++) {
                            if(j == jumlah-1) {
                                barang[j] = null;
                            }
                            else {
                                barang[j] = barang[j+1];
                            }  
                        }
                        jumlah--;
                        System.out.println("\nPenghapusan sukses..");
                    }
                }
                if(ada == false) {
                    System.out.println("Makanan tidak ditemukan..");
                }
                break;
        }
    }
    public static void lihatDataBarang() {
        int jum = 0;
        System.out.println("");
        for (int i = 0; i < barang.length; i++) {
            if(barang[i] != null){
                System.out.println((i+1) + ". " + barang[i].getNama() + " [Rp" + (barang[i].getHarga()) + "] ");
                jum = i;
            } 
        }
    }
}
