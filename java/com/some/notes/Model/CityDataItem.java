//package com.some.notes.Model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//public class CityDataItem implements Parcelable {
//
//    private String hindi;
//    private String english;
//
//
//    public CityDataItem() {
//    }
//
//    public CityDataItem(String hindi, String english
//                       ) {
//
//
//        this.hindi = hindi;
//        this.english = english;
//
//    }
//
//    public String getHindi() {
//        return hindi;
//    }
//
//    public void setHindi(String hindi) {
//        this.hindi = hindi;
//    }
//
//    public String getEnglish() {
//        return english;
//    }
//
//    public void setEnglish(String english) {
//        this.english = english;
//    }
//
//    @Override
//    public String toString() {
//        return "CityDataItem{" +
//                "hindi='" + hindi + '\'' +
//                ", english='" + english + '\'' +
//                '}';
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(this.hindi);
//        dest.writeString(this.english);
//        }
//
//    protected CityDataItem(Parcel in) {
//        this.hindi = in.readString();
//        this.english = in.readString();
//         }
//
//    public static final Creator<CityDataItem> CREATOR = new Creator<CityDataItem>() {
//        @Override
//        public CityDataItem createFromParcel(Parcel source) {
//            return new CityDataItem(source);
//        }
//
//        @Override
//        public CityDataItem[] newArray(int size) {
//            return new CityDataItem[size];
//        }
//    };
//}
//
//
//
