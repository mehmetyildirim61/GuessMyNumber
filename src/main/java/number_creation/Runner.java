package number_creation;

import java.util.Scanner;

import static number_creation.ExplanationOfTheGame.explanationOfTheGame;
import static number_creation.MethodOfLengthControl.dortBasamakliMi;
import static number_creation.MethodOfNumbersControl.*;
import static number_creation.MethodOfNumberCreation.*;

public class Runner {
    public static void main(String[] args) {

        int sayi=createNumber();

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi oyununu daha once oynadiniz mi? Evet icin E'ye, hayir icin herhangi bir tusa basin.");
        if (input.next().toUpperCase().charAt(0)!='E'){
            explanationOfTheGame();
        }

        System.out.println("Lutfen 4 basamakli sayi tahminlerinizi yaziniz. Dogru sayiyi bulmak icin 10 hakkiniz var");

        int k = 1;
        do {
            System.out.println(k + ". sayi tahmininizi giriniz:");
            String tahminString = input.next();

            if (karakterlerDigitMi(tahminString)==false){
                System.out.println("Girdiginiz tum karakterler rakam olmalidir.\nBastan baslayin");
                break;
            }
            int tahmin = Integer.valueOf(tahminString);

            if (dortBasamakliMi(tahmin) == false) {
                System.out.println("Girdiginiz sayi 0 ile baslamayan, 4 basamakli bir sayi olmalidir\nBastan baslayin");
                break;
            }
            if (sayilarFarkliMi(tahmin) == false) {
                System.out.println("Girdiginiz sayidaki tum rakamlar farkli olmalidir.\nBastan baslayin");
                break;
            }
            if(sayi==tahmin){
                System.out.println("*****Tebrikler! Kazandiniz*****");
                break;

            }else {
                int counter = 0;

                if (binler == binler2) {
                    counter++;
                }
                if (yuzler == yuzler2) {
                    counter++;
                }
                if (onlar == onlar2) {
                    counter++;
                }
                if (birler == birler2) {
                    counter++;
                }
                int count = 0;

                for (int w : arrayOfNumber()) {
                    for (int i : arrayOfEstimation()) {
                        if (w == i) {
                            count--;
                        }
                    }
                }
                System.out.println(tahmin + ": +" + counter + ", " + (count + counter));
            }++k;
        } while (k <= 10);

        System.out.println("***Dogru sayi==> " + sayi + "\nTekrar Deneyin.");
    }
}

