package com.reunion.application.port.in;

import com.reunion.domain.member.Member;

public interface SignUpUseCase {

    long signUp(Member member);

}
