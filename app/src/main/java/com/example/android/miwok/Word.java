package com.example.android.miwok;

/**
 * Created by gnz on 2/18/18.
 */

public class Word {

    //Miwak Translation for the word
    private String mMiwakTranslation;

    //Default Translation for the word
    private String mDefaultTranslation;

    // Drawable resource ID
    private int mImageResourceId;


    //Constructor
    public Word(String defaultTranslation, String miwakTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
        mImageResourceId = imageResourceId;
    }

    /*
    * @return Get the default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * @return Get the Miwak translation of the word
     */
    public String getMiwaktTranslation(){
        return mMiwakTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
