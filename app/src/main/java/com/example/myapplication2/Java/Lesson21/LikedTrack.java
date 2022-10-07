package com.example.myapplication2.Java.Lesson21;

public class LikedTrack extends Track{


    protected LikedTrack(long id, boolean isPremiumRequared) {

        super(id, isPremiumRequared);
    }

    @Override
    public void changeLike(ChangeLike[] services) {//будут приходить разные вещи
        for (ChangeLike service: services) {
            service.unlikeTrack(id);
        }
    }
}
