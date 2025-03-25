package com.example.recyclerview;

public class LandScape {
    String landScapeFileName;
    String landCaption;

    public LandScape(String landScapeFileName, String landCaption) {
        this.landScapeFileName = landScapeFileName;
        this.landCaption = landCaption;
    }

    public String getLandScapeFileName() {
        return landScapeFileName;
    }

    public void setLandScapeFileName(String landScapeFileName) {
        this.landScapeFileName = landScapeFileName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
