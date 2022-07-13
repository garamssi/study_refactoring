package me.whiteship.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    public int vacationHours(String type) {
        int result = switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" -> 32;
            default -> 0;
        };
        return result;

        /**
         * 함수형태로 길게 쓰려면 리턴 값 앞에 yield 를 받드시 적어야한다.
         * int result = switch (type) {
         *             case "full-time" -> {
         *                      .
         *                      .
         *                      .
         *
         *                      yield 120;
         *             }
         *             case "part-time" -> 80;
         *             case "temporal" -> 32;
         *             default -> 0;
         *         };
         *
         * */
    }
}
