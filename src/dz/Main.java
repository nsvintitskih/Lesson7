package dz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("Operation: 1- \"+\", 2-\"-\", 3- \"*\", 4- \"/.2f\",5- Error \n");
            int oper = scanner.nextInt();
            if (oper==5)System.exit(0);
            System.out.println("Enter the a");
            int a = scanner.nextInt();
            System.out.println("Enter the b");
            int b = scanner.nextInt();

            switch (oper) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    razn(a,b);
                    break;
                case 3:
                    umn(a,b);
                    break;
                case 4:
                    del(a,b);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");

            }
        }

    }
    static void sum(int a, int b) {
        System.out.printf("Summa  %d + %d =%d \n", a,b,a+b);
    }
    static void razn(int a, int b){
        System.out.printf("Razn  %d + %d =%d \n", a,b,a-b);
    }
    static void umn(int a, int b){
        System.out.printf("Umn  %d + %d =%d \n", a,b,a*b);}

    static void del(int a, int b){
        System.out.printf("Del  %d + %d =%d \n", a,b,(double)a/b);
    }

    }

