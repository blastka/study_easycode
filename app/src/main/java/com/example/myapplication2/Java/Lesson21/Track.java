package com.example.myapplication2.Java.Lesson21;

public abstract class Track {
    protected final long id;
    protected final boolean isPremiumRequared;

    protected Track(long id, boolean isPremiumReqiared){
        this.id = id;
        this.isPremiumRequared = isPremiumReqiared;
    }

    public void play(Player player){
        player.play(id);
    }

    public abstract void changeLike(ChangeLike[] service);

}
