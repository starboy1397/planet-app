package com.mastercoding.planets;

//this class act as a model class for list view
//primary purpose of this class is hold data of list view items
public class PlanetModel {

    //attributes
    private String planetName;
    private int planetImage;
    private String moonCount;

    //constructor
    public PlanetModel(String planetName, int planetImage, String moonCount) {
        this.planetName = planetName;
        this.planetImage = planetImage;
        this.moonCount = moonCount;
    }

    //getter & setter methods

    public String getPlanetName() {
        return planetName;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }
}
