import java.util.ArrayList;
public class sda4 {
    public static void main(String[] args) {
        //String[] nama = {"Z","A","R","I"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("Z");
        nama.add("A");
        nama.add("R");
        nama.add("I");

        //Soal nomor 4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //indexOf(a), indexOf(c), indexOf(q)
        
        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
        }
}
