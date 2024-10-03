import java.util.Scanner;
public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int pilihan_menu, jumlah_beli;
        String member, qRis;
        double diskon, total_bayar, harga, potong;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input13.nextInt();
        input13.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input13.nextLine();
        System.out.print("Apakah menggunakan QRIS (y/n) ? = ");
        qRis = input13.nextLine();
        System.out.println("-------------------------------------");

        if (member.equals("y")) { 
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Massukan pilihan menu dengan benar");
                return; 
            }
             
             total_bayar = harga - (harga * diskon);
             System.out.println("Pembayaran dengan QRIS = " + qRis);

             if (qRis.equals("y")) {
                total_bayar -= 1000;
                System.out.println("Besar potongan QRIS = " + 1000);
             } else {
                System.out.println("Besar potongan QRIS = " + 0);
             }
             System.out.println("Total Bayar = " + total_bayar);
            }
            

            else if (member.equals("n")) { 
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);

                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);

                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);

                } else {
                    System.out.println(" Masukkkan menu dengan benar");
                    return; 
                }
                total_bayar = harga;

                System.out.println("Pembayaran dengan QRIS = " + qRis);

                if (qRis.equals("y")) {
                    total_bayar -= 1000;
                    System.out.println("Besar Potongan QRIS = " + 1000);
                } else {
                    System.out.println("Besar Potongan QRIS = " + 0);
                }

                System.out.println("Total Bayar = " + total_bayar);

            } else {
                System.out.println("Member tidak valid");
            }
            System.out.println("-------------------------------------");
    }
}
