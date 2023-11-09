package com.smd.elderease.classes;

public class ChatList
{
    private String person_name;
    private int unread_message;
    private int image;

    public ChatList(String person_name, int unread_message, int image)
    {
        this.person_name = person_name;
        this.unread_message = unread_message;
        this.image = image;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getUnread_message() {
        return unread_message;
    }

    public void setUnread_message(int unread_message) {
        this.unread_message = unread_message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
