package com.qi.scaffold.common.result;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 16:37
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class GlobalErrorInfoException extends Exception{
    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException (ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
