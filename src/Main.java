import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        WebFilter webFilter = new WebFilter();


        Person ivan = new Person("Ivan", "Ivanov", 24,
                LocalDate.of(2000, 1, 1), Role.ADMIN);
        System.out.println(ivan);
        System.out.println(Role.ADMIN.getRussianName());
        boolean answer = webFilter.checkAccess(
                "https://www.amazon.de/login", Role.ADMIN);
        System.out.println(answer);
        Printer.printUnderlining();

        Person peter = new Person("Peter", "Petrov", 23,
                LocalDate.of(2001, 1, 1), Role.USER);
        System.out.println(peter);
        System.out.println(Role.USER.getRussianName());
        boolean answerForPeter = webFilter.checkAccess(
                "https://web-for-user/login/zugang-password", Role.USER);
        System.out.println(answerForPeter);
        Printer.printUnderlining();

        Person iosif = new Person("Iosif", "Iosifov", 22,
                LocalDate.of(2002, 1, 1), Role.USER);
        System.out.println(iosif);
        boolean answerForIosif = webFilter.checkAccess(
                "https://app.klarna.com/login", Role.USER);
        System.out.println(answerForIosif);
        Printer.printUnderlining();


        Person sidor = new Person("Sidor", "Sidorov", 16,
                LocalDate.of(2008, 1, 1), Role.TEEN);
        System.out.println(sidor);
        boolean answerForSidor = webFilter.checkAccess(
                "https://web-for-teen/commerzbank.de/start", Role.TEEN);
        System.out.println(answerForSidor);
        Printer.printUnderlining();


        Person natasha = new Person("Natasha", "Sidorova", 15,
                LocalDate.of(2009, 1, 1), Role.TEEN);
        System.out.println(natasha);
        System.out.println(Role.TEEN.getRussianName());
        boolean answerForNatasha = webFilter.checkAccess(
                "https://www.commerzbank.de/start/login", Role.TEEN);
        System.out.println(answerForNatasha);
        Printer.printUnderlining();
    }
}
