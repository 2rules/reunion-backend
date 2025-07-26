package com.reunion.adapter.in.web.dto;

import com.reunion.adapter.out.persistence.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberInformation {
    private String id;
    private String name;
    private String birthYear;

    // TODO mapsturct
    public static MemberInformation from(MemberEntity entity) {
        return new MemberInformation(entity.getMemberId(), entity.getName(), entity.getBirthYear());
    }
}
