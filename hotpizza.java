import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class hotpizza {
    // Constants initialization
    // Pizza
    public static final int PIZZA_PRICE = 1000;

    // Bread
    public static final int PAN_PIZZA = 500;
    public static final int HAND_STRETCH = 1500;
    public static final int STUFFED_CRUST = 2000;

    // Cheese
    public static final int DOUBLE = 150;
    public static final int TRIPLE = 300;

    // Size
    public static final int SMALL = 100;
    public static final int MEDIUM = 150;
    public static final int LARGE = 200;

    // Drinks
    public static final int PEPSI = 150;
    public static final int MILO = 300;
    public static final int LEMON_TEA = 150;

    public static void jenis() {
        System.out.println("\nPilih nombor untuk jenis pizza:");
        String[] jenisPizza = {"Aloha Chicken", "Beef Pepperoni", "Chicken Delight", "Deluxe Cheese", "Island Tuna"};
        for (int i = 0; i < jenisPizza.length; i++) {
            System.out.printf("%s. %s\n", i + 1, jenisPizza[i]);
        }

        Scanner input = new Scanner(System.in);
        int pilihanJenis;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanJenis = input.nextInt();
            try {
                System.out.printf("Anda telah memilih %s\n", jenisPizza[pilihanJenis - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanJenis >= 6 | pilihanJenis <= 0);
    }

    public static void roti() {
        System.out.println("Pilih nombor untuk jenis roti:");
        String[] jenisRoti = {"Pan Pizza", "Hand Stretched", "Stuffed Crust"};

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s. %s\n", i+1, jenisRoti[i]);
        }

        Scanner input = new Scanner(System.in);
        int pilihanRoti;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanRoti = input.nextInt();
            try {
                System.out.printf("Anda telah memilih %s\n", jenisRoti[pilihanRoti - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanRoti >= 4 | pilihanRoti <= 0);
    }

    public static void cheese() {
        System.out.println("Extra cheese:");
        String[] jenisCheese = {"None", "Double", "Triple"};

        for (int i = 0; i < jenisCheese.length; i++) {
            System.out.printf("%s. %s\n", i+1, jenisCheese[i]);
        }
        Scanner input = new Scanner(System.in);
        int pilihanCheese;
        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanCheese = input.nextInt();
            try {
                System.out.printf("Anda telah memilih %s Cheese\n", jenisCheese[pilihanCheese - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanCheese >= 4 | pilihanCheese <= 0);
    }

    public static void saiz() {
        System.out.println("Pilih nombor untuk saiz pizza:");
        String[] saizPizza = {"Kecil", "Sederhana", "Besar"};

        for (int i = 0; i < saizPizza.length; i++) {
            System.out.printf("%s. %s\n", i+1, saizPizza[i]);
        }
        Scanner input = new Scanner(System.in);
        int pilihanSaiz;
        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanSaiz = input.nextInt();
            try {
                System.out.printf("Anda telah memilih saiz %s\n", saizPizza[pilihanSaiz - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanSaiz >= 4 | pilihanSaiz <= 0);
    }

    public static void minuman() {
        System.out.println("Pilih nombor untuk minuman:");
        String[] minuman = {"Pepsi", "Milo", "Lemon Tea"};

        for (int i = 0; i < minuman.length; i++) {
            System.out.printf("%s. %s\n", i+1, minuman[i]);
        }
        Scanner input = new Scanner(System.in);
        int pilihanMinuman;
        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanMinuman = input.nextInt();
            try {
                System.out.printf("Anda telah memilih saiz %s\n", minuman[pilihanMinuman - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanMinuman >= 4 | pilihanMinuman <= 0);
    }

    public static void resit() {
        int harga = PIZZA_PRICE;

        System.out.println("=====================================");
        System.out.println("         Restoran Pizza Hot");
        System.out.println("=====================================");
        System.out.printf("Harga pizza: RM \n");
        System.out.printf("Harga minuman: RM \n");
        System.out.printf("Jumlah harga: RM \n");
    }

    public static void main(String[] args) {
        LocalDateTime masa = LocalDateTime.now();
        DateTimeFormatter bikinFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatMasa = masa.format(bikinFormat);
        System.out.printf("Masa: %s\n", formatMasa);
        jenis();
        roti();
        cheese();
        saiz();
        minuman();
        resit();
    }
}
