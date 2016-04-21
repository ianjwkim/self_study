package com.example.administrator.interactivestory.model;

/**
 * Created by Administrator on 2016-04-22.
 */
public class choice {
    private String mText;
    private int mNextPage;

    public choice (String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
