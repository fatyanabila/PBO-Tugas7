import java.util.Scanner;

public class KaryawanTetap {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        float Tunjangan_anak = 0.2f;
        String nama;
        float gaji_pokok, total_gaji, tunjangan;

        System.out.println("Menghitung Gaji Karyawan");
        System.out.print("Nama Karyawan : ");
        nama = inputan.next();

        System.out.print("Gaji pokok : Rp. ");
        gaji_pokok = inputan.nextFloat();

        tunjangan = Tunjangan_anak + gaji_pokok;
        System.out.print("\n Tunjangan Sebesar : Rp. "+tunjangan);

        total_gaji = gaji_pokok+tunjangan;
        System.out.print("\n Total Gaji Karyawan : Rp. "+total_gaji);

        System.out.println("");
    }
}
