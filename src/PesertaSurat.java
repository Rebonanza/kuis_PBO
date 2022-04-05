import perlombaan.lombaSurat;

public class PesertaSurat implements lombaSurat{
    String namaPeserta, asalSekolah ;
    double nilaiStruktur, nilaiIsi, nilaiKreativitas, nilaiBahasa;
    PesertaSurat(String namaPeserta,String asalSekolah, double nilaiStruktur, double nilaiIsi, double nilaiKreativitas, double nilaiBahasa ){
        this.namaPeserta = namaPeserta;
        this.asalSekolah = asalSekolah;
        this.nilaiStruktur = nilaiStruktur;
        this.nilaiIsi = nilaiIsi;
        this.nilaiKreativitas = nilaiKreativitas;
        this.nilaiBahasa = nilaiBahasa;
    }
    @Override
    public double nilaiStruktur() {
        // TODO Auto-generated method stub
        this.nilaiStruktur = this.nilaiStruktur * 0.10;
        return this.nilaiStruktur;
    }
    @Override
    public double nilaiIsi() {
        // TODO Auto-generated method stub
        this.nilaiIsi = this.nilaiIsi * 0.40;
        return this.nilaiIsi;
    }
    @Override
    public double nilaiKreativitas() {
        // TODO Auto-generated method stub
        this.nilaiKreativitas = this.nilaiKreativitas * 0.30;
        return this.nilaiKreativitas;
    }
    @Override
    public double nilaiBahasa() {
        // TODO Auto-generated method stub
        this.nilaiBahasa = this.nilaiBahasa * 0.20;
        return this.nilaiBahasa;
    }

    public void setNilaiStruktur(double nilai){
        nilaiStruktur = nilai;
    }
    public void setNilaiIsi(double nilai){
        nilaiIsi = nilai;
    }
    public void setNilaiKreativitas(double nilai){
        nilaiKreativitas = nilai;
    }
    public void setNilaiBahasa(double nilai){
        nilaiBahasa = nilai;
    }

    public double getHasil(){
        double nilaiAkhir = nilaiStruktur() + nilaiIsi() + nilaiKreativitas() + nilaiBahasa();
        return nilaiAkhir;
    }


    public String keterangan(){
        String ket;
        if(this.getHasil() < 85){
            ket = "GAGAL";
        }else{
            ket = "LOLOS";
        }
        return ket;
    }
    
}
