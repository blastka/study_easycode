package com.example.myapplication2.Java.Lesson21;

public abstract class User {

    public abstract void play(long id, boolean isPremiumRequired);

    public static class Premium extends User {

        private final Player player;

        public Premium(Player player) {

            this.player = player;
        }

        @Override
        public void play(long id, boolean isPremiumRequired) {

            player.play(id);
        }
    }

    public static class Regilar extends User{

        private Player player;
        private final Navigation navigation;

        @Override
        public void play(long id, boolean isPremiumRequired) {
            if (isPremiumRequired){
                navigation.goToPaymentScreen();
            }else {
                player.play(id);
            }
        }
    }
}
