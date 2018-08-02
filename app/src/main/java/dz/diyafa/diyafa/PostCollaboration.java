package dz.diyafa.diyafa;

public class PostCollaboration {

    String id;
    String neededCollaborators;
    String timeSinceCooked;
    String location;
    String meal;
    String mealOrigin;
    String publisherID;
    String quantity;


    public PostCollaboration(String neededCollaborators, String timeSinceCooked,
                             String location, String meal, String mealOrigin,
                             String publisherID, String quantity) {


        this.neededCollaborators = neededCollaborators;
        this.timeSinceCooked = timeSinceCooked;
        this.location = location;
        this.meal = meal;
        this.mealOrigin = mealOrigin;
        this.publisherID = publisherID;
        this.quantity = quantity;
    }

    public void setId(String ID) {
        this.id = ID;
    }

    public String getId() {
        return id;
    }

    public String getNeededCollaborators() {
        return neededCollaborators;
    }

    public String getTimeSinceCooked() {
        return timeSinceCooked;
    }

    public String getLocation() {
        return location;
    }

    public String getMeal() {
        return meal;
    }

    public String getMealOrigin() {
        return mealOrigin;
    }

    public String getPublisherID() {
        return publisherID;
    }

    public String getQuantity() {
        return quantity;
    }
}
