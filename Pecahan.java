class Pecahan {
    int pembilang;
    int penyebut;

    public Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    // Static method untuk penjumlahan
    public static Pecahan tambah(Pecahan a, Pecahan b) {
        int pemb = a.pembilang * b.penyebut + b.pembilang * a.penyebut;
        int peny = a.penyebut * b.penyebut;
        return new Pecahan(pemb, peny).sederhana();
    }

    // Static method untuk pengurangan
    public static Pecahan kurang(Pecahan a, Pecahan b) {
        int pemb = a.pembilang * b.penyebut - b.pembilang * a.penyebut;
        int peny = a.penyebut * b.penyebut;
        return new Pecahan(pemb, peny).sederhana();
    }

    // Non-static method untuk perkalian
    public Pecahan kali(Pecahan b) {
        int pemb = this.pembilang * b.pembilang;
        int peny = this.penyebut * b.penyebut;
        return new Pecahan(pemb, peny).sederhana();
    }

    // Non-static method untuk pembagian
    public Pecahan bagi(Pecahan b) {
        int pemb = this.pembilang * b.penyebut;
        int peny = this.penyebut * b.pembilang;
        return new Pecahan(pemb, peny).sederhana();
    }

    // Method non-static untuk menyederhanakan
    public Pecahan sederhana() {
        int gcd = gcd(pembilang, penyebut);
        return new Pecahan(pembilang / gcd, penyebut / gcd);
    }

    // Fungsi GCD (FPB)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return pembilang + "/" + penyebut;
    }
}
