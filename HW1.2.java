import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 9;
        int b = 4;
        int p = 4;
        int k;
        int np;
        int na; 

        System.out.println("Введите номер квартиры: ");
        k = sc.nextInt();

        if (k > a * b * p) {
            System.out.println("Такой квартиры нет в этом доме");
        } else {
           np = 1 + (k-1)/(a*b);
           na = ((k-1)%(a*b))/b + 1;
           System.out.println("Подъезд =" + np);
           System.out.println("Этаж =" + na);
        }

    }
}