import java.util.Scanner;

public class KaryawanKontrak {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        float jumlah_harian = 0.15f, tunjangan_anak = 0.2f;

        String nama;
        float upah_harian, tunjangan;

        System.out.println("Menghitung Gaji Karyawan Kontak");

        System.out.print("Nama Karyawan : ");
        nama = inputan.next();

        System.out.print("Upah Harian : Rp. ");
        upah_harian = inputan.nextFloat();

        tunjangan = jumlah_harian * upah_harian + tunjangan_anak;
        System.out.print("\n Tunjangan Sebesar : Rp. "+tunjangan);

        jumlah_harian = upah_harian+tunjangan;
        System.out.print("\n Total Upah : Rp. "+jumlah_harian);

        System.out.println("");
    }
}