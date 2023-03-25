package Homeworks.ProgrammingHW.After1Sem;

import java.util.Scanner;

/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) {
        // task01();
        // task02();
        // task03();
        // task04();

    }
    static void task01(){
        /*
         * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
         */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для n-го треугольника: ");
        int number = scanner.nextInt();

        int TriangularNumber = 0;
        
        for (int i = 1; i <= number; i++) {
            TriangularNumber += i;
        }
        System.out.printf("Треугольное число введеного числа %d: %d\n", number, TriangularNumber); 
        // scanner.close();
    }
    static void task02(){
        /*
         * Вычислить n! (произведение чисел от 1 до n) (факториал)
         */
        System.out.println("Введите число для нахождения факториала этого числа: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;          
        }
        System.out.printf("Факториал числа %d! равен %d\n", number, factorial);
        // scanner.close();
    }
    static void task03(){
        /*
         * Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 
         * и на себя без остатка)
         */
        for (int i = 2; i <= 1000; i++) {
            boolean primeNumber = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }              
            }
            if (primeNumber) {
            System.out.print(i + " ");
        }
        }      
    }
    static void task04(){
        /*
         * Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstnumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondnumber = scanner.nextDouble();

        System.out.print("Enter the sign (+, -, *, /): ");
        char sign = scanner.next().charAt(0);

        double result = 0;

        switch(sign){
            case '+':
                result = firstnumber + secondnumber;               
                break;

            case '-':
                result = firstnumber - secondnumber;
                break;

            case '*':
                result = firstnumber * secondnumber;
                break;

            case '/':
                if (secondnumber == 0) {
                    System.out.println("Can't divide by zero");
                    System.exit(0); // без нее вывод 5.0 / 0.0 = Infinity
                }
                result = firstnumber / secondnumber;
                break;
            default:
                break;
        }
        System.out.println(firstnumber + " " + sign + " " + secondnumber + " = " + result);
        // scanner.close();
    }
}


