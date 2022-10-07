package com.example.myapplication2.Java.Lesson21;

public class RegularTrack extends Track{

//не особо нормальный подход для isPremiumRequiared
    protected RegularTrack(long id, boolean isPremiumRequiared) {

        super(id, isPremiumRequiared);
    }

    @Override
    public void changeLike(ChangeLike[] services) {
        for (ChangeLike service: services) {
            service.likeTrack(id);
        }
    }

}
