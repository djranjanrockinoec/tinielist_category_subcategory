package com.tinie.GetCatSubcat.responses;

import lombok.Data;

@Data
public class UnauthorisedResponse {

    private String status;
    private int code;
    private long timestamp;
    private String message;
}
