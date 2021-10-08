package com.example.tourguide;

public class Location {
    private static final int NO_IMAGE_PROVIDED = -1;
    private final String name;
    private int imageResource = NO_IMAGE_PROVIDED;

    public Location(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean hasImage() {
        return imageResource != NO_IMAGE_PROVIDED;
    }

}
