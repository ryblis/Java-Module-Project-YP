import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите название машины №" + i + ": ");
            String name = scanner.next();
// использовал метод try-catch который мы не проходили пока что. Интернет и друг сказали что лучшее всего использовать его)
            int speed;
            while (true) {
                System.out.print("Введите скорость машины №" + i + ": ");
                try {
                    speed = scanner.nextInt();


                    if (speed < 0 || speed > 250) {
                        System.out.println("Неправильная скорость. Пожалуйста, введите скорость от 0 до 250.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибочный ввод. Пожалуйста, введите целое число от 0 до 250.");
                    scanner.next();
                }
            }
            Car car = new Car(name, speed);
            race.determineNewLeader(car);
        }
        System.out.println("Самая быстрая машина: " + race.currentLeader);
        scanner.close();
    }
}