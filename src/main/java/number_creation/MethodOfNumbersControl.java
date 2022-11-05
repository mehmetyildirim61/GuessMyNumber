package number_creation;

public class MethodOfNumbersControl {
        static int birler2;
        static int onlar2;
        static int yuzler2;
        static int binler2;

        public static boolean sayilarFarkliMi(int tahmin){

         birler2 = tahmin % 10;
         onlar2 = (tahmin / 10) % 10;
         yuzler2 = (tahmin / 100) % 10;
         binler2 = (tahmin / 1000) % 10;

            if (binler2 == yuzler2 || binler2 == onlar2 || binler2 == birler2 || yuzler2 == onlar2 || yuzler2 == birler2 || onlar2 == birler2) {
                return false;
            }else{
                return true;
            }
    }
    public static boolean karakterlerDigitMi(String str){
        if(str.replaceAll("[0-9]","").length()>0){
            return false;
        }else{
            return true;
        }
    }
    public static int[] arrayOfEstimation(){
        int arr[]={birler2, onlar2, yuzler2, binler2};
        return arr;
    }
}
