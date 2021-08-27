package pro.sky.java.course1.lesson1;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        boolean liteVersion = clientDeviceYear < 2019;
        if (clientOS == 0) {
            if (liteVersion) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {

            if (liteVersion) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
        }
    }


    private static void task3() {
        int year = 2020;
        if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает 1 день");
        } else if (deliveryDistance > 21 && deliveryDistance < 60) {
            System.out.println("Доставка занимает 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка занимает 3 дня");

        }
    }

    private static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }

    private static void task6() {
        int age = 19;
        int salary = 58_000;
        float limit;

        if (age > 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
            if (salary > 50_000) {
                limit = limit * 1.2f;
            } else if (salary > 80_000) {
                limit = limit * 1.5f;
            }
        }
        System.out.println("Мы готовы выдать вам крудитную карту с лимитом " + limit + " рублей");
    }

    private static void task7() {
        int age = 25;
        int salary = 60_000;
        float wantedSum = 330_000;
        float annualPer = 10;
        int termMonths = 12;
        int maxPayMonPer = 50;
        if (age < 23) {
            annualPer = annualPer + 1;
        } else if (age < 30) {
            annualPer = annualPer + 0.5f;
            if (salary > 80_000) {
                annualPer = annualPer - 0.7f;
            }
        }
        annualPer = annualPer;
        float creditSum = wantedSum + (wantedSum * annualPer / 100);
        float sumPayInMon = creditSum / termMonths;
        float maxAllowablePay = salary * maxPayMonPer / 100;
        System.out.println("Максимальный платеж при зп " + salary + " рублей" + " равен " + maxAllowablePay + " рублей. Платеж по кредиту " + sumPayInMon + " рублей.");
        if (maxAllowablePay > sumPayInMon) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отказано");
        }


    }
}








