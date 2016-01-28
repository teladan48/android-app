package com.reidzeibel.teladan48app.api.model;

/**
 * Created by Reidzeibel on 12/01/2016.
 */
public class Event {

    private long id;
    private long user_id;
    private String name;
    private String event_date;
    private String event_description;
    private String location;
    private String created_at;
    private String updated_at;
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "id : " + getId() + "\r\n"
                + "user_id :" + getUser_id() + "\r\n"
                + "name : " + getName() + "\r\n"
                + "event_date : " + getEvent_date() + "\r\n"
                + "event_description : " + getEvent_description() + "\r\n"
                + "location : " + getLocation() + "\r\n"
                + "created_at : " + getCreated_at() + "\r\n"
                + "updated_at : " + getUpdated_at() + "\r\n"
                + "user : " + getUser().toString();
    }
}
