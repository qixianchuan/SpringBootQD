package com.qi.swagger.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:30
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "通用PI接口返回", description = "Common Api Response")
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -8396913052501623999L;

    /**
     * 通用返回状态
     */
    @ApiModelProperty(value = "通用返回状态", required = true)
    private Integer code;

    /**
     * 通用返回信息
     */
    @ApiModelProperty(value = "通用返回信息", required = true)
    private String message;

    /**
     * 通用返回数据
     */
    @ApiModelProperty(value = "通用返回数据", required = false)
    private T data;
}
