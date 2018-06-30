package com.example.arthurfb.guiaturistico2;

public class LocalInfo {

    private int mImageResouceId;

    private int mDescricaoLocalId;

    private int mNomeLocalId;

    private int mMaisInfoId;


    public LocalInfo(int descriçaoLocalId, int imageResourceId, int nomeLocalId, int maisInfoId) {
        mDescricaoLocalId = descriçaoLocalId;
        mImageResouceId = imageResourceId;
        mNomeLocalId = nomeLocalId;
        mMaisInfoId = maisInfoId;

    }

    public int getNomeLocalId() {
        return mDescricaoLocalId;
    }

    public int getImageResourceId() {
        return mImageResouceId;
    }

    public int getTituloLocalId() {
        return mNomeLocalId;
    }

    public int getMaisInfoId() {
        return mMaisInfoId;
    }

}
