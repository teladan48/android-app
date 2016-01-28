package com.reidzeibel.teladan48app.api;

import com.reidzeibel.teladan48app.api.model.Event;
import com.reidzeibel.teladan48app.api.model.EventRequest;
import com.reidzeibel.teladan48app.api.model.ListEvent;
import com.reidzeibel.teladan48app.api.model.ListUserLocation;
import com.reidzeibel.teladan48app.api.model.ListUsers;
import com.reidzeibel.teladan48app.api.model.User;
import com.reidzeibel.teladan48app.api.model.UserLocation;
import com.reidzeibel.teladan48app.api.model.UserLocationRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Reidzeibel on 25/01/2016.
 */
public interface Rest {

    // Events API

    @GET("events")
    Call<ListEvent> getEvents();

    @GET("events/{id}")
    Call<Event> viewSingleEvent(@Path("id") int eventId);

    @POST("events")
    Call<Event> postNewEvent(@Body EventRequest requestBody);

    @PUT("events/{id}")
    Call<Event> updateEvent(@Path("id") int eventId, @Body EventRequest requestBody);

    @DELETE("events/{id}")
    Call<Void> deleteEvent(@Path("id") int eventId);

    // Users API

    @GET("users")
    Call<ListUsers> getUsers();

    @GET("users/{id}")
    Call<User> viewUser(@Path("id") int userId);

    // User Location API

    @GET("user-locations")
    Call<ListUserLocation> getUserLocation();

    @PUT("user-locations/{id}")
    Call<UserLocation> updateLocation(@Path("id") int userId, UserLocationRequest requestBody);

}
