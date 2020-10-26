package datemychild;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author emergon
 */
public class DateMyChild {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        boolean ageOk = age >= 25 && age < 45;//boolean && boolean

        System.out.println("What is your income?");
        double income = scanner.nextDouble();
        boolean incomeOk = income > 15000;

        System.out.println("How cute are you?");
        double cute = scanner.nextDouble();
        boolean cuteOk = cute > 8.3;

        boolean permission = ageOk && (incomeOk || cuteOk);
        if (permission == true) {
            System.out.println("You can take my child");
        } else {
            if (cuteOk == true) {
                if (ageOk == false) {
                    System.out.println("You cannot take my child. Not valid age");
                }
                if (incomeOk == false) {
                    System.out.println("You cannot take my child because of income");
                }
            } else {
                if (ageOk == false) {
                    System.out.println("You cannot take my child. Not valid age. Not cute");
                }
                if (incomeOk == false) {
                    System.out.println("You cannot take my child because of income. Not cute");
                }
            }
        }

//15   && 1000     || 9.0
        //false            || true
        //false   &&        true = false
        //System.out.println("permission to take is "+permission);
        //Αν καλύπτεις τις προυποθέσεις μπορείς να βγεις βόλτα με το παιδί μου
//        permission == true;//true
//        permission != true;
//        if(permission == true){
//            System.out.println("Ok you can take out my child");
//        }
//        if(permission == false){
//            if(ageOk!=true){
//                System.out.println("You are too young or too old");
//                if(incomeOk != true){
//                    System.out.println("You don't have enough income");
//                }
//                if(cuteOk != true){
//                    System.out.println("You are not cute");
//                }
//            }
//            if(ageOk == true){
//                System.out.println("You are in the right age but...");
//                if(incomeOk != true){
//                    System.out.println("You don't have enough income");
//                }
//                if(cuteOk != true){
//                    System.out.println("You are not cute");
//                }
//            }
//            System.out.println("So...you cannot take out my child");
//        }
    }
}
