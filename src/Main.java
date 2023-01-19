public class Main {
    public static void main(String[] args) {
        int balance; // Остаток на счёте//
        int refill; // Сумма пополнения//
        int bonus; // Сумма начисляемых бонусов//

        balance = 243;
        refill = 1900;

        if (refill > 1000) {
            bonus = refill / 100;
            balance = balance + refill + bonus;
        } else {
            balance = balance + refill;
            bonus = 0;
        }
        System.out.println("Зачислено на счёт " + refill + "; Также начислено бонусов " + bonus + "; Итоговая сумма составляет " + balance);

    }
}
