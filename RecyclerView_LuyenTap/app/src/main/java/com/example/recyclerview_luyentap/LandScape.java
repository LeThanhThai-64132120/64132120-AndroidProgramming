package com.example.recyclerview_luyentap;

public class LandScape {

    // Buoc 1:
    //khai báo file ảnh và caption
    String landImageFileName;
    String landCaption;
    // taoj getter setter
    // tao Construstor: ham khoi tao


    public LandScape(String landImageFileName, String landCaption) {
        this.landImageFileName = landImageFileName;
        this.landCaption = landCaption;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
