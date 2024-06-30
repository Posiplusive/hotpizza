import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Constants initialization

public class hotpizza {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ambil order anda");
        input.nextLine();
    }

    public static void jenis() {
        System.out.println("\nPilih nombor untuk jenis pizza:");
        System.out.println("1. Aloha Chicken\n2. Beef Pepperoni\n3. Chicken Delight\n4. Deluxe Cheese\n5. Island Tuna");
        String[] jenisPizza = {"Aloha Chicken", "Beef Pepperoni", "Chicken Delight", "Deluxe Cheese", "Island Tuna"};
        Scanner input = new Scanner(System.in);
        System.out.print("Pilihan: ");
        int x = input.nextInt();
        input.close();
        System.out.printf("Anda telah memilih %s\n", jenisPizza[x-1]);
    }

    public static void roti() {
        System.out.println("Pilih nombor untuk jenis roti:");
        System.out.println("1. Pan Pizza\n2. Hand Stretched\n3. Stuffed Crust");
        String[] jenisRoti = {"Pan Pizza", "Hand Stretched", "Stuffed Crust"};
        Scanner input = new Scanner(System.in);
    }

    public static void cheese() {

    }

    public static void saiz() {

    }

    public static void resit() {
        System.out.println("=====================================");
        System.out.println("         Restoran Pizza Hot");
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        LocalDateTime masa = LocalDateTime.now();
        DateTimeFormatter bikinFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatMasa = masa.format(bikinFormat);
        System.out.printf("Masa: %s\n", formatMasa);
        jenis();
        resit();
    }
}
