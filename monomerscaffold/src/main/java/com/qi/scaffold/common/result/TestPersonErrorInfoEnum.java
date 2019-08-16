package com.qi.scaffold.common.result;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 16:49
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public enum TestPersonErrorInfoEnum implements ErrorInfoInterface {
    PARAMS_NO_COMPLETE("000001","params no complete"),
    NO_DATA_WAS_QUERIED("4000","no_data_was_queried");

    private String code;

    private String message;

    TestPersonErrorInfoEnum(String code, String message) {
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
