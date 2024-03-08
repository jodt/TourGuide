package com.openclassrooms.tourguide.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import gpsUtil.location.Location;

public class NearAttractionDto {

    String attractionName;
    Location attactionLocation;
    Location userLocation;
    double distanceBetweenLocationAndAttraction;
    int rewardsPoints;

    public NearAttractionDto(String attractionName, Location attactionLocation, Location userLocation, double distanceBetweenLocationAndAttraction, int rewardsPoints) {
        this.attractionName = attractionName;
        this.attactionLocation = attactionLocation;
        this.userLocation = userLocation;
        this.distanceBetweenLocationAndAttraction = distanceBetweenLocationAndAttraction;
        this.rewardsPoints = rewardsPoints;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public Location getAttactionLocation() {
        return attactionLocation;
    }

    public void setAttactionLocation(Location attactionLocation) {
        this.attactionLocation = attactionLocation;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }

    public double getDistanceBetweenLocationAndAttraction() {
        return distanceBetweenLocationAndAttraction;
    }

    public void setDistanceBetweenLocationAndAttraction(double distanceBetweenLocationAndAttraction) {
        this.distanceBetweenLocationAndAttraction = distanceBetweenLocationAndAttraction;
    }

    public int getRewardsPoints() {
        return rewardsPoints;
    }

    public void setRewardsPoints(int rewardsPoints) {
        this.rewardsPoints = rewardsPoints;
    }
}
