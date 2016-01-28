package com.reidzeibel.teladan48app.api.model;

import com.reidzeibel.teladan48app.util.Util;

import java.util.List;

/**
 * Created by Reidzeibel on 25/01/2016.
 */
public class ListEvent {

    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private String next_page_url;
    private String prev_page_url;
    private int from;
    private int to;
    private List<Event> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public String getNext_page_url() {
        return next_page_url;
    }

    public void setNext_page_url(String next_page_url) {
        this.next_page_url = next_page_url;
    }

    public String getPrev_page_url() {
        return prev_page_url;
    }

    public void setPrev_page_url(String prev_page_url) {
        this.prev_page_url = prev_page_url;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public List<Event> getData() {
        return data;
    }

    public void setData(List<Event> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "total : " + getTotal() + "\r\n"
                + "per_page : " + getPer_page() + "\r\n"
                + "current_page : " + getCurrent_page() + "\r\n"
                + "last_page : " + getLast_page() + "\r\n"
                + "next_page_url : " + getNext_page_url() + "\r\n"
                + "prev_page_url : " + getPrev_page_url() + "\r\n"
                + "from : " + getFrom() + "\r\n"
                + "to : " + getTo() + "\r\n"
                + "data : " + "\r\n\r\n" + Util.listToString(getData());
    }
}
