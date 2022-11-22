public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int final_score = balance + refill;
        int bonus = refill / 100 * 1;

        if (refill > 1000) {
            System.out.println("Благодарим вас за пополнение! Мы дарим вам " + bonus + " бонусных рублей.");
            System.out.println("Ваш баланс: " + (final_score + bonus));
        } else {
            System.out.println("Ваш баланс: " + final_score);

        }
    }
}
