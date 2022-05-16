import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int copyNumber = number;
        int copyNumberOrg = copyNumber;
        int b;
        int power = 1;
        int copyPower = 0;
        int copySum = 0;
        int basamak = 0;


            while(number != 0){
                number /= 10;
                basamak++;
            }

        for (int a = 0; a < basamak; a++){
            b = copyNumber%10;
            for (int c = 0; c < basamak ; c++){
                power *= b;
                copyPower = power;
            }
            power=1;
               copySum += copyPower;
               copyNumber/=10;
        }

        if (copySum == copyNumberOrg)
            System.out.println( copyNumberOrg+" Armstrong sayidir.");
            else
            System.out.println( copyNumberOrg+" Armstong sayi degildir!");
    }
}
