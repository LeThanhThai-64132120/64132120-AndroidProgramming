package com.example.luyentapgk;

public class Electronic {
    String ElectronicImageFileName;
    String ElectronicCaption;

    public Electronic(String electronicImageFileName, String electronicCaption) {
        this.ElectronicImageFileName = electronicImageFileName;
        this.ElectronicCaption = electronicCaption;
    }

    public String getElectronicImageFileName() {
        return ElectronicImageFileName;
    }

    public void setElectronicImageFileName(String electronicImageFileName) {
        ElectronicImageFileName = electronicImageFileName;
    }

    public String getElectronicCaption() {
        return ElectronicCaption;
    }

    public void setElectronicCaption(String electronicCaption) {
        ElectronicCaption = electronicCaption;
    }
}
