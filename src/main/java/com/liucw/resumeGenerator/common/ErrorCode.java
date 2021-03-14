package com.liucw.resumeGenerator.common;

public interface ErrorCode {
    // 通用异常
    int UNDEFINED_ERROR = 0;
    int PARAMETER_ERROR = 1;

    // 业务异常
    int NAME_NOTNULL_ERROR = 201;

}
