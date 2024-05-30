package com.li.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateInfoRequest implements Serializable {
    private Long id;
    private String username;
    private String description;
    private String avatarUrl;
    private String email;
}
