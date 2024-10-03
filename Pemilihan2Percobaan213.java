import java.util.Scanner;
public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int pilihan_menu, jumlah_beli;
        String member;
        double diskon, total_bayar, harga;

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
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
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
                return; // Menghentikan eksekusi lebih lanjut jika pilhan salah
            }
             // Menghitung total bayar setelah diskon
             total_bayar = harga - (harga * diskon);
             System.out.println("Total bayar setelah diskon = " + total_bayar);
            }
            

            else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
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
                    return; // Menghentikan eksekusi lebih lanjut jika pilhan salah
                }
                // Menghitung total bayar
                System.out.println("Total bayar = " + harga);
            } else {
                System.out.println("Member tidak valid");
            }
            System.out.println("-------------------------------------");
    }
}
