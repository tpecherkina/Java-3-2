package ru.netology.domain;

public class Comments {
    private UserID userID;
    private String title;
    private String commentsDate;
    private String commentsPhoto;
    private Likes likes;

    public UserID getUserID() {
        return userID;
    }

    public void setUserID(UserID userID) {
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCommentsDate() {
        return commentsDate;
    }

    public void setCommentsDate(String commentsDate) {
        this.commentsDate = commentsDate;
    }

    public String getCommentsPhoto() {
        return commentsPhoto;
    }

    public void setCommentsPhoto(String commentsPhoto) {
        this.commentsPhoto = commentsPhoto;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

}
