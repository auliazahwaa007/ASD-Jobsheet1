import java.util.Scanner;

public class PraktikumPemilihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas = sc.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");
        
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double tugas = 0.2, kuis = 0.2, uts = 0.3, uas = 0.3;
            double nilaiAkhir = ((nilaiTugas * tugas) + (nilaiKuis * kuis) + (nilaiUts * uts) + (nilaiUas * uas));
            double totalNilaiAkhir = nilaiAkhir; 
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            String nilaiHuruf;
            
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");


            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equalsIgnoreCase("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("TIDAK LULUS");
            }
        }
    }   
}
