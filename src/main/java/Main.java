import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int bound = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            source.add(random.nextInt(bound));
        }
        System.out.println("Вот случайный список:");
        for (Integer i : source) {
            System.out.print(i + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        source = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:");
        for (Integer i : source) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}