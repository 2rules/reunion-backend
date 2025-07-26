package com.reunion.adapter.out.persistence;

import com.reunion.domain.member.Member;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PRIVATE) //TODO
@Table(name = "MEMBER")
public class MemberEntity {

    @Id
    @Column(name = "MEMBER_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberNo;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "BIRTH_YEAR", nullable = false)
    private String birthYear;

    @Column(name = "PASSWORD")
    private String password;

    @CreationTimestamp
    @Column(name = "INSERT_DATE")
    private LocalDateTime insertDate;

    @UpdateTimestamp
    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    // TODO
    public static MemberEntity from(Member member) {

        return MemberEntity.builder()
                .memberId(member.getId())
                .name(member.getName())
                .password(member.getPassword())
                .birthYear(member.getBirthYear())
                .build();
    }

}
