package com.some.notes.Model;

import android.net.Uri;

import java.util.Comparator;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class SqlMessage extends RealmObject {

    @PrimaryKey
    private long id;
    String message,sender,receiver,messageID,bio,type,time,date,lastSendMessage,preMessage,imagrUrl;
    String isseen;


    public SqlMessage(String message, String sender, String receiver, String messageID, String bio, String type, String time, String date, String lastSendMessage, String preMessage, String isseen,String imagrUrl) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.messageID = messageID;
        this.bio = bio;
        this.type = type;
        this.time = time;
        this.date = date;
        this.lastSendMessage = lastSendMessage;
        this.preMessage = preMessage;
        this.isseen = isseen;
        this.imagrUrl = imagrUrl;

    }

    public SqlMessage(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLastSendMessage() {
        return lastSendMessage;
    }

    public void setLastSendMessage(String lastSendMessage) {
        this.lastSendMessage = lastSendMessage;
    }

    public String getPreMessage() {
        return preMessage;
    }

    public void setPreMessage(String preMessage) {
        this.preMessage = preMessage;
    }

    public String getIsseen() {
        return isseen;
    }

    public void setIsseen(String isseen) {
        this.isseen = isseen;
    }

    public String getImagrUrl() {
        return imagrUrl;
    }

    public void setImagrUrl(String imagrUrl) {
        this.imagrUrl = imagrUrl;
    }



}
