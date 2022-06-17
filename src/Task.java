import java.sql.SQLOutput;
import java.util.Scanner;

public class Task {

    static double doubleCheck (Scanner sc) {
        while (sc.hasNextLine()) {
            String z = sc.nextLine();
            double j;
            try {
                j = Double.parseDouble(z);
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect input! Try again");
                continue;
            }
            if ((Double.isInfinite(j)) || (Double.isNaN(j))) {
                System.out.println("Incorrect input! Try again");
            } else {
                return j;
            }
        }
        return 0;
    }
    static int intCheck(Scanner ik) {
        while (ik.hasNextLine()) {
            String z = ik.nextLine();
            int x;
            try {
                x = Integer.parseInt(z);
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect input! Try again");
                continue;
            }
            if (Math.ceil(x) == x) {
                return x;
            } else {
                System.out.println("Incorrect input! Try again");
            }
        }
        return 0;
    }
    static void func1(double a, double b) {
        double c = a;
        System.out.println("The task is to swap the values of variables a = " + a + " b = " + b);
        a = b;
        b = c;
        System.out.println("Result: a = " + a + " b = " + b);
    }
    static int func2 (Scanner ik) {
        int res=0;
        System.out.println("Enter x, where x is an integer - ");
        int x = intCheck(ik);
        System.out.println("Enter y, where y is an integer - ");
        int y = intCheck(ik);
        if (x == 0 || y == 0) {
            System.out.println("Result = 0");
            return 0;
        }
        for (int i = 0; i < Math.abs(y); i++){
            res += x;
        }
        if (y<0){
            res = 0 - res;
        }
        System.out.println("Result = " + res);
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int point = 1;
        while (point == 1) {
            System.out.println("Choose: 1 - first task, 2 - second task, 3 - exit");
            int num = intCheck(in);
            switch (num) {
                case 1:
                    System.out.println("You choose 1 task");
                    System.out.println("Enter a, where a is a number - ");
                    int a = intCheck(in);
                    System.out.println("Enter b, where b is a number - ");
                    int b = intCheck(in);
                    func1(a, b);
                    break;
                case 2:
                    System.out.println("You choose 2 task");
                    func2(in);
                    break;
                case 3:
                    System.out.println("Exit!");
                    point = 0;
                    break;
                default:
                    System.out.println("Incorrect input! Try again");
                    break;
            }
        }
    }
}
