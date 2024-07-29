package lang.immutable.test;

public class ImmutableMyDataMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
//        date1.setYear(2025); //컴파일 오류
//        date1 = new ImmutableMyDate(2025, 1, 1); 방법 1
        date1 = date1.withYear(2025); ////date1 = x002, date =x001
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
