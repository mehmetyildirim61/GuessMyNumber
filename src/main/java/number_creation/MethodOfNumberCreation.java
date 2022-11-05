package number_creation;

public class MethodOfNumberCreation {
    static int binler;
    static int yuzler;
    static int onlar;
    static int birler;
    public static int createNumber() {


        binler = (int) (Math.random() * 10);
        while (true) {
            if (binler == 0) {
                binler = (int) (Math.random() * 10);
            } else {
                break;
            }
        }

        yuzler = (int) (Math.random() * 10);
        while (true) {
            if (yuzler == binler) {
                yuzler = (int) (Math.random() * 10);
            } else {
                break;
            }
        }

        onlar = (int) (Math.random() * 10);
        while (true) {
            if (onlar == yuzler || onlar==binler) {
                onlar = (int) (Math.random() * 10);
            } else {
                break;
            }
        }

        birler = (int) (Math.random() * 10);
        while (true) {
            if (birler == yuzler || birler==binler || birler==onlar) {
                birler = (int) (Math.random() * 10);
            } else {
                break;
            }
        }
        String stringSayi = "" + binler + "" + yuzler + "" + onlar + "" + birler;
        int sayi= Integer.valueOf(stringSayi);
        return sayi;
    }

    public static int[] arrayOfNumber(){
        int arr[]={birler, onlar, yuzler, binler};
        return arr;
    }

}
