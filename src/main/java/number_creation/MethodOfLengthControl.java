package number_creation;

public class MethodOfLengthControl {

    public static boolean dortBasamakliMi(int tahmin){
        if (tahmin / 10000 >= 1 || tahmin / 1000 < 1){
            return  false;
        }else {
            return true;
        }
    }
}
