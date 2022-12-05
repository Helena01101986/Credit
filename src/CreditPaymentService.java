public class CreditPaymentService {
    public double calculate(int summ, int time, double percent) {
        double monthPercent = percent / 100 / 12; //процентная ставка за месяц
        double x = (1 + monthPercent); //переменная, которую возводим в степень
        int term = time * 12; //срок оплаты
        double payment = summ * ((monthPercent * Math.pow(x, term)) / (Math.pow(x, term)-1));
        return payment;
    }
}
