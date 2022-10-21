package com.example.myapplication2.Java.lesson28.exercise1;

/**
 * Задача на цепочку обязанностей номер 1
 * Пишем тот же класс треугольника, к нему пишем цепочку с 1 методом в интерфейсе –
 * рассчитать площадь. Первое звено – если треугольник равносторонний то высчитываем через
 * формулу (a2 * Math.sqrt(3) )/ 4. Если нет, то отдаем другому звену. Второе звено для
 * равнобедренного треугольника, сначала находим высоту через теорему Пифагора, после уже
 * берем произведение половины стороны и высоты (0.5 * а * h) . Далее звено для
 * прямоугольного треугольника – там просто половина произведения катетов. Ну и последнее
 * звено общая формула которая описана в одной из лекций про треугольник. Найдите сами.
 * Дайте доступ к сторонам треугольника через геттеры для этой задачи чтобы не хранить
 * методы определения типа треугольника. Или же напишите метод определения типа
 * треугольника в классе треугольника который вернет enum и используйте его, а поля класса
 * сделайте приватными. Решайте сами.
 * Сначала напишите классическим способом через сеттер следующего звена, после
 * перепишите на метод с интерфейсом и private final first , second.
 */
public class Solution {
}
