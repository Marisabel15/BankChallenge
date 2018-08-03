package com.example.belale.santanderproject.models;

import java.io.Serializable;

public class Cell implements Serializable {

    private Integer id;
    private Integer type;
    private String message;
    private Object typefield;
    private Boolean hidden;
    private Double topSpacing;
    private Object show;
    private Boolean required;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() { return message; }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getTypefield() {
        return typefield;
    }

    public void setTypefield(Object typefield) {
        this.typefield = typefield;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Double getTopSpacing() {
        return topSpacing;
    }

    public void setTopSpacing(Double topSpacing) {
        this.topSpacing = topSpacing;
    }

    public Object getShow() {
        return show;
    }

    public void setShow(Object show) {
        this.show = show;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

}
