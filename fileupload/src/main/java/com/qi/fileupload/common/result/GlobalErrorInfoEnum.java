package com.qi.fileupload.common.result;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 16:34
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS("0", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
