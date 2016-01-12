package com.reidzeibel.teladan48app.api.model;

/**
 * Created by Reidzeibel on 12/01/2016.
 */
public class UserLocationRequest {

    private String location_lat;
    private String location_long;

    public UserLocationRequest (String lat, String lng) {
        this.location_lat = lat;
        this.location_long = lng;
    }
}
