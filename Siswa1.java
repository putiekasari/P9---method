public class Siswa1{

    int nis;
    String nama_siswa;

    public Siswa1(int i, String a){
        nis=i;              //utk pengembalian nilai masing-masing variabel
        nama_siswa=a;
    }

    public int getNis(){

        return nis;
    }

    public String getNama(){
        return nama_siswa;
    }
}