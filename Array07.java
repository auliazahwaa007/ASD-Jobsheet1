import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlMk = sc.nextInt();
        sc.nextLine();

        String[] mk = new String[jmlMk];
        int[] sks = new int[jmlMk];
        String[] nilaiHuruf = new String[jmlMk];
        double[] nilaiAngka = new double[jmlMk];
        double[] bobotNilai = new double[jmlMk];

        for (int i = 0; i< jmlMk; i++){
            System.out.print("Masukkan nama mata kuliah ke-" + (i+1) + ": ");
            mk[i] = sc.nextLine();

            System.out.print("Masukkan jumlah sks: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < jmlMk; i++) {
            System.out.print("Masukkan Nilai Angka untuk Mata Kuliah " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        for (int i = 0; i < jmlMk; i++){
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");

        System.out.printf("%-30s %-10s %-12s %-10s %-12s\n", "Mata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalMutu = 0;
        int totalSks = 0;

        for (int i = 0; i < jmlMk; i++) {
            System.out.printf("%-30s %-10d %-12.2f %-10s %-12.2f\n", mk[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);

            totalMutu += bobotNilai[i] * sks[i];
            totalSks += sks[i]; 
        }
        double ip = totalMutu / totalSks;
        System.out.println("IP: " + ip);
    }    
}
