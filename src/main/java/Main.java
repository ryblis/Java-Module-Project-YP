import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите название машины №" + i + ": ");
            String name = scanner.next();

            int speed;
            while (true) {
                System.out.print("Введите скорость машины №" + i + ": ");
                speed = scanner.nextInt();
                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Неправильная скорость. Пожалуйста, введите скорость от 1 до 250.");
                }
            }
            Car car = new Car(name, speed);
            race.determineNewLeader(car);
        }
        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
        scanner.close();
    }
}