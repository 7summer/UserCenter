package com.li.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员更新用户
 */
@Data
public class AdminUpdateUserRequest implements Serializable {
    public static final long serialVersionUID = 425313276L;
    private Long id;
    private String username;
    private String description;
    private String avatarUrl;
    private String email;
    private String userPassword;
    private int userStatus;
}
