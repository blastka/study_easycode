package com.example.myapplication2.Java.Lesson21;

public class Track {
    private boolean isLiked;
    private final long id;

    public Track(boolean isLiked, long id){
        this.isLiked = isLiked;
        this.id = id;
    }

    public void changeLiked(LikeService service, Ui ui){
        if (isLiked){
            service.unlikeTrack(id);
            ui.unlikeTrack(id);
        }else{
            service.likeTrack(id);
            ui.likeTrack(id);
        }
    }
}
