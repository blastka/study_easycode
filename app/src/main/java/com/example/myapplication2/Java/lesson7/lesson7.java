package com.example.myapplication2.Java.lesson7;

public class lesson7 {
    public static void main(String[] args){
        final String person = "Оганес";
        String food = "Макароны с сыром";
        eatFoodEvening(person, food);
        food = "Фаршированный перец";
        eatFoodEvening(person, food);
        food = "Суп с фрикадельками";
        eatFoodEvening(person, food);
        food = "Рамен";
        eatFoodEvening(person, food);
        food = "Яичницу";
        eatFoodEvening(person, food);
        food = "Курицу гриль";
        eatFoodEvening(person, food);
    }

    public static void eatFoodEvening(String person, String food ){
        System.out.println(person + " съел блюдо " + food + " и теперь счастлив");
    }
}
