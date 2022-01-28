package ru.netology;

public class ArticleData {
    private String title;
    private String author;
    private String postImgSrc;
    private Boolean favorite;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostImgSrc() {
        return postImgSrc;
    }

    public void setPostImgSrc(String postImgSrc) {
        this.postImgSrc = postImgSrc;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
