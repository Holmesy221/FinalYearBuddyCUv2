package com.example.holmesy.finalyearbuddycu;

public class StartFragmentClass {

    private String title;
    private int image;

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public StartFragmentClass(String title, int image){
        this.title = title;
        this.image = image;
    }


    public static final StartFragmentClass[] importantlinks = {
            new StartFragmentClass("Cu Careers", image here),
            new StartFragmentClass("Grad Cracker", image here),
            new StartFragmentClass("Coventry University website", image here)

    };



}
