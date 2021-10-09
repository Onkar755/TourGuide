package com.example.tourguide;

public class Location {
    private static final int NO_IMAGE_PROVIDED = -1;
    private final int name;
    private int imageResource = NO_IMAGE_PROVIDED;

    public Location(int name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean hasImage() {
        return imageResource != NO_IMAGE_PROVIDED;
    }

}
