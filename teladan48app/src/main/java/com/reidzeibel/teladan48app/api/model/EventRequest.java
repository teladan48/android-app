package com.reidzeibel.teladan48app.api.model;

/**
 * Created by Reidzeibel on 12/01/2016.
 */
public class EventRequest {

    private String name;
    private String event_date;
    private String event_description;
    private String location;

    public EventRequest(String name, String date, String desc, String loc) {
        this.name = name;
        this.event_date = date;
        this.event_description = desc;
        this.location = loc;
    }
}
