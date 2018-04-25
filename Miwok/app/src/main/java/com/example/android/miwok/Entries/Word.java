package com.example.android.miwok.Entries;

import android.widget.ImageView;

/**
 * Created by HSANHUES on 3/18/2018.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Miwok translation for the default word */
    private String mMiWokTranslation;
    /** Constant for decide when to change image visibility */
    private static final int NO_IMAGE_PROVIEDED = -1;
    /**Miwok images for words*/
    private int mImageId = NO_IMAGE_PROVIEDED;
    /**Miwok audios for words*/
    private int mAudioId;


    /**
     * Constructor for Word Class
     * @param mDefaultTranslation default translation for the word
     * @param mMiWokTranslation Miwok translation for the word
     * @param mImageId Miwok image for the word
     * @param mAudioId Miwok audio for the word
     */
    public Word(String mDefaultTranslation, String mMiWokTranslation, int imageId, int audioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiWokTranslation = mMiWokTranslation;
        this.mAudioId = audioId;
        this.mImageId = imageId;
    }

    public Word(String mDefaultTranslation, String mMiWokTranslation, int mAudioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiWokTranslation = mMiWokTranslation;
        this.mAudioId = mAudioId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiWokTranslation() {
        return mMiWokTranslation;
    }

    public int getmImageId() { return mImageId; }

    public int getmAudioId() { return mAudioId; }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIEDED;
    }
}
