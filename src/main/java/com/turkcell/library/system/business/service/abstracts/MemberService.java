package com.turkcell.library.system.business.service.abstracts;

import com.turkcell.library.system.business.dto.request.member.AddMemberRequest;
import com.turkcell.library.system.business.dto.request.member.UpdateMemberRequest;
import com.turkcell.library.system.business.dto.response.member.AddMemberResponse;
import com.turkcell.library.system.business.dto.response.member.GetAllMemberResponse;
import com.turkcell.library.system.business.dto.response.member.GetByIdMemberResponse;
import com.turkcell.library.system.business.dto.response.member.UpdateMemberResponse;

import java.util.List;

public interface MemberService {

    AddMemberResponse addMember(AddMemberRequest addMemberRequest);

    GetByIdMemberResponse getMemberById(int id);

    List<GetAllMemberResponse> getAllMember();

    UpdateMemberResponse updateMember(UpdateMemberRequest updateBookRequest);

    void deleteMember(int id);

}
