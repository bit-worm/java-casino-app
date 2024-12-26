import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;


public class casino {
  public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int age, luckyNumber;
    double bet, winning, multiplyer = 0.0;

    System.out.println("Welcome to BITWORM casino!");
    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    scanner.close();

    if( age < 18 && age > 0 ) {
      JOptionPane.showMessageDialog(null, "YOU ARE TOO YOUNG!!\nbetting is strictly not for persons under the age of 18");
    }
    else if ( age >= 18 ) {
      bet = Double.parseDouble(JOptionPane.showInputDialog("Place your bet"));
      luckyNumber = Integer.parseInt(JOptionPane.showInputDialog("Choose your luckyNumber\nnumber is between 1 and 5"));
      if(luckyNumber == 2 || luckyNumber == 5){
        multiplyer = random.nextDouble(0.1, 2.2);
      }
      else if (luckyNumber == 3){
        multiplyer = random.nextDouble(0, 5);
      }
      else if ( luckyNumber == 1 ){
        multiplyer = random.nextDouble(0.5, 1.9);
      }
      else if ( luckyNumber == 4 ) {
        multiplyer = random.nextDouble(0.0007, 3.2);
      }
      
      winning = bet * multiplyer;

      JOptionPane.showMessageDialog(null, "!!CONGRATULATIONS!!\nYou've won " + winning);
    }
    else{
      System.out.println("Invalid age!!");
    }

    //System.out.println("Success!");

  }
}
