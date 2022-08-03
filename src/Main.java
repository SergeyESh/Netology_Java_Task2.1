public class Main {
    public static void main(String[] args) {

        int ticket = 15_000; // Стоимость билета
        int mile = 20; // Коэффициент для расчета бонусных миль
        int bonus = ticket / mile; // Количество бонусных миль

        System.out.println(("Количество бонусных миль: ") + bonus);

    }
}