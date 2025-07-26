package com.reunion.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "MEMBER")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "BIRTH_YEAR", nullable = false)
    private String birthYear;


    // TODO
    public static MemberEntity of(String name, String birthYear) {
        return new MemberEntity(0, name, birthYear);
    }

}
