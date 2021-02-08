package com.meta.seoul.member.persistence;

import java.util.List;

import com.meta.seoul.member.domain.MemberDTO;

public interface MemberDAO {
	public void insertMember(MemberDTO dto);
	public int checkId(String user_id);
	public String checkLogin(MemberDTO dto);
	public String findId(MemberDTO dto);
	public String findPwd(MemberDTO dto);
	public List<MemberDTO> findIds(MemberDTO dto);
}
