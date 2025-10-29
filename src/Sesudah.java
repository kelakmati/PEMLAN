import java.text.DecimalFormat;
import java.util.Scanner;

// --- Class Barang (memisahkan data barang) ---
class Barang {
    private String nama;
    private int harga;
    private int jumlah;

    public Barang(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    /**
     * mendapatkan nilai total
     * @return
     */

    public int getSubtotal() {
        return harga * jumlah;
    }

    public String getNama() {
        return nama;
    }
}

// --- Class utama ---
public class Sesudah {
    private static final DecimalFormat formatRupiah = new DecimalFormat("#,###");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Total Belanja Online ===");
        int jumlahBarang = inputAngka(input, "Masukkan jumlah barang: ");

        Barang[] daftarBarang = new Barang[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + (i + 1));
            System.out.print("Nama Barang: ");
            String nama = input.nextLine();

            int harga = inputAngka(input, "Harga Barang: ");
            int jumlah = inputAngka(input, "Jumlah Beli: ");

            daftarBarang[i] = new Barang(nama, harga, jumlah);
        }

        int total = hitungTotal(daftarBarang);
        double diskon = hitungDiskon(total);
        double totalBayar = total - diskon;

        tampilkanStruk(total, diskon, totalBayar);
    }

    /**
     *
     * @param input
     * Meminta user untuk memasukkan angka.
     * @param pesan
     * apabila memasukkan input selain angka maka akan error
     * @return
     */
    private static int inputAngka(Scanner input, String pesan) {
        int nilai = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(pesan);
                nilai = Integer.parseInt(input.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harus angka.");
            }
        }
        return nilai;
    }

    /**
     *
     * @param daftar
     * Menghitung total barang
     * @return
     */
    private static int hitungTotal(Barang[] daftar) {
        int total = 0;
        for (Barang b : daftar) {
            total += b.getSubtotal();
        }
        return total;
    }

    /**
     * Menghitung total diskon.
     * Apbila user membeli barang di atas 500 ribu, maka diskon 10%
     * Apabia user membeli barang di atas 300 ribu, maka diskon 5%
     * @param total
     * @return
     */
    private static double hitungDiskon(int total) {
        if (total >= 500000) return total * 0.1;
        else if (total >= 300000) return total * 0.05;
        else return 0;
    }

    /**
     * Menampilkan struk belanja. Berisi total harga barang, diskon dan total bayar.
     * @param total
     * @param diskon
     * @param totalBayar
     */
    private static void tampilkanStruk(double total, double diskon, double totalBayar) {
        System.out.println("\n=== Struk Belanja ===");
        System.out.println("Total Harga Barang : Rp" + formatRupiah.format(total));
        System.out.println("Diskon             : Rp" + formatRupiah.format(diskon));
        System.out.println("Total Bayar        : Rp" + formatRupiah.format(totalBayar));
        System.out.println("AKU CINTA HMIF");
    }

}
