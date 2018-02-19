package com.example.android.miwok;

/**
 * Created by gnz on 2/18/18.
 */

public class Word {

    //Miwak Translation for the word
    private String mMiwakTranslation;

    //Default Translation for the word
    private String mDefaultTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    //Constructor
    public Word(String defaultTranslation, String miwakTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
        mImageResourceId = imageResourceId;
    }

    //Constructor
    public Word(String defaultTranslation, String miwakTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
    }

    /*
    * @return Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return Get the Miwak translation of the word
     */
    public String getMiwaktTranslation() {
        return mMiwakTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
* Returns whether or not there is an image for this word.
 */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
