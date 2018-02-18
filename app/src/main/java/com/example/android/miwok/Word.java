package com.example.android.miwok;

/**
 * Created by gnz on 2/18/18.
 */

public class Word {

    //Miwak Translation for the word
    private String mMiwakTranslation;

    //Default Translation for the word
    private String mDefaultTranslation;

    //Constructor
    public Word(String defaultTranslation, String miwakTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
    }

    //getters
    //Get the default translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the Miwak translation of the word
    public String getMiwaktTranslation(){
        return mMiwakTranslation;
    }
}
