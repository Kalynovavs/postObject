package ru.netology;

public class Likes {
    private int count;
    private Boolean userLikes;
    private Boolean canLike;
    private Boolean canPublish;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Boolean userLikes) {
        this.userLikes = userLikes;
    }

    public Boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public Boolean getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(Boolean canPublish) {
        this.canPublish = canPublish;
    }
}
