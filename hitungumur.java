import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class hitungumur {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tahun lahir (contoh: 1990): ");
        int TahunLahir = scanner.nextInt();

        System.out.println("Masukkan bulan lahir (contoh: 5): ");
        int BulanLahir = scanner.nextInt();

        System.out.println("Masukkan tanggal lahir (contoh: 15): ");
        int  tanggalLahir = scanner.nextShort();

        LocalDate tanggalHariIni = LocalDate.now();

        LocalDate tanggalLahirPengguna = LocalDate.of(TahunLahir, BulanLahir, tanggalLahir);

        Period selisihUmur = Period.between(tanggalLahirPengguna, tanggalHariIni);

        System.out.println("Umur Anda Adalah: " + selisihUmur.getYears() + " tahun " + selisihUmur.getMonths() + " bulan " + selisihUmur.getDays() + " hari. ");

        scanner.close();
    }
    
}