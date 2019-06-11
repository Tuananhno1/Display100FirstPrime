import java.util.Scanner;

public class Display100Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        System.out.printf("All first prime smaller than %d is: \n",number);
        if (number>=2){
            System.out.print(2);
        }
        for (int i=3;i<number;i+=2){
            if (isPrimeNumber(i)){
                System.out.print(" "+i);
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        if (number<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(number);i++){
            if (number%i == 0) return false;
        }
        return true;
    }
}
