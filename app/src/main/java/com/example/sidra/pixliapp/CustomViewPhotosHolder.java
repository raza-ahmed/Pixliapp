package com.example.sidra.pixliapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmedraza on 23/10/16.
 */
public class CustomViewPhotosHolder {
    @SerializedName("id")
    private Integer id;

    @SerializedName("image_url")
    private String image_url;

    @SerializedName("like_count")
    private Integer like_count;

    @SerializedName("photo_code_id")
    private String photo_code_id;

    @SerializedName("share_count")
    private Integer share_count;

    public CustomViewPhotosHolder(){}

    public CustomViewPhotosHolder(String image_url, Integer like_count, String photo_code_id, Integer share_count){
        this.image_url = image_url;
        this.like_count = like_count;
        this.photo_code_id = photo_code_id;
        this.share_count = share_count;
    }

    public String getimage_url(){
        return image_url;
    }
    public void setCode_id(String image_url){
        this.image_url = image_url;
    }

    public Integer getlike_count()
    {
        return like_count;
    }
    public void setlike_count(Integer like_count){
        this.like_count = like_count;
    }

    public String getphoto_code_id(){
        return photo_code_id;
    }
    public void setAlbum_name(String photo_code_id){
        this.photo_code_id = photo_code_id;
    }

    public Integer getshare_count() {
        return share_count;
    }

    public void setshare_count(Integer share_count) {
        this.share_count = share_count;
    }




}
