package com.qi.richtexteditor.common.result;

import lombok.Data;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-20 11:44
 * @description：UploadResultBody wangEditor 规定返回
 * @modified By：
 * @version: $version$
 */
@Data
public class UploadResultBody {
    /**返回码 0 成功**/
    private int errno;
    /**url连接**/
    private List<String> data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
