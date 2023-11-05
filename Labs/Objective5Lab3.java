import java.util.Scanner;
public class Objective5Lab3 {
    public static void main(String[] args) {
      int userNum;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();
      if (userNum > 0){
        System.out.println("The number is positive ");
      }
      else if(userNum == 0){
        System.out.println("The number is equal to 0");
      }
      else{ 
        System.out.println("The number is negative");
      }
      scanner.close();
  }
}