package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private List<String> members;

    private String owner;

    private boolean paid;

    /**
     * refactor -> push members down 을 사용하면 하위 클래스에 함수나 필드를 옮길 수 있다.
     * */

}
