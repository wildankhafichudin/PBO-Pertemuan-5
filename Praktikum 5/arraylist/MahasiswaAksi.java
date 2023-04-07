package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        
        // menambahkan data mahasiswa ke dalam ArrayList
        int jml_mhs;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jml_mhs = inp.nextInt();
        inp.nextLine(); // mengonsumsi karakter newline setelah membaca inputan jumlah mahasiswa
        for(int i = 0; i < jml_mhs; i++) {
            System.out.println ("Masukkan data mahasiswa ke-" + (i+1) + " : ");
            System.out.print("Masukkan nama mahasiswa : ");
            String nama = inp.nextLine();
            System.out.print("Masukkan nim mahasiswa : ");
            String nim = inp.nextLine();
            ArrayList<Double> nilai = new ArrayList<Double>();
            System.out.print("Masukkan nilai mahasiswa : ");
            String inputNilai = inp.nextLine();
            String[] arrNilai = inputNilai.split(" ");
            for (String nilaiStr : arrNilai) {
                nilai.add(Double.parseDouble(nilaiStr));
            }
            mahasiswaList.add(new Mahasiswa(nama, nim, nilai));
        }
        
        // menampilkan data mahasiswa dan IPK menggunakan Iterator
        Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
        System.out.println("============================================================");
        while (iterator.hasNext()) {
            Mahasiswa mahasiswa = iterator.next();
            System.out.println("Nama : " + mahasiswa.getNama() + ", NIM : " + mahasiswa.getNim() + ", IPK : " + mahasiswa.hitungIPK());
        }
        System.out.println("============================================================");
    }
}