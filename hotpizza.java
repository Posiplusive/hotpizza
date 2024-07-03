import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class hotpizza {
    // Constants initialization
    // Pizza
    public static final double PIZZA_PRICE = 10.00;

    // Bread
    public static final double PAN_PIZZA = 5.00;
    public static final double HAND_STRETCH = 15.00;
    public static final double STUFFED_CRUST = 20.00;

    // Cheese
    public static final double DOUBLE = 1.50;
    public static final double TRIPLE = 3.00;

    // Size
    public static final double SMALL = 1.00;
    public static final double MEDIUM = 1.50;
    public static final double LARGE = 2.00;

    // Drinks
    public static final double PEPSI = 1.50;
    public static final double MILO = 3.00;
    public static final double LEMON_TEA = 1.50;

    public static void jenis() {
        System.out.println("%nPilih nombor untuk jenis pizza:");
        String[] jenisPizza = {"Aloha Chicken", "Beef Pepperoni", "Chicken Delight", "Deluxe Cheese", "Island Tuna"};
        for (int i = 0; i < jenisPizza.length; i++) {
            System.out.printf("%s. %s%n", i + 1, jenisPizza[i]);
        }

        Scanner input = new Scanner(System.in);
        int pilihanJenis;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanJenis = input.nextInt();
            try {
                System.out.printf("Anda telah memilih %s%n%n", jenisPizza[pilihanJenis - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanJenis >= 6 | pilihanJenis <= 0);
    }

    public static double roti() {
        System.out.println("Pilih nombor untuk jenis roti:");
        String[] jenisRoti = {"Pan Pizza", "Hand Stretched", "Stuffed Crust"};

        for (int i = 0; i < jenisRoti.length; i++) {
            System.out.printf("%s. %s%n", i+1, jenisRoti[i]);
        }

        Scanner input = new Scanner(System.in);
        int pilihanRoti;
        double hargaRoti = 0;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanRoti = input.nextInt();
            try {
                hargaRoti = switch (pilihanRoti) {
                    case 1 -> PAN_PIZZA;
                    case 2 -> HAND_STRETCH;
                    case 3 -> STUFFED_CRUST;
                    default -> hargaRoti;
                };
                System.out.printf("Anda telah memilih %s%n%n", jenisRoti[pilihanRoti - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanRoti >= 4 | pilihanRoti <= 0);
        return hargaRoti;
    }

    public static double cheese() {
        System.out.println("Extra cheese:");
        String[] jenisCheese = {"None", "Double", "Triple"};

        for (int i = 0; i < jenisCheese.length; i++) {
            System.out.printf("%s. %s%n", i+1, jenisCheese[i]);
        }
        Scanner input = new Scanner(System.in);
        int pilihanCheese;
        double hargaCheese = 0;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanCheese = input.nextInt();
            try {
                hargaCheese = switch (pilihanCheese) {
                    case 2 -> DOUBLE;
                    case 3 -> TRIPLE;
                    default -> hargaCheese;
                };
                System.out.printf("Anda telah memilih %s Cheese%n%n", jenisCheese[pilihanCheese - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanCheese >= 4 | pilihanCheese <= 0);
        return hargaCheese;
    }

    public static double saiz() {
        System.out.println("Pilih nombor untuk saiz pizza:");
        String[] saizPizza = {"Kecil", "Sederhana", "Besar"};

        for (int i = 0; i < saizPizza.length; i++) {
            System.out.printf("%s. %s%n", i+1, saizPizza[i]);
        }
        Scanner input = new Scanner(System.in);
        int pilihanSaiz;
        double hargaSaiz = 0;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanSaiz = input.nextInt();
            try {
                hargaSaiz = switch (pilihanSaiz) {
                    case 1 -> SMALL;
                    case 2 -> MEDIUM;
                    case 3 -> LARGE;
                    default -> hargaSaiz;
                };
                System.out.printf("Anda telah memilih saiz %s%n%n", saizPizza[pilihanSaiz - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanSaiz >= 4 | pilihanSaiz <= 0);
        return hargaSaiz;
    }

    public static double minuman() {
        System.out.println("Pilih nombor untuk minuman:");
        String[] minuman = {"Pepsi", "Milo", "Lemon Tea"};

        for (int i = 0; i < minuman.length; i++) {
            System.out.printf("%s. %s%n", i+1, minuman[i]);
        }
        Scanner input = new Scanner(System.in);
        int pilihanMinuman;
        double hargaMinuman = 0;

        do {
            System.out.print("Pilihan: ");
            input.reset();
            pilihanMinuman = input.nextInt();
            try {
                hargaMinuman = switch (pilihanMinuman) {
                    case 1 -> PEPSI;
                    case 2 -> MILO;
                    case 3 -> LEMON_TEA;
                    default -> hargaMinuman;
                };
                System.out.printf("Anda telah memilih saiz %s%n%n", minuman[pilihanMinuman - 1]);
            } catch (Exception e) {
                System.out.println("Pilihan tiada dalam senarai.");
            }
        } while (pilihanMinuman >= 4 | pilihanMinuman <= 0);
        return hargaMinuman;
    }

    public static void resit() {
        double harga = PIZZA_PRICE + roti() + cheese() + saiz();
        double hargaDrink = minuman();
        DecimalFormat i = new DecimalFormat(".00");

        System.out.println("=====================================");
        System.out.println("         Restoran Pizza Hot");
        System.out.println("=====================================");
        System.out.printf("Harga pizza: RM %s%n", i.format(harga));
        System.out.printf("Harga minuman: RM %s%n", i.format(hargaDrink));
        System.out.printf("Jumlah harga: RM %s%n", i.format(harga + hargaDrink));
    }

    public static void main(String[] args) {
        LocalDateTime masa = LocalDateTime.now();
        DateTimeFormatter bikinFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatMasa = masa.format(bikinFormat);
        System.out.printf("Masa: %s%n", formatMasa);
        jenis();
        resit();
    }
}
