import perlombaan.lombaAnimasi;
import perlombaan.lombaSurat;
import java.util.Scanner;

public class Peserta implements lombaAnimasi, lombaSurat{
    String namaPeserta, asalSekolah;
    int jenisLomba;
    Scanner input =  new Scanner(System.in);
    Peserta(String namaPeserta,String asalSekolah, int jenisLomba ){
        this.namaPeserta = namaPeserta;
        this.asalSekolah = asalSekolah;
        this.jenisLomba = jenisLomba; 
    }
    public void formPenilaian(){
        if(this.jenisLomba == 1){
            double nilaiAlur = nilaiAlur();
            double nilaiKonten = nilaiKonten();
            double kreativitas = nilaiKreativitas();
            double sinematografi = nilaiSinematografi();
        }else if(this.jenisLomba == 2){
            double struktur = strukturSurat();
            double isiSurat = isiSurat();
            double kreativitas = nilaiKreativitas();
            double sinematografi = nilaiSinematografi();
        }
    }
    @Override
    public double nilaiAlur() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double nilaiKonten() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double nilaiKreativitas() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double nilaiSinematografi() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double strukturSurat() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double isiSurat() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double kreativitas() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
    @Override
    public double kaidahBahasa() {
        // TODO Auto-generated method stub
        double nilai;
        do{
            nilai = input.nextDouble();
        }while(nilai < 0 && nilai > 100);
        return nilai;
    }
   

 
    
}
