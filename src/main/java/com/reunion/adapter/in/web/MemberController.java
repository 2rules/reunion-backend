package com.reunion.adapter.in.web;

import com.reunion.adapter.in.web.dto.SignUpRequest;
import com.reunion.adapter.in.web.mapper.MemberMapper;
import com.reunion.application.port.in.SignUpUseCase;
import com.reunion.domain.common.ApiResponse;
import com.reunion.domain.member.Member;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Valid
@RequestMapping("/api/member")
@Tag(name = "MEMBER API")
@RequiredArgsConstructor
public class MemberController {

    private final SignUpUseCase signUpUseCase;
    private final MemberMapper memberMapper;

    @PostMapping
    @Operation(summary = "회원가입")
    public ApiResponse<String> signUp(@RequestBody final SignUpRequest request) {
        signUpUseCase.signUp(memberMapper.toMember(request));
        return ApiResponse.success("Ok.");
    }

}
