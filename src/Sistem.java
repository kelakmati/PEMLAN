import java.util.Scanner;

public class Sistem {
    class Barang {
        public String nama;
        private int harga;
        private int jumlah;

        public Barang(String nama, int harga, int jumlah) {
            this.nama = nama;
            this.harga = harga;
            this.jumlah = jumlah;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== Program Hitung Total Belanja Online ===");

            System.out.print("Masukkan jumlah barang: ");
            int jumlahBarang = input.nextInt();
            input.nextLine(); // membersihkan buffer

            String[] namaBarang = new String[jumlahBarang];
            int[] hargaBarang = new int[jumlahBarang];
            int[] qtyBarang = new int[jumlahBarang];

            int total = 0;

            for (int i = 0; i < jumlahBarang; i++) {
                System.out.println("\nBarang ke-" + (i + 1));
                System.out.print("Nama Barang: ");
                namaBarang[i] = input.nextLine();
                System.out.print("Harga Barang: ");
                hargaBarang[i] = input.nextInt();
                System.out.print("Jumlah Beli: ");
                qtyBarang[i] = input.nextInt();
                input.nextLine();

                total = total + (hargaBarang[i] * qtyBarang[i]);
            }

            double diskon;
            if (total >= 500000) {
                diskon = 0.1 * total;
            } else if (total >= 300000) {
                diskon = 0.05 * total;
            } else {
                diskon = 0;
            }

            double totalBayar = total - diskon;

            System.out.println("\n=== Struk Belanja ===");
            System.out.println("Total Harga Barang : Rp" + total);
            System.out.println("Diskon             : Rp" + diskon);
            System.out.println("Total Bayar        : Rp" + totalBayar);
        }
    }
}
