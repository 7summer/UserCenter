package com.li.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeleteUserRequest implements Serializable {
    public static final long serialVersionUID = 425313276L;
    private Long id;
}
