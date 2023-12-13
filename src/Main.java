import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Задача № 1:
    System.out.print("\nЗадача № 1:\nКакая у вас операционаая система?\n0 - iOS\n1 - Android\nВведите данные: ");
    byte clientOS = scanner.nextByte();
    switch (clientOS){
        case 0:
            System.out.println("Установите версию приложения для iOS по ссылке: www//http..");
            break;
        case 1:
            System.out.println("Установите версию приложения для Android по ссылке: www//http..");
            break;
        default:
            System.out.println("Неверные данные!");}
    // Задача № 2:
    System.out.print("\nЗадача № 2\nКакая у вас операционаая система?\n0 - iOS\n1 - Android\nВведите данные: ");
    byte clientOSTaskTwo = scanner.nextByte();
    System.out.print("Введите год выпуска вышего телефона: ");
    short clientDeviceYear = scanner.nextShort();
    if (clientOSTaskTwo == 0 && clientDeviceYear < 2015){
        System.out.println("Установите облегченную версию приложения для iOS по ссылке: www//http..");
    } else if (clientOSTaskTwo == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке: www//http..");
    } else if (clientOSTaskTwo == 0 && clientDeviceYear > 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке: www//http..");
    } else if (clientOSTaskTwo == 1 && clientDeviceYear > 2015){
        System.out.println("Установите версию приложения для Android по ссылке: www//http..");
    } else if (clientOSTaskTwo == 0 && clientDeviceYear == 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке: www//http..");
    } else if (clientOSTaskTwo == 1 && clientDeviceYear == 2015) {
        System.out.println("Установите версию приложения для Android по ссылке: www//http..");
    } else {
        System.out.println("Какие-то данные введены неверно!");}
    // Задача № 3:
    System.out.println("\nЗадача № 3");
    System.out.print("Введите год: ");
    short year = scanner.nextShort();
    int multipleOfFour = year % 4;
    int multipleOfOneHundred = year % 100;
    boolean comparisonOfMultiplicity = multipleOfFour == 0 && multipleOfOneHundred != 0;
    if (comparisonOfMultiplicity){
        System.out.println(year + " год является високосным");
    }else {
        System.out.println(year + " год не является високосным");}
    // Задача № 4:
    System.out.println("\nЗадача № 4:");
    byte deliveryDistance = 95;
    byte deliveryDays = 1;
    if (deliveryDistance < 20){
        System.out.println("Потребуется дней: " + deliveryDays);
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
        deliveryDays++;
        System.out.println("Потребуется дней: " + deliveryDays);
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
        deliveryDays += 2;
        System.out.println("Потребуется дней: " + deliveryDays);
    }else {
        System.out.println("Доставки нет");}
    // Задача № 5:
    System.out.println("\nЗадача № 5");
    short monthNumber = scanner.nextShort();
    switch (monthNumber){
        case 1:
            System.out.println("1-й месяц (он же январь) принадлежит к сезону - зима");
            break;
        case 2:
            System.out.println("2-й месяц (он же февраль) принадлежит к сезону - зима");
            break;
        case 3:
            System.out.println("3-й месяц (он же март) принадлежит к сезону - весна");
            break;
        case 4:
            System.out.println("4-й месяц (он же апрель) принадлежит к сезону - весна");
            break;
        case 5:
            System.out.println("5-й месяц (он же май) принадлежит к сезону - весна");
            break;
        case 6:
            System.out.println("6-й месяц (он же июнь) принадлежит к сезону - лето");
            break;
        case 7:
            System.out.println("7-й месяц (он же июль) принадлежит к сезону - лето");
            break;
        case 8:
            System.out.println("8-й месяц (он же август) принадлежит к сезону - лето");
            break;
        case 9:
            System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону - осень");
            break;
        case 10:
            System.out.println("10-й месяц (он же октябрь) принадлежит к сезону - осень");
            break;
        case 11:
            System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону - осень");
            break;
        case 12:
            System.out.println("12-й месяц (он же декабрь) принадлежит к сезону - зима");
            break;
        default:
            System.out.println("Что-то неверно, проверьте данные!");
    }
    }
}