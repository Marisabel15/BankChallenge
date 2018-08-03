package com.example.belale.santanderproject.models.models.parts;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MoreInfo implements Serializable {

    @SerializedName("month")
    public Month month;
    @SerializedName("year")
    public Year year;
    @SerializedName("12months")
    public TwelfthMonth tmonth;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public TwelfthMonth getTmonth() {
        return tmonth;
    }

    public void setTmonth(TwelfthMonth tmonth) {
        this.tmonth = tmonth;
    }

}
