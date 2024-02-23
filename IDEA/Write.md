public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int NachSchet = 100;
        int symm = 1100;
        if (symm < 1000) {
            int balans = symm + NachSchet;
            System.out.println(balans);
        }
        if (symm >= 1000) {
            int BalansBonus = symm / 100 + symm + NachSchet;
            System.out.println(BalansBonus);
        }
    }
}