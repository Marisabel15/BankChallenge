package com.example.belale.santanderproject.models.models.parts;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Year implements Serializable {

    @SerializedName("fund")
    public Double fund;
    @SerializedName("CDI")
    public Double cdi;


    public Double getFund() { return fund; }

    public void setFund(Double fund) {
        this.fund = fund;
    }

    public Double getCdi() { return cdi; }

    public void setCdi(Double cdi) {
        this.cdi = cdi;
    }
}
