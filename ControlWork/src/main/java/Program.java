import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean работаЗавершена = false;

        while (!работаЗавершена) {
            System.out.println("Выберите действие:");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Определить животное в правильный класс");
            System.out.println("3. Увидеть список команд, которое выполняет животное");
            System.out.println("4. Обучить животное новым командам");
            System.out.println("5. Выход");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    // Логика для заведения нового животного
                    System.out.println("Выберите тип животного (Собака кошка хомяк)");
                    String animalType = scanner.next();
                    System.out.println("Введите кличку животного:");
                    String name = scanner.next();
                    System.out.println("Введите возраст животного:");
                    int age = scanner.nextInt();
                    break;
                case 2:
                    // Логика для определения животного в правильный класс
                    break;
                case 3:
                    // Логика для отображения списка команд, которые выполняет животное
                    break;
                case 4:
                    // Логика для обучения животного новым командам
                    break;
                case 5:
                    работаЗавершена = true;
                    break;
                default:
                    System.out.println("Некорректный выбор, выберите снова. ");
            }
        }
        System.out.println("Работа завершена");
    }
}
