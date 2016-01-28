package com.reidzeibel.teladan48app.api.model;

/**
 * Created by Reidzeibel on 12/01/2016.
 */
public class UserLocation extends User {

    private String location_lat;
    private String location_long;

    public String getLocation_lat() {
        return location_lat;
    }

    public void setLocation_lat(String location_lat) {
        this.location_lat = location_lat;
    }

    public String getLocation_long() {
        return location_long;
    }

    public void setLocation_long(String location_long) {
        this.location_long = location_long;
    }

    @Override
    public String toString() {
        return "id : " + getId() + "\r\n"
                + "name : " + getName() + "\r\n"
                + "email : " + getEmail() + "\r\n"
                + "location_lat : " + getLocation_lat() + "\r\n"
                + "location_long : " + getLocation_long() + "\r\n"
                + "created_at : " + getCreated_at() + "\r\n"
                + "updated_at : " + getUpdated_at() + "\r\n\r\n";
    }
}
