package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import java.util.Objects;

//public class TelephoneNumber {
//
//    private final String areaCode;
//
//    private final String number;
//
//    public TelephoneNumber(String areaCode, String number) {
//        this.areaCode = areaCode;
//        this.number = number;
//    }
//
//    public String areaCode() {
//        return areaCode;
//    }
//
//    public String number() {
//        return number;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TelephoneNumber number1 = (TelephoneNumber) o;
//        return Objects.equals(areaCode, number1.areaCode) && Objects.equals(number, number1.number);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(areaCode, number);
//    }
//}

// 14버전 부터 사용할 수 있는 레코드로 사용하면 간편하게 사용할 수 있다.
public record TelephoneNumber(String areaCode, String number) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber number1 = (TelephoneNumber) o;
        return Objects.equals(areaCode, number1.areaCode) && Objects.equals(number, number1.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }
}
