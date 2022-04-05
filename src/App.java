import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);
        System.out.println(" Silahkan Memilih 2 Kategori Perlombaan");
        System.out.println("    1. Animasi (Tim)");
        System.out.println("    2. Menulis Surat (Individu)");
        System.out.print(" Pilih kategori perlombaan : ");
        int pilihan = Integer.parseInt(input.nextLine());
        String nama, sekolah;
        double[] nilai = new double[4];
        int menu;
        switch (pilihan) {
            case 1:
                System.out.println("=== Form Pendaftaran === ");
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
                System.out.print(" Asal Sekolah : ");
                sekolah = input.nextLine();
                System.out.println(" === Form Penilaian ===");
                System.out.println(" *Keterangan : nilai yang valid berada di antara 0-100* ");
                System.out.print("Input nilai alur cerita : ");
                nilai[0] = input.nextDouble();
                System.out.print("Input nilai konten : ");
                nilai[1] = input.nextDouble();
                System.out.print("Input nilai kreativitas : ");
                nilai[2] = input.nextDouble();
                System.out.print("Input nilai sinematografi : ");
                nilai[3] = input.nextDouble();
                PesertaAnimasi pesertaAnimasi = new PesertaAnimasi(nama, sekolah, nilai[0], nilai[1], nilai[2], nilai[3]);
                do{
                    System.out.println("=== Menu ===");
                    System.out.println(" 1. Tampil");
                    System.out.println(" 2. Edit");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu  = input.nextInt();
                    switch(menu) {
                        case 1:
                            double hasil = pesertaAnimasi.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            System.out.println(" Keterangan     : " + pesertaAnimasi.keterangan()); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf, "+ pesertaAnimasi.namaPeserta + " dari " + pesertaAnimasi.asalSekolah + " tidak lolos seleksi lomba animasi");
                            }else {
                                System.out.println(" Selamat, "+ pesertaAnimasi.namaPeserta + " dari " + pesertaAnimasi.asalSekolah + " lolos seleksi lomba animasi");
                            }
                            break;
                        case 2: 
                            System.out.println(" === Edit Penilaian ===");
                            System.out.println(" *Keterangan : nilai yang valid berada di antara 0-100* ");
                            System.out.print(" Input nilai alur cerita : ");
                            nilai[0] = input.nextDouble();
                            pesertaAnimasi.setNilaiAlur(nilai[0]);
                            System.out.print(" Input nilai konten : ");
                            nilai[1] = input.nextDouble();
                            pesertaAnimasi.setNilaiKonten(nilai[1]);
                            System.out.print(" Input nilai kreativitas : ");
                            nilai[2] = input.nextDouble();
                            pesertaAnimasi.setNilaiKreativitas(nilai[2]);
                            System.out.print(" Input nilai sinematografi : ");
                            nilai[3] = input.nextDouble();
                            pesertaAnimasi.setNilaiSinematografi(nilai[3]);
                            break;
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                        }
                }while(menu != 3);
                break;
            case 2: 
                System.out.print("=== Form Pendaftaran === ");
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
                System.out.print(" Asal Sekolah : ");
                sekolah = input.nextLine();
                System.out.println(" === Form Penilaian ===");
                System.out.println(" *Keterangan : nilai yang valid berada di antara 0-100* ");
                System.out.print(" Input nilai struktur surat : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input nilai isi surat : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input nilai kreativitas : ");
                nilai[2] = input.nextDouble();
                System.out.print(" Input nilai kaidah bahasa : ");
                nilai[3] = input.nextDouble();
                PesertaSurat pesertaSurat = new PesertaSurat(nama, sekolah, nilai[0], nilai[1], nilai[2], nilai[3]);
                do{
                    System.out.println("=== Menu ===");
                    System.out.println(" 1. Tampil");
                    System.out.println(" 2. Edit");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu  = input.nextInt();
                    switch (menu) {
                        case 1:
                            double hasil = pesertaSurat.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            System.out.println(" Keterangan     : " + pesertaSurat.keterangan()); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf, "+ pesertaSurat.namaPeserta + " dari " + pesertaSurat.asalSekolah + " tidak lolos seleksi lomba surat");
                            }else {
                                System.out.println(" Selamat, "+ pesertaSurat.namaPeserta + " dari " + pesertaSurat.asalSekolah + " lolos seleksi lomba surat");
                            }
                            break;
                        case 2: 
                            System.out.println(" === Edit Penilaian ===");
                            System.out.println(" *Keterangan : nilai yang valid berada di antara 0-100* ");
                            System.out.print(" Input nilai struktur surat : ");
                            nilai[0] = input.nextDouble();
                            pesertaSurat.setNilaiStruktur(nilai[0]);
                            System.out.print(" Input nilai isi surat : ");
                            nilai[1] = input.nextDouble();
                            pesertaSurat.setNilaiIsi(nilai[1]);
                            System.out.print(" Input nilai kreativitas : ");
                            nilai[2] = input.nextDouble();
                            pesertaSurat.setNilaiKreativitas(nilai[2]);
                            System.out.print(" Input nilai kaidah bahasa : ");
                            nilai[3] = input.nextDouble();
                            pesertaSurat.setNilaiBahasa(nilai[3]);
                                break;
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                    }
                   
                }while(menu != 3);
               
                break;
            default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                break;
        }
        input.close();
    }
}
