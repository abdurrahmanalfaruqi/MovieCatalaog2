package com.example.myapplication.ListFilm2;

import android.os.Parcel;
import android.os.Parcelable;

public class Watch implements Parcelable {

    private String title;
    private String overview;
    private Integer poster;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getPoster() {
        return poster;
    }

    public void setPoster(Integer poster) {
        this.poster = poster;
    }





    public Watch(String title,String overview,Integer poster){
        this.title=title;
        this.overview=overview;
        this.poster=poster;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.overview);
        dest.writeValue(this.poster);
    }

    protected Watch(Parcel in) {
        this.title = in.readString();
        this.overview = in.readString();
        this.poster = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Watch> CREATOR = new Parcelable.Creator<Watch>() {
        @Override
        public Watch createFromParcel(Parcel source) {
            return new Watch(source);
        }

        @Override
        public Watch[] newArray(int size) {
            return new Watch[size];
        }
    };
}
