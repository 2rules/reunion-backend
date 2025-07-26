package com.reunion.domain.member;

import ch.qos.logback.core.util.StringUtil;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class Member {

    private String id;
    private String name;
    private String birthYear;
    private String password;

    public static Member create(final String id, final String name, final String birthYear, final String password) {
        return Member.builder()
                .id(id)
                .name(name)
                .birthYear(birthYear)
                .password(password)
                .build();
    }

    public void validate() {
        // TODO
        if (false) {
            throw new RuntimeException("todo");
        }
    }

}
