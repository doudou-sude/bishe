package com.hsh.hsh.respond;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RespondCode {

    SUCCESS(200, "操作成功！"),
    ERROR(404, "操作失败！");

    /*
     *响应状态码
     */
    private  Integer code;
    /*
     *响应提示信息
     */
    private  String message ;

}
