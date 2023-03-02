public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[31];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int [] oneDay = generateRandomArray();
        int allDays = 0;

        for (int i = 0; i < 31; i++) {
            allDays = allDays + oneDay[i];
        }

        System.out.println("Сумма трат за месяц составила " + allDays + " рублей");

    }

    private static void task2() {
        int [] oneDay = generateRandomArray();
        int maxNums = 0;
        int minNums = 0;

        for (int i = 0; i < 31; i++) {
            if (maxNums < oneDay[i]) {
                maxNums = oneDay[i];
            } else {
                minNums = oneDay[i];
            }

        }

        System.out.println("Минимальная сумма трат за день составила " + minNums + " рублей. Максимальная сумма трат за день составила " + maxNums + " рублей");
    }
    private static void task3() {
        int [] oneDay = generateRandomArray();
        int allDays = 0;

        for (int i = 0; i < 31; i++) {
            allDays = allDays + oneDay[i];
        }

        double newAllDays = allDays / 30;


        System.out.println("Средняя сумма трат за месяц составила " + newAllDays + " рублей");

    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}