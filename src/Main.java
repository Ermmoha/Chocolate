public class Main {
    public static void main(String[] args) {
        // Исходные данные
        int money = 15; // Деньги
        int price = 1;  // Цена за шоколадку
        int wrap = 3;   // Количество оберток для получения одной шоколадки

        // Подсчитываем количество шоколадок, которые можно купить на деньги
        int chocolatesBought = money / price;

        //Используем обертки для получения шоколадок
        int totalChocolates = chocolatesBought;
        int wrappers = chocolatesBought;

        // Используем обертки для получения дополнительных шоколадок
        while (wrappers >= wrap) {
            int extraChocolates = wrappers / wrap;  // Сколько дополнительных шоколадок можно получить
            totalChocolates += extraChocolates;     // Добавляем к общему числу шоколадок
            wrappers = wrappers % wrap + extraChocolates; // Остаток оберток + обертки от новых шоколадок
        }

        // Выводим итоговое количество шоколадок
        System.out.println("Максимальное количество шоколадок: " + totalChocolates);
    }
}