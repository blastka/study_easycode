package com.example.myapplication2.Java.lesson7;

public class Lesson7_1 {
    private static final String PERSON = "Оганес";

    public static void main(String[] args){
        final String person = "Оганес";
        String food = "Макароны с сыром";
        eatFoodEvening(food);
        food = "Фаршированный перец";
        eatFoodEvening(food);
        food = "Суп с фрикадельками";
        eatFoodEvening(food);
        food = "Рамен";
        eatFoodEvening(food);
        food = "Яичницу";
        eatFoodEvening(food);
        food = "Курицу гриль";
        eatFoodEvening(food);
    }

    public static void eatFoodEvening(String food ){
        System.out.println(PERSON + " съел блюдо " + food + " и теперь счастлив");
    }
}
