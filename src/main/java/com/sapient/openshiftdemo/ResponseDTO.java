package com.sapient.openshiftdemo;

import java.util.List;

public class ResponseDTO {
    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
