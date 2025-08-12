//KM Mafora
//43031072
//Practical 6
import java.util.*;
public class Main {
    public static void main(String  args[]){
        boolean continueExe = true;
        Scanner scan  = new Scanner(System.in);

        do{
            try{
                int input = scan.nextInt();
                System.out.println("The entered number: " + input);
                System.out.println();


            }
            catch(InputMismatchException ex){
                System.out.println("Wrong number entered (try again)");
                scan.nextLine();
            }
        }
        while(continueExe);
    }
}
