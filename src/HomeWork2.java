import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args){
     Scanner in = new Scanner (System.in);
        System.out.println("Назвіть своє ім'я:");
        String name = in.nextLine();

        System.out.println("В якому місті ви живете:");
        String city = in.nextLine();

        System.out.println("Яке у вас хобі:");
        String hobby = in.nextLine();

        System.out.println("Назвіть свій вік:");
        int age = in.nextInt();

        System.out.println("Ім'я:" + " "+ name);
        System.out.println("Місто:" + " " + city);
        System.out.println("Хоббі:"  + " " + hobby);
        System.out.println("Вік:"  + " " + age);
    }
}
