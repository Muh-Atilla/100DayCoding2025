import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Variabel untuk menyimpan data
        String nama, alamat, noHp;
        int umur;

        // Input data dari pengguna
        System.out.print("Masukkan nama lengkap Anda: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        umur = input.nextInt();
        input.nextLine(); // Membersihkan newline

        System.out.print("Masukkan alamat Anda: ");
        alamat = input.nextLine();

        System.out.print("Masukkan nomor HP Anda: ");
        noHp = input.nextLine();

        // Menampilkan biodata
        System.out.println("\n===== BIODATA ANDA =====");
        System.out.println("baring kosong");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Alamat       : " + alamat);
        System.out.println("No. HP       : " + noHp);

    }
}