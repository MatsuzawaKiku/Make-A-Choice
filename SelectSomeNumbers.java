import java.util.Random;

public class SelectSomeNumbers {
    public static void main(String[] args){
        Random random = new Random();
        //bound is total number of choice
        int num1 = random.nextInt(50);
        int num2 = random.nextInt(50);
        int num3 = random.nextInt(50);
        int num4 = random.nextInt(50);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }
}
