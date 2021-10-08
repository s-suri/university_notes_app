package com.some.notes.Model;

import java.util.Comparator;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class DownloadModel extends RealmObject {

    @PrimaryKey
    private long id;
    String message,sender,receiver,messageID,bio,type,time,date,lastSendMessage,preMessage,imagrUrl;
    String isseen;
    long downloadId;
    String title;
    String file_path;
    String progress;
    String status;
    String file_size;
    boolean is_paused;
    String adminId;
    String username;

    public DownloadModel(){}

    public DownloadModel(String message, String sender, String receiver, String messageID, String bio, String type, String time, String date, String lastSendMessage, String preMessage, String isseen,String imagrUrl) {
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

    public String getImagrUrl() {
        return imagrUrl;
    }

    public void setImagrUrl(String imagrUrl) {
        this.imagrUrl = imagrUrl;
    }

    public String getIsseen() {
        return isseen;
    }

    public void setIsseen(String isseen) {
        this.isseen = isseen;
    }

    public long getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(long downloadId) {
        this.downloadId = downloadId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }

    public boolean isIs_paused() {
        return is_paused;
    }

    public void setIs_paused(boolean is_paused) {
        this.is_paused = is_paused;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static final Comparator<DownloadModel> BY_NAME= new Comparator<DownloadModel>() {
        @Override
        public int compare(DownloadModel o1, DownloadModel o2) {
            return o2.getMessageID().compareTo(o1.getMessageID());
        }
    };
}
