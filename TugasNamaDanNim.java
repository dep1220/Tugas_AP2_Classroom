package kuliah.tugas_dari_classroom;
import java.io.IOException;
import java.util.Scanner;
public class TugasNamaDanNim {
  public static void main(String[] args)throws IOException, InterruptedException {
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    Scanner input = new Scanner(System.in);
    String nama;
    long nim;

    System.out.print("Masukkan Nama Anda : ");
    nama = input.nextLine();
    System.out.print("Masukkan NIM Anda  : ");
    nim = input.nextLong();

    System.out.println();
    System.out.println("==================================");
    System.out.println("=== Data Yang Sudah di Masukan ===");
    System.out.println("==================================");
    System.out.println("Nama : " + nama);
    System.out.println("NIM  : " + nim);
    input.close();
  }
}
