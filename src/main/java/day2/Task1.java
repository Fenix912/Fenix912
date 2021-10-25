package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int etazhi = scanner.nextInt();
        if(etazhi <= 0) {
            System.out.println("Ошибка ввода");
        }else if(etazhi <= 4){
            System.out.println("Малоэтажный дом");
        }else if(etazhi <= 8){
            System.out.println("Среднеэтажный дом");
        }else if(etazhi >= 9){
            System.out.println("Многоэтажный дом");
        }

    }
}
