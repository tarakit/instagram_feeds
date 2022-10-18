package com.istad.instagram;

public class Feed {

    private String name;
    private String userProfile;
    private boolean isLiked;
    private boolean isBookMarked;
    private int likeAmount;
    private String caption;
    private String viewAmount;
    private String momentAgo;

    public Feed(String name, String userProfile, boolean isLiked, boolean isBookMarked, int likeAmount, String caption, String viewAmount, String momentAgo) {
        this.name = name;
        this.userProfile = userProfile;
        this.isLiked = isLiked;
        this.isBookMarked = isBookMarked;
        this.likeAmount = likeAmount;
        this.caption = caption;
        this.viewAmount = viewAmount;
        this.momentAgo = momentAgo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public boolean isBookMarked() {
        return isBookMarked;
    }

    public void setBookMarked(boolean bookMarked) {
        isBookMarked = bookMarked;
    }

    public int getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(int likeAmount) {
        this.likeAmount = likeAmount;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getViewAmount() {
        return viewAmount;
    }

    public void setViewAmount(String viewAmount) {
        this.viewAmount = viewAmount;
    }

    public String getMomentAgo() {
        return momentAgo;
    }

    public void setMomentAgo(String momentAgo) {
        this.momentAgo = momentAgo;
    }
}
