package com.reidzeibel.teladan48app.api.model;

import com.reidzeibel.teladan48app.util.Util;

import java.util.List;

/**
 * Created by Reidzeibel on 28/01/2016.
 */
public class ListUserLocation {

    private List<UserLocation> userLocationList;

    public List<UserLocation> getUserLocationList() {
        return userLocationList;
    }

    public void setUserLocationList(List<UserLocation> userLocationList) {
        this.userLocationList = userLocationList;
    }

    @Override
    public String toString() {
        return Util.listToString(getUserLocationList());
    }
}
