public class Main {
    public static void main(String[] args) {

        int initialAccount = 250;
        int bonusPart = 100;
        int depositAmount = 1220;
        int bonus;

        if (depositAmount >= 1000){
            bonus = depositAmount / bonusPart;
        } else {
            bonus = 0;
        }

        int totalAccount = initialAccount + depositAmount + bonus;

        System.out.println("Пополнили счёт на " + depositAmount + " руб.");
        System.out.println("Бонус составил " + bonus + " руб.");
        System.out.println("Сумма на счету " + totalAccount + " руб.");
    }
}


