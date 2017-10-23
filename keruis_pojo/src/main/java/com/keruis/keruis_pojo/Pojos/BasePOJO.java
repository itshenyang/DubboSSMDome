package com.keruis.keruis_pojo.Pojos;


import java.io.Serializable;

/**
 * Created by Huan on 2017/2/8.
 */

public class BasePOJO implements Serializable {
    private String tokenuserid;

    private String tag;

    private String versions;

    public String getTokenuserid() {
        return tokenuserid;
    }

    public void setTokenuserid(String tokenuserid) {
        this.tokenuserid = tokenuserid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        return "BasePOJO{" +
                "tokenuserid='" + tokenuserid + '\'' +
                ", tag='" + tag + '\'' +
                ", versions='" + versions + '\'' +
                '}';
    }
}