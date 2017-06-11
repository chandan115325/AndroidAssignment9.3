package com.example.android.androidassignment93;

/**
 * Created by CHANDAN on 6/11/2017.
 */

public class ContactDetails {
    private String mContactNames;
    private String mContactNumbers;

    /**
     * Constructor to initialize the data members
     * @param contactNames
     * @param contactNumbers
     */
    public ContactDetails(String contactNames, String contactNumbers){
        mContactNames = contactNames;
        mContactNumbers = contactNumbers;
    }
    /**
     * Getters to retrieve the data
     * @return
     */
    public String getmContactNames() {
        return mContactNames;
    }

    public String getmContactNumbers() {
        return mContactNumbers;
    }
}
