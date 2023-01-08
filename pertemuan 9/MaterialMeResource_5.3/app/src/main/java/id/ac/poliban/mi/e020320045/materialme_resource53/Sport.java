package id.ac.poliban.mi.e020320045.materialme_resource53;


class Sport {

    // Member variables representing the title and information about the sport.
    private final String title;
    private final String info;
    private final int imageResource;

    // Constructor for the Sport data model.

    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

     //Gets the title of the sport.

    String getTitle() {
        return title;
    }

    // Gets the info about the sport.
    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

}
