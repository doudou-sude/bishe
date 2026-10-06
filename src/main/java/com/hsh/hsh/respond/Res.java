package com.hsh.hsh.respond;

import lombok.Getter;

@Getter
public class Res<T> {
    /*
    * 状态码
    * */
    private Integer code;
    /*
    *提示信息
    **/
    private String message;
    /*
    *泛型类型数据，自定义类型
    */
    private T data;

    private Res(Integer code){
        this.code = code;
    }

    private Res(Integer code,String message){}

    private Res(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Res<T> success(){
        return new Res<>(RespondCode.SUCCESS.getCode());
    }
    public static <T> Res<T> success(String message){
        return new Res<>(RespondCode.SUCCESS.getCode(),message);
    }
    public static <T> Res<T> data(T data) {
        return new Res<>(RespondCode.SUCCESS.getCode(),RespondCode.SUCCESS.getMessage(),data);
    }



    public static <T> Res<T> error() {
        return new Res<>(RespondCode.ERROR.getCode(),RespondCode.ERROR.getMessage());
    }
    public static <T> Res<T> error(String message) {
        return new Res<>(RespondCode.ERROR.getCode(),message);
    }
    public static <T> Res<T> error(RespondCode respondCode) {
        return new Res<>(respondCode.getCode(),respondCode.getMessage());
    }



    public static <T> Res<T> error(Integer code, String message) {
        return new Res<>(code, message);
    }

}
