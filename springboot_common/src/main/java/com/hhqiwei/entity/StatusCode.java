package com.hhqiwei.entity;

public class StatusCode {
    public static final int OK=20000;//success
    public static final int ERROR=20001;//fail
    public static final int LOGINERROR=20002;//用户或密码错误
    public static final int ACCESSERROR=20003;//权限不足
    public static final int REMOTEERROR=20004;//远程调用失败
    public static final int REPERROR=20005;//重复操作
}
