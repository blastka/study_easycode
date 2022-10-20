package com.example.myapplication2.Java.lesson27;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private final List<Subscriber> subscriberList = new ArrayList<>();

    private void addSubscribe(Subscriber subscriber){
        subscriberList.add(subscriber);

    }

    private void removeSubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    private void postVideo(VideoTrack videoTrack){
        for (Subscriber subscriber: subscriberList){
            subscriber.notify(new Nofification(videoTrack));
        }
    }

    public void showSubscriberCount(Show<String> show){
        show.show("s" + subscriberList.size());
    }
}

class Subscriber{
    public void notify{
        // TODO: 19.10.2022
    }
}

class VideoTrack{

}

interface Show<T>{
    void show(T data);
}