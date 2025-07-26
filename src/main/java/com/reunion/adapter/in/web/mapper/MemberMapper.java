package com.reunion.adapter.in.web.mapper;


import com.reunion.adapter.in.web.dto.SignUpRequest;
import com.reunion.domain.member.Member;
import org.springframework.stereotype.Component;

//TODO :: MapStruct 로

@Component
public class MemberMapper {

    public Member toMember(SignUpRequest request) {
        return Member.create(
                request.getName(),
                request.getBirthYear(),
                request.getPassword()
        );
    }

}
