import java.util.Scanner;

/**
 * Created by brand on 6/19/2017.
 */
public class Calculator {
    double numValue;
    Scanner sc = new Scanner(System.in);

    public void Calculator() {
        numValue = 0.00;
    }

    void calc(int choice) throws IllegalStateException, Exception {
        if (!(choice > 0 && choice < 6)) {
            throw new IllegalStateException();
        }
        switch (choice) {
            case 1: {
                System.out.println(numValue + " + ?");
                numValue += sc.nextDouble();
                break;
            }
            case 2: {
                System.out.println(numValue + " - ?");
                numValue -= sc.nextDouble();
                break;
            }
            case 3: {
                System.out.println(numValue + " * ?");
                numValue *= sc.nextDouble();
                break;
            }
            case 4: {
                System.out.println(numValue + " / ?");
                numValue /= sc.nextDouble();
                break;
            }
            case 5: {
                sc.nextLine();
                throw new Exception();
            }
        }
        sc.nextLine();
        return;
    }

    void displayMenu(double numValue) {
        System.out.println(numValue + "\n1: Add\n2: Sub\n3: Multiply\n4: Div\n5: Exit");
    }

    public void run() {
        while (true) {
            displayMenu(numValue);
            try {
                int choice = sc.nextInt();
                calc(choice);
            } catch (IllegalStateException e) {
                continue;
            } catch (Exception e) {
                return;
            }
        }
    }
}
