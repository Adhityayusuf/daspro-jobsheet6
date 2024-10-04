import java.util.Scanner;
public class TokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        byte jmlBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku  = ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku = ");
        jmlBuku = sc.nextByte();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jmlBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jmlBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jmlBuku > 3) {
                diskon = 5;
            }
        } 
        
        System.out.println("Jenis buku    = " + jenisBuku);
        System.out.println("Jumlah Buku   = " + jmlBuku);
        System.out.println("Jumlah Diskon = " + diskon + "%");
    }
}
