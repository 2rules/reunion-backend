package com.reunion.adapter.out.persistence;

import com.reunion.domain.member.Member;
import org.springframework.stereotype.Component;

// TODO :: mapstruct
@Component
public class MemberEntityMapper {

    public MemberEntity toEntity(Member member) {
        return MemberEntity.of(member.getName(), member.getBirthYear());
    }


}
