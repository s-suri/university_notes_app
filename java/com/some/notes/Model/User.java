package com.some.notes.Model;


public class User {

    private String id;
    private String username;
    private String imageurl;
    private String status;
    private String search;
    private String groupName;
    private String fullname;
    private String bio;


    public User(String id, String username, String imageurl, String status, String search, String groupName,String fullname,String bio) {
        this.id = id;
        this.username = username;
        this.imageurl = imageurl;
        this.status = status;
        this.search = search;
        this.groupName = groupName;
        this.fullname = fullname;
        this.bio = bio;

    }

    public User() {

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


}
