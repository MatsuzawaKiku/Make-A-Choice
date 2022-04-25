import java.util.Random;
import java.util.random.RandomGenerator;

public class YesOrNo {
    public static void main(String[] args){
        Random random = new Random();
        //bound is total number of choice
        int aNum = random.nextInt(2);
        String[] yesNo = {"Yes", "No"};
        System.out.println(yesNo[aNum]);
    }
}
