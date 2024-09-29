import java.util.Scanner;

public class hitungpangkat2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang ingin dipangkatkan dua: ");
        int bilangan = scanner.nextInt();

        int hasil = hitungPangkatDua(bilangan);

        System.out.println("Hasil " + bilangan + " pangkat dua adalah: " + hasil);
    }

    public static int hitungPangkatDua(int n) {
        int hasil = 1;
        for (int i = 0; i < 2; i++) {  
            hasil *= n;  
        }
        return hasil;  

    }
}