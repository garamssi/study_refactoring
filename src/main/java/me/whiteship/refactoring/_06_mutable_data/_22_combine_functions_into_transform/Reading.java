package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;


// record 14버전부터 지원하는 불변 데이터 타입
public record Reading(String customer, double quantity, Month month, Year year) {
}
