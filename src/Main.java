public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1000_000;
        int time = 1, time2 = 2, time3 = 3;

        double percent = 9.99;

        double payment = service.calculate(summ, time, percent);
        double payment2 = service.calculate(summ, time2, percent);
        double payment3 = service.calculate(summ, time3, percent);

        System.out.println("1 год. Ваш ежемесячный платеж составит " + payment);
        System.out.println("2 года. Ваш ежемесячный платеж составит " + payment2);
        System.out.println("3 года. Ваш ежемесячный платеж составит " + payment3);



    }
}