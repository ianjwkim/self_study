package com.example.administrator.interactivestory.model;

/**
 * Created by Administrator on 2016-04-22.
 */
public class page {
    private int mImageId;
    private String mText;
    private choice mChoice1;
    private choice mChoice2;
    private boolean mIsFianal = false;

    public page (int imageId, String text, choice choice1, choice choice2){
        mImageId = imageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;

    }

    public boolean isFianal() {
        return mIsFianal;
    }

    public void setIsFianal(boolean isFianal) {
        mIsFianal = isFianal;
    }

    public page(int imageId, String text){
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2=null;
        mIsFianal = true;

    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(choice choice1) {
        mChoice1 = choice1;
    }

    public choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(choice choice2) {
        mChoice2 = choice2;
    }

    public int getImageId() {

        return mImageId;
    }

    public void setImageId(int id){
        mImageId = id;

    }
}
