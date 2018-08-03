package com.example.belale.santanderproject.models.models.parts;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DownInfo implements Serializable {

    @SerializedName("name")
    public String name;
    @SerializedName("data")
    public Object data;

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
