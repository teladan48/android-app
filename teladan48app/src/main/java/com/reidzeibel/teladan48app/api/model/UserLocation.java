package com.reidzeibel.teladan48app.api.model;

/**
 * Created by Reidzeibel on 12/01/2016.
 */
public class UserLocation {

    private long id;
    private String name;
    private String email;
    private String created_at;
    private String updated_at;
    private String location_lat;
    private String location_long;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

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
                + "updated_at : " + getUpdated_at() + "\r\n"
                + "user : " + getUser() + "\r\n";
    }
}
