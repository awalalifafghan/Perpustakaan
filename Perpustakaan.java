import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    
    String judul;
    String author;
    String penerbit;
    String kategori;
    String tahun;

    Perpustakaan( String judul, String author, String penerbit, String kategori, String tahun){
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun = tahun;
    }
    public static void main(String[] args){

         System.out.println("========================================================");
         System.out.println(" Daftar Buku yang Tersedia ");
         System.out.println("========================================================");
 

        ArrayList<Perpustakaan> daftarPerpustakaan = new ArrayList<Perpustakaan>();
        daftarPerpustakaan.add(new Perpustakaan(" Milea               ", " Pidi Baiq ", " Pastel ",    "   Fiksi ",    "   2018" ));
        daftarPerpustakaan.add(new Perpustakaan(" Dasar Pemrograman ", " Abdul Kadir ", " Erlangga ", " Teknik ", "   2008 "));
        daftarPerpustakaan.add(new Perpustakaan(" Manajemen Produksi ", " Daryanto ", " Yrama Widya ", "Manajemen ", "2021 "));
        daftarPerpustakaan.add(new Perpustakaan(" Hidrologi            ", " Suwignyo ", " UMM Press ",  "Teknik " , "  2022 " ));
        daftarPerpustakaan.add(new Perpustakaan(" Mariposa             ", " Luluk HF ", " Coconut ",   "   Fiksi " ,   "  2020" ));
        System.out.println(" Judul               "+ " Author   " + " Penerbit " + " Kategori " + " Tahun "); 
        System.out.println("========================================================"); 

        for(Perpustakaan item : daftarPerpustakaan){
            
            System.out.println(item.judul + item.author + item.penerbit + item.kategori + item.tahun); 
        }
        int bukuBaru = 0;
        int bukuLawas = 0;
        if (bukuBaru > 2000) {
            bukuLawas++;
        } else {
            bukuBaru++;
        }
        System.out.println("=========================================================");
        System.out.println("Jumlah buku yang tersedia : "+daftarPerpustakaan.size());

        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);


      
    }
    }
