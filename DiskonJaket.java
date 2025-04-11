import java.util.Scanner;

public class DiskonJaket {
    // Harga final (tetap) sesuai catatan soal
    static final int FINAL_HARGA_A = 100000;
    static final int FINAL_HARGA_B = 125000;
    static final int FINAL_HARGA_C = 175000;

    // Harga diskon jika beli > 100
    static final int DISKON_HARGA_A = 95000;
    static final int DISKON_HARGA_B = 120000;
    static final int DISKON_HARGA_C = 160000;

    public static int hitungHarga(String jenis, int jumlah) {
        int hargaPerItem;

        switch (jenis.toUpperCase()) {
            case "A":
                hargaPerItem = (jumlah > 100) ? DISKON_HARGA_A : FINAL_HARGA_A;
                break;
            case "B":
                hargaPerItem = (jumlah > 100) ? DISKON_HARGA_B : FINAL_HARGA_B;
                break;
            case "C":
                hargaPerItem = (jumlah > 100) ? DISKON_HARGA_C : FINAL_HARGA_C;
                break;
            default:
                System.out.println("Jenis jaket tidak valid.");
                return 0;
        }

        return hargaPerItem * jumlah;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis jaket (A/B/C): ");
        String jenis = scanner.nextLine();

        System.out.print("Masukkan jumlah pembelian: ");
        int jumlah = scanner.nextInt();

        int totalHarga = hitungHarga(jenis, jumlah);
        System.out.println("Total harga: Rp " + totalHarga);
    }
}
