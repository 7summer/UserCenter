package com.li.usercenter.model.VO;

import lombok.Data;

import java.util.List;

@Data
public class SearchUserResult {
	private List<UserVO> userVOList;
	private long total;
}
