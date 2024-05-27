package com.li.usercenter.common;

public enum ErrorCode {
    SUCCESS(0, "ok", "成功"),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    NULL_ERROR(40001, "请求数据为空", ""),
    NO_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    LOGIN_ERROR(40102, "登录异常", ""),
    REGISTER_ERROR(40103, "注册异常", ""),

    SYSTEM_ERROR(50000, "系统异常", ""),

    UPDATE_ERROR(60000, "更新用户信息异常", ""),
    INSERT_ERROR(60001, "插入用户信息异常", ""),
    DELETE_ERROR(60002, "删除用户信息异常", "");

    private final int code;
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
