public class Main {
    public static void main(String[] args) {
        int a; // Начальный счёт клиента//
        int b; // Сумма пополнения//
        int c; // Сумма начисляемых бонусов//

        a= 243;
        b= 1900;

        if (b>1000) {
            c=b/100;
            a=a+b+c;}
        else {
            a = a + b;
            c = 0;
        }
        System.out.println("Зачислено на счёт " + b + "; Также начислено бонусов " + c + "; Итоговая сумма составляет "+a);

    }
}
