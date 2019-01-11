/**
 * Created by myboy on 25/01/2018.
 */

package com.example.android.miwok;

public class Word {

    //*Default translation

    private String mDefaultTranslation;

    //*Miwok Translation

    private String mMiwokTranslation;

    // create word object

    int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Create sound resource id

    int mAudioResourceId = NO_AUDIO_PROVIDED;

    private static final int NO_AUDIO_PROVIDED = -1;

    //Constructor with images and audio

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
//    //Constructor with images
//
//    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
//
//        mDefaultTranslation = defaultTranslation;
//        mMiwokTranslation = miwokTranslation;
//        mImageResourceId = imageResourceId;
//    }

    //Constructor with audio

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    // Get default translation of word

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get Miwok Word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Check if image id has been provided.

    public boolean checkimage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //Get image id

    public int getmImageResourceId () {
        return mImageResourceId;
}

    //Check if audio id has been provided.

    public boolean checkaudio(){
        return mAudioResourceId != NO_AUDIO_PROVIDED;
    }

    //Get image id

    public int getAudioResourceId () {
        return mAudioResourceId;
    }


    //To string for debugging

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
