package com.some.notes.Model;

public class Chat {

    private String sender;
    private String receiver;
    private String senderImage;
    private String receiverImage;
    private String senderPdf;
    private String receiverPdf;
    private String time;
    private String date;
    private String message;
    private String isseen;
    private String type;
    private String messageID;
    private String uid;
    private String groupName;
    private String name;
    private String userMessageId;
    private String id;
    private boolean seen;
    private String lastSendMessage;


    public Chat(String sender, String receiver, String message, String isseen
    , String senderImage, String receiverImage, String senderPdf,
                String receiverPdf, String time, String date, String type, String messageID, String uid,
                String groupName, String name, String userMessageId, String id, boolean seen, String lastSendMessage) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen = isseen;
        this.senderImage=senderImage;
        this.receiverImage = receiverImage;
        this.senderPdf = senderPdf;
        this.receiverPdf = receiverPdf;
        this.time = time;
        this.date = date;
        this.type = type;
        this.messageID = messageID;
        this.uid = uid;
        this.groupName = groupName;
        this.name= name;
        this.userMessageId = userMessageId;
        this.id = id;
        this.seen = seen;
        this.lastSendMessage = lastSendMessage;
    }



    public String getSenderImage() {
        return senderImage;
    }

    public void setSenderImage(String senderImage) {
        this.senderImage = senderImage;
    }

    public String getReceiverImage() {
        return receiverImage;
    }

    public void setReceiverImage(String receiverImage) {
        this.receiverImage = receiverImage;
    }

    public String getSenderPdf() {
        return senderPdf;
    }

    public void setSenderPdf(String senderPdf) {
        this.senderPdf = senderPdf;
    }

    public String getReceiverPdf() {
        return receiverPdf;
    }

    public void setReceiverPdf(String receiverPdf) {
        this.receiverPdf = receiverPdf;
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

    public Chat() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIsseen() {
        return isseen;
    }

    public void setIsseen(String isseen) {
        this.isseen = isseen;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserMessageId() {
        return userMessageId;
    }

    public void setUserMessageId(String userMessageId) {
        this.userMessageId = userMessageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getLastSendMessage() {
        return lastSendMessage;
    }

    public void setLastSendMessage(String lastSendMessage) {
        this.lastSendMessage = lastSendMessage;
    }
}
