import java.util.Scanner;

public class ClassUtama {
    Scanner inp = new Scanner(System.in);
    public static void main(String args[]) {
        TabunganKonvensional K_71200636 = new TabunganKonvensional();
        TabunganBerjangka I_71200636 = new TabunganBerjangka();
        System.out.println("Pilihan");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat Saldo");
        System.out.println("Masukan Pilihan: ");

        int pilihan = inp.nextInt();

        if (pilihan == 1) {
            K_71200636.Penyetoran(jumlah = 200000);
            I_71200636.Penyetoran(jumlah = 1000000);
        }

    }
}