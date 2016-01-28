package com.reidzeibel.teladan48app.api.model;

/**
 * Created by Reidzeibel on 12/01/2016.
 */

public class User {

    private long id;
    private String name;
    private String email;
    private String created_at;
    private String updated_at;

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

    @Override
    public String toString() {
        return "id : " + getId() + "\r\n"
                + "name : " + getName() + "\r\n"
                + "email : " + getEmail() + "\r\n"
                + "created_at : " + getCreated_at() + "\r\n"
                + "updated_at : " + getUpdated_at() + "\r\n" + "\r\n";
    }
}
