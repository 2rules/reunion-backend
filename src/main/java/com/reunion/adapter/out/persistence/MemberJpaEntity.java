package com.reunion.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "MEMBER")
public class MemberJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "BIRTH_YEAR", nullable = false)
    private String birthYear;

}
