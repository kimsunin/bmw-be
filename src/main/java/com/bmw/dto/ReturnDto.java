package com.bmw.dto;

import lombok.Getter;

@Getter
public class ReturnDto {
    private int code;

    private String message;

    private Object data;

    public ReturnDto(int code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ReturnDto(int code, String message){
        this.code = code;
        this.message = message;
    }
}
