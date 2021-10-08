package com.some.notes.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Autosuggestion implements Parcelable{

    private String auto_suggestions_items;
    private String hindi;
    private String english;


    public Autosuggestion() {
    }

    public Autosuggestion(String hindi, String english
    ) {


        this.hindi = hindi;
        this.english = english;

    }

    public Autosuggestion(String auto_suggestions_items, String hindi, String english) {
        this.auto_suggestions_items = auto_suggestions_items;
        this.hindi = hindi;
        this.english = english;
    }

    public String getAuto_suggestions_items() {
        return auto_suggestions_items;
    }

    public void setAuto_suggestions_items(String auto_suggestions_items) {
        this.auto_suggestions_items = auto_suggestions_items;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "CityDataItem{" +
                "hindi='" + hindi + '\'' +
                ", english='" + english + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hindi);
        dest.writeString(this.english);
    }

    protected Autosuggestion(Parcel in) {
        this.hindi = in.readString();
        this.english = in.readString();
    }

    public static final Parcelable.Creator<Autosuggestion> CREATOR = new Parcelable.Creator<Autosuggestion>() {
        @Override
        public Autosuggestion createFromParcel(Parcel source) {
            return new Autosuggestion(source);
        }

        @Override
        public Autosuggestion[] newArray(int size) {
            return new Autosuggestion[size];
        }
    };
}