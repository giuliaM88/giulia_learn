package ru.stqa.learn.sandbox;

public class Square {
    public double l; //атрибут
    public Square(double l) { //это конструктор, l тут - параметр.
        this.l = l; //в this.l "l"- это атрибут, а после "=" - это аргумент ф-ции.
    } //это - конструктор
    public double area() { //метод
        return this.l * this.l;
    }
}
