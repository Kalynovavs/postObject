package ru.netology;

public class PostData {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private String postType;
    private Boolean friendsOnly;
    private String description;
    private int viewsCount;
    private int signerId;
    private Boolean canPin;
    private Boolean canDelete;
    private Boolean isPinned;
    private Boolean canEdit;
    private Boolean markedAsSds;
    private Boolean isFavorite;
    private int postponedId;

    private Comments comments;
    private Copyright copyright;
    private Likes likes;
    private Reposts reposts;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }


    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }
}
