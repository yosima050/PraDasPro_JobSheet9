import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String namaMenu = sc.nextLine();

        int Menu = 0;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMenu)) {
                Menu++;
                break;
            }
        }

        if (Menu > 0) {
            System.out.println("Makanan " + namaMenu + " tersedia di menu.");
        } else {
            System.out.println("Sepurane, makanan " + namaMenu + " tidak ada di menu.");
        }
        sc.close();
    }
}
