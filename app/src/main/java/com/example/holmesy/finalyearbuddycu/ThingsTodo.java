package com.example.holmesy.finalyearbuddycu;

public class ThingsTodo {

    private String title;
    int image;
    private String location;
    private String desc;


    public static final ThingsTodo[] thingsToDo = {
            new ThingsTodo("Cathederal Ruins",R.drawable.cov_cath, "loc","des"),
            new ThingsTodo("Transport Museum",R.drawable.cov_trans,"loc","des"),
            new ThingsTodo("Art Gallery",R.drawable.the_herb,"loc","des"),
            new ThingsTodo("Godiva Fest",R.drawable.godiva_fest,"loc","des")
    };

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }

    public String getDesc() {
        return desc;
    }

    public ThingsTodo(String title, int image, String location, String desc){
        this.title = title;
        this.image = image;
        this.location = location;
        this.desc = desc;
    }




}
