import java.util.Scanner;
public class SearchNilaiModifikas226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int hasil = 0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil > 0) {
            System.out.println();
            System.out.println("Nilai " + key + " merupakan nilai mahasiswa ke-" + hasil);
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
        sc.close();
    } 
}