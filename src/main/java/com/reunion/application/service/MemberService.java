package com.reunion.application.service;

import com.reunion.adapter.in.web.dto.MemberInformation;
import com.reunion.adapter.out.persistence.MemberEntityMapper;
import com.reunion.adapter.out.persistence.MemberJpaRepository;
import com.reunion.application.port.in.MemberUseCase;
import com.reunion.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberUseCase {

    private final MemberJpaRepository memberRepository;
    private final MemberEntityMapper memberEntityMapper;

    @Override
    public long signUp(Member member) {
        member.validate();

        var memberEntity = memberEntityMapper.toEntity(member);
        memberRepository.save(memberEntity);

        return memberEntity.getMemberNo();

    }

    @Override
    public MemberInformation getMemberInformation(long memberNo) {
        return memberRepository
                .findById(memberNo)
                .map(MemberInformation::from)
                .orElseThrow(() -> new RuntimeException("TODO"));
    }

}
