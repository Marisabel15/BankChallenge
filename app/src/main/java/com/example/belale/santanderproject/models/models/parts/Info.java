package com.example.belale.santanderproject.models.models.parts;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Info implements Serializable {

    @SerializedName("name")
    public String name;
    @SerializedName("data")
    public String data;

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() { return data; }

    public void setData(String data) {
        this.data = data;
    }
}
