package com.example.android.miwok;

/**
 * Created by gnz on 2/18/18.
 */

public class Word {

    //Miwak Translation for the word
    private String mMiwakTranslation;
    //Default Translation for the word
    private String mDefaultTranslation;
    //Default Translation for the word
    private String mArabicTranslation;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    //Default Audio resid
    private int mAudioResid;

    //Constructor
    public Word(String defaultTranslation, String miwakTranslation, String arabicTranslation, int imageResourceId, int audioResid) {
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
        mArabicTranslation = arabicTranslation;
        mImageResourceId = imageResourceId;
        mAudioResid = audioResid;
    }

    //Constructor
    public Word(String defaultTranslation,  String arabicTranslation, String miwakTranslation, int audioResid) {
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
        mArabicTranslation = arabicTranslation;
        mAudioResid = audioResid;
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

    public String getArabicTranslation(){
        return mArabicTranslation;
    }

    public int getAudioResourceId(){return mAudioResid;}

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

    @Override
    public String toString() {
        return "Word{" +
                "mMiwakTranslation='" + mMiwakTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mArabicTranslation='" + mArabicTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResid=" + mAudioResid +
                '}';
    }
}
