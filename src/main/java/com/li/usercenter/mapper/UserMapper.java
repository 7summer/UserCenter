package com.li.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.li.usercenter.model.domain.User;
import com.li.usercenter.model.request.SearchUserRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 33278
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-09-03 16:13:58
* @Entity com.li.UserCenter.model.domain.User
*/
public interface UserMapper extends BaseMapper<User> {
	/**
	 * 搜索用户（分页查询）
	 * @param searchUserRequest
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<User> searchUser(@Param("searchUserRequest") SearchUserRequest searchUserRequest,
						  @Param("startIndex") int startIndex,
						  @Param("pageSize") int pageSize);
}




