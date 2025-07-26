package com.reunion.adapter.in.web;

import com.reunion.adapter.in.web.dto.MemberInformation;
import com.reunion.adapter.in.web.dto.SignUpRequest;
import com.reunion.adapter.in.web.mapper.MemberMapper;
import com.reunion.application.port.in.MemberUseCase;
import com.reunion.domain.common.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@Valid
@RequestMapping("/api/member")
@Tag(name = "MEMBER API")
@RequiredArgsConstructor
public class MemberController {

    private final MemberUseCase memberUseCase;
    private final MemberMapper memberMapper;

    @PostMapping
    @Operation(summary = "회원가입")
    public ApiResponse<Long> signUp(@RequestBody final SignUpRequest request) {
        return ApiResponse.success(
                memberUseCase.signUp(memberMapper.toMember(request))
        );
    }

    @GetMapping("/{memberNo}")
    @Operation(summary = "회원정보조회")
    public ApiResponse<MemberInformation> getMemberInformation(@PathVariable final long memberNo) {
        return ApiResponse.success(
                memberUseCase.getMemberInformation(memberNo)
        );
    }

}
