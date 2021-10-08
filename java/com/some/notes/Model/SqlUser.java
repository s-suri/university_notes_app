package com.some.notes.Model;

import com.some.notes.SqlUsers;

import java.util.Comparator;

public class SqlUser {

    private long id;
    String fullname,sender,receiver,imageurl,messageID,randomId,saveCurrentTime1,lastMessage,type;

    public SqlUser(){

    }

    public SqlUser(String fullname, String sender, String receiver, String imageurl, String messageID, String randomId,String saveCurrentTime1,String lastMessage,String type) {
        this.fullname = fullname;
        this.sender = sender;
        this.receiver = receiver;
        this.imageurl = imageurl;
        this.messageID = messageID;
        this.randomId = randomId;
        this.saveCurrentTime1 = saveCurrentTime1;
        this.lastMessage = lastMessage;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getRandomId() {
        return randomId;
    }

    public void setRandomId(String randomId) {
        this.randomId = randomId;
    }

    public String getSaveCurrentTime1() {
        return saveCurrentTime1;
    }

    public void setSaveCurrentTime1(String saveCurrentTime1) {
        this.saveCurrentTime1 = saveCurrentTime1;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static final Comparator<SqlUser> BY_NAME_ALPHABETICAL= new Comparator<SqlUser>() {
        @Override
        public int compare(SqlUser o1, SqlUser o2) {
            return o2.getSaveCurrentTime1().compareTo(o1.getSaveCurrentTime1());
        }
    };

}
