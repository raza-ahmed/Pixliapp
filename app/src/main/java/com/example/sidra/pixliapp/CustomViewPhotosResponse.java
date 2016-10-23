package com.example.sidra.pixliapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmedraza on 23/10/16.
 */
public class CustomViewPhotosResponse {

    @SerializedName("Photos")
    private List<CustomViewPhotosHolder> Photos;

    public List<CustomViewPhotosHolder> getResults(){
        return Photos;
    }

}
