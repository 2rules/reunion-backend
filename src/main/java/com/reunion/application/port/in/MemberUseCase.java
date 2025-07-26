package com.reunion.application.port.in;

import com.reunion.adapter.in.web.dto.MemberInformation;
import com.reunion.domain.member.Member;

public interface MemberUseCase {

    long signUp(Member member);

    MemberInformation getMemberInformation(long memberNo);

}
