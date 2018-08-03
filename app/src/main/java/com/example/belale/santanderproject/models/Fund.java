package com.example.belale.santanderproject.models;

import com.example.belale.santanderproject.models.models.parts.DownInfo;
import com.example.belale.santanderproject.models.models.parts.Info;
import com.example.belale.santanderproject.models.models.parts.Screen;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fund extends Screen implements Serializable {


    @SerializedName("screen")
    public Screen screen;

    public Screen getScreen() {
        return screen;
   }

    public void setScreen(Screen screen) {
       this.screen = screen;
   }


}
