import perlombaan.lombaAnimasi;

public class PesertaAnimasi implements lombaAnimasi{
    String namaPeserta, asalSekolah ;
    double nilaiAlur, nilaiKonten, nilaiKreativitas, nilaiSinematografi;
    PesertaAnimasi(String namaPeserta,String asalSekolah, double nilaiAlur, double nilaiKonten, double nilaiKreativitas, double nilaiSinematografi ){
        this.namaPeserta = namaPeserta;
        this.asalSekolah = asalSekolah;
        this.nilaiAlur = nilaiAlur;
        this.nilaiKonten = nilaiKonten;
        this.nilaiKreativitas = nilaiKreativitas;
        this.nilaiSinematografi = nilaiSinematografi;
    }
    @Override
    public double nilaiAlur() {
        // TODO Auto-generated method stub
        this.nilaiAlur = this.nilaiAlur * 0.15;
        return this.nilaiAlur;
    }
    @Override
    public double nilaiKonten() {
        // TODO Auto-generated method stub
        this.nilaiKonten = this.nilaiKonten * 0.35;
        return this.nilaiKonten;
    }
    @Override
    public double nilaiKreativitas() {
        // TODO Auto-generated method stub
        this.nilaiKreativitas = this.nilaiKreativitas * 0.35;
        return this.nilaiKreativitas;
    }
    @Override
    public double nilaiSinematografi() {
        // TODO Auto-generated method stub
        this.nilaiSinematografi = this.nilaiSinematografi * 0.15;
        return this.nilaiSinematografi;
    }

    public double getHasil(){
        double nilaiAkhir = nilaiAlur() + nilaiKonten() + nilaiKreativitas() + nilaiSinematografi();
        return nilaiAkhir;
    }

    public void setNilaiAlur(double nilai){
        nilaiAlur = nilai;
    }
    public void setNilaiKonten(double nilai){
        nilaiKonten = nilai;
    }
    public void setNilaiKreativitas(double nilai){
        nilaiKreativitas = nilai;
    }
    public void setNilaiSinematografi(double nilai){
        nilaiSinematografi = nilai;
    }

    public String keterangan(){
        String ket;
        if(this.getHasil() < 85){
            ket = "LOLOS";
        }else{
            ket = "GAGAL";
        }
        return ket;
    } 
    
}
