package com.qi.scaffold.common.result;

import lombok.Data;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 16:31
 * @description：ResultBody
 * @modified By：
 * @version: $version$
 */
@Data
public class ResultBody {

    /**相应代码**/
    private String code;
    /**相应信息**/
    private String message;
    /**相应结果**/
    private Object result;

    public ResultBody(ErrorInfoInterface errorInfo) {
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
    }

    public ResultBody(Object result) {
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.message = GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.result = result;
    }
}
