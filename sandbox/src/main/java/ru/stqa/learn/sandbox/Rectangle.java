package ru.stqa.learn.sandbox;

public class Rectangle {
    public double a;
    public double b;
    public Rectangle(double a, double b) { //это конструктор
        this.a = a;
        this.b = b;
    }
    public /*static*/ double area() { //это метод. Тут static убрали, т.к оно используется
        //для помечания ф-ций, которые не ассоциированы с ни с каким объектом,
        //к которым можно обращаться напрямую. А к методам можно обращаться,
        //только указав перед ними только какой-то объект. *Аналогично и в Square.
        return this.a * this.b;
    }
}
