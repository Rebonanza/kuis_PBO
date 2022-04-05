import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);
        System.out.println(" Silahkan Memilih 2 Kategori Perlombaan");
        System.out.println("    1. Animasi (Tim)");
        System.out.println("    2. Menulis Surat (Individu)");
        System.out.println(" Pilih kategori perlombaan : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("=== Form Pendaftaran === ");
                Peserta daftar = new Peserta();
                daftar.pendaftaran();
                break;
            case 2: 
                
                break;
            case 0: System.exit(0);
                break;
            default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                break;
        }



    }
}
