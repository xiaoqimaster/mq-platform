package com.zidongxiangxi.mqplatform.api.exception;

/**
 * 不支持操作
 *
 * @author chenxudong
 * @date 2019/08/31
 */
public class NotSupportOperationException extends MqPlatformException {
    private static final String ERROR_MESSAGE = "暂不支持该操作";

    public NotSupportOperationException() {
        super(ERROR_MESSAGE);
    }
}
