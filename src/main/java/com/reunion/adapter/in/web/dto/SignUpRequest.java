package com.reunion.adapter.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignUpRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String password;

    @NotBlank
    @Size(min = 4, max = 4)
    private String birthYear;

}
