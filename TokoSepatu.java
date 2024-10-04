import java.util.Scanner;
public class TokoSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String merk,kategori;
        byte ukuran;
        double harga;

        System.out.print("Masukkan Merk     = ");
        merk = sc.nextLine();
        System.out.print("Masukkan Kategori = ");
        kategori = sc.nextLine();
        System.out.print("Masukkan Ukuran   = ");
        ukuran = sc.nextByte();

        if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("ortus")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else {
            System.out.println("Merk tidak di temukan !!");
        }
    }
}
