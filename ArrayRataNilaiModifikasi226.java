import java.util.Scanner;
public class ArrayRataNilaiModifikasi226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lulus = 0, tidaklulus = 0, totalLulus = 0, totalTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidaklulus++;
            }
        } 

        rata2Lulus = totalLulus/lulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);

        rata2TidakLulus = totalTidakLulus/tidaklulus;
        System.out.println("Rata-rata nilai tidak lulus =" + rata2TidakLulus);

        sc.close();
    }
}
