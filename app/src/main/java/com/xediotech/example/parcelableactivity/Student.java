package com.xediotech.example.parcelableactivity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by KHAN on 25/05/15.
 */
public class Student implements Parcelable{

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    String mFirstName;
    String mLastName;

    public Student() {

    }

    @Override
    public int describeContents() {
        return 0;
    }


    /**
     *
     * This method is called when object data is ready to create a packet (parcel)
     *
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mFirstName);
        dest.writeString(mLastName);

    }

      /**
      * Retrieving Student data from Parcel object
      * This constructor is invoked by the method createFromParcel(Parcel source)
      * when data is transfered from first activity to second (target) activity
      **/
      public Student(Parcel in) {
            this.mFirstName  = in.readString();
            this.mLastName = in.readString();

      }


     public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
            @Override
            public Student createFromParcel(Parcel source) {
                return new Student(source);
            }

            @Override
            public Student[] newArray(int size) {
                return new Student[size];
            }
        };
}
