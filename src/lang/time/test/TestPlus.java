package lang.time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime localDateTime = dateTime.plusYears(1).plusMonths(2).plusMonths(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + localDateTime);
    }
}
