package ru.netology.domain;

public class Post {
    private String postName;
    private String postDate;
    private String postPhoto;
    private UserID userID;
    private Comments Comments;
    private Likes likes;

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }


    public String getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(String postPhoto) {
        this.postPhoto = postPhoto;
    }

    public UserID getUserID() {
        return userID;
    }

    public void setUserID(UserID userID) {
        this.userID = userID;
    }

    public ru.netology.domain.Comments getComments() {
        return Comments;
    }

    public void setComments(ru.netology.domain.Comments comments) {
        Comments = comments;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }
}
