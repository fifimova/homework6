public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1(){
        System.out.println("Задание 1");
        for (int n = 1; n <= 10; n++){
            System.out.println(n);
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        for (int n = 10; n >= 1; n = n - 1){
            System.out.println(n);
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        for (int n = 0; n <= 17; n = n + 2){
            System.out.println(n);
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
        for (int n = 10; n >= -10; n = n - 1){
            System.out.println(n);
        }
    }
    public static void task5(){
        System.out.println("Задание 5");
        for (int y = 1904; y <= 2096; y= y + 4){
            System.out.println(y + " год является високосным");
        }
    }
    public static void task6(){
        System.out.println("Задание 6");
        for (int n = 7; n <= 98; n = n + 7){
            System.out.println(n);
        }
    }
    public static void task7(){
        System.out.println("Задание 7");
        for (int n = 1; n <= 512; n = n * 2){
            System.out.println(n);
        }
    }
    public static void task8(){
        System.out.println("Задание 8");
        int accumulation = 0;
        int contribution = 29000;
        for (int i = 1; i <= 12 ; i++){
            accumulation = accumulation + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей");
        }
    }
    public static void task9(){
        System.out.println("Задание 9");
        int accumulation = 0;
        int contribution = 29000;
        for (int i = 1; i <= 12 ; i++) {
            accumulation = accumulation + accumulation/100;
            accumulation = accumulation + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей");
        }
    }
    public static void task10(){
        System.out.println("Задание 10");
        int step = 0;
        int action = 2;
        for (int i = 1; i <=10; i++){
            step = step + action;
            System.out.println("2 * " + i + " = " + step);
        }
    }
}