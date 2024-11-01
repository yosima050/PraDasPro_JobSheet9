import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah " + nilaiMhs[i]);
            total += nilaiMhs[i];

        }
        double rata2 = total/nilaiMhs.length;

        int nilaiTerkecil = nilaiMhs[0];
        int nilaiTerbesar = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMhs[i];
            }
            if (nilaiMhs[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMhs[i];
            }
        } 
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Nilai terendah = " + nilaiTerkecil);
        System.out.println("Nilai tertinggi = " + nilaiTerbesar);

        sc.close();
    }
}
