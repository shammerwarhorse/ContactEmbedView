package com.viewutils.sergiosilvajr.views.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergiosilvajr on 2/16/16.
 */
public class Contact {
    private String name;
    private String id;
    private List<String> phones;
    private List<String> emails;
    private byte[] photo;

    private Integer viewColor;
    public String getName() {
        return name;
    }

    public void addPhone(String phone){
        if (phones == null){
            phones = new ArrayList<>();
        }
        phones.add(phone);
    }

    public void addEmail(String email){
        if (emails == null){
            emails = new ArrayList<>();
        }
        emails.add(email);
    }

    public List<String> getEmails(){
        return emails;
    }

    public List<String> getPhones(){
        return phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public List<String> getEmailFromSuggestion(CharSequence charSequence){
        List<String> filteredEmails = new ArrayList<>();
        for(String email: getEmails()){
            if(email.toLowerCase().startsWith(charSequence.toString().toLowerCase())){
                filteredEmails.add(email);
            }
        }
        return filteredEmails;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public Integer getViewColor() {
        return viewColor;
    }

    public void setViewColor(Integer viewColor) {
        this.viewColor = viewColor;
    }
}
