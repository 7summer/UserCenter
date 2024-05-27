package com.li.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpdatePasswordRequest implements Serializable {
    private Long id;
    private String oldPassword;
    private String newPassword;
}
