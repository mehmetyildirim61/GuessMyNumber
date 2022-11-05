package number_creation;

public class ExplanationOfTheGame {

    public static void explanationOfTheGame(){

        System.err.println("\t\t\t\t\t\t\t\t***Sayi oyunu nasil oynanir?***");
        System.out.println("1- Java 4 haneli, 0 ile baslamayan, rakamlari birbirinden farkli rastgele bir sayi secer. \n" +
                "2- Oyuncu asagidaki ipuclarini kullanarak en fazla 10 adimda sayiyi bulmaya calisir.\n" +
                "      * Tahminde bulundugu herbir sayi icin;\n" +
                "            - program gercek sayi ile ayni basamakta eslesen herbir rakam icin +1 deger artirir\n" +
                "            - gercek sayida var olan, ama farkli basamakta yer alan her bir rakam icin -1 deger artirir.\n" +
                " Program tarafindan verilen ve gercek sayiya ne kadar yaklasildigini gosteren bu + ve - degerlerin degerlendirilmesiyle\n" +
                " asil sayi bulunmaya calisilir.\n" +
                "   \n" +
                "        *** ORNEK ***\n" +
                " Java'nin sectigi sayi: 9261 olsun\n" +
                " Oyuncunun 1. Tahmini: 1234 olursa program \"+1, -1\" verecektir. Cunku 2 ve 1 sayisi gercek sayida var.\n" +
                " Bunlardan 2 rakami gercek sayidakiyle ayni basamakta (yuzler) oldugundan program +1 verir.\n" +
                " 1 rakami ise gercek sayida birler basamaginda iken tahmin sayisinda binler basamagindadir. Program -1 verir\n" +
                " Tahmin sayisindaki diger 2 rakam (3 ve 4) gercek sayida bulunmadigindan onlara program deger vermez\n" +
                "           2. Tahmini: 5678 olursa, ayni mantikla program -1 degeri verir( tutturulan 6 rakami icin)\n" +
                "           3. Tahmini: 9065 olursa +2 verir (yerleriyle beraber dogru tutturulan 9 ve 6 icin)\n" +
                "           ** Bu sekilde tahminler devam ederek sayi bulunmaya calisilir. Kolay gelsin.\n\n");
    }
}
