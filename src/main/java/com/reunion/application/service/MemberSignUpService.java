package com.reunion.application.service;

import com.reunion.adapter.out.persistence.MemberEntityMapper;
import com.reunion.adapter.out.persistence.MemberJpaRepository;
import com.reunion.application.port.in.SignUpUseCase;
import com.reunion.domain.member.Member;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberSignUpService implements SignUpUseCase {

    private final MemberJpaRepository memberRepository;
    private final MemberEntityMapper memberEntityMapper;

    @Override
    @Transactional
    public long signUp(Member member) {
        member.validate();

        var memberEntity = memberEntityMapper.toEntity(member);
        memberRepository.save(memberEntity);

        return memberEntity.getId();

    }

}
