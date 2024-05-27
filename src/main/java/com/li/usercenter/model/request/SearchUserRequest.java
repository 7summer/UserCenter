package com.li.usercenter.model.request;

import com.li.usercenter.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

@Data
public class SearchUserRequest extends PageRequest implements Serializable {
    private String username;
    private Integer userStatus;
    private Integer userRole;
}
