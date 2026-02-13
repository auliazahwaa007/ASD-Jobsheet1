public class Fungsi07 {

    public static int hitungPendapatan(int[] stockBunga, int[] hargaBunga) {
        int totalPendapatan = 0;
        for (int i = 0; i < stockBunga.length; i++) {
            totalPendapatan += stockBunga[i] * hargaBunga[i];
        }
        return totalPendapatan;
    }

    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return("Sangat Baik");
        } else {
            return("Perlu Evaluasi");
        }
    }
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        String[] namaCabangToko = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };
        System.out.println("====================================");
        System.out.println("Pendapatan Setiap Cabang RoyalGarden");
        System.out.println("====================================");
        
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock[i], hargaBunga);
            String status = cekStatus(pendapatan);

            System.out.println(namaCabangToko[i]);
            System.out.println("Pendapatan : Rp" + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("------------------------------------------");
        }
    }
}
