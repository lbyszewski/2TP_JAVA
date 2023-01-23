import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // klasy, metody i obiekty i konstruktory
        Person person = new Person("Arkadiusz", "Masalski",39,"Mezczyzna");
        person.showInfo();
        System.out.println("wprowadz x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        person.yearCalculation(x);






    }
}