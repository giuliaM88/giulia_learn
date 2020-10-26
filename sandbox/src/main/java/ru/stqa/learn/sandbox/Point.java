package ru.stqa.learn.sandbox;

public class Point {
    public double x;
    public double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p2) {
        return Math.sqrt(((p2.x - this.x) * (p2.x - this.x)) + ((p2.y - this.y) * (p2.y - this.y)));
    }
    //закомментированые строки - это пункты 1-3 из ДЗ занятия 1
    /*public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }*/
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 3);
        System.out.println("Кооридинаты точки А: " + "x = " + p1.x + " y = " + p1.y);
        System.out.println("Кооридинаты точки B: " + "x = " + p2.x + " y = " + p2.y);
        System.out.println("Расстояние между точками А и В: " + p1.distance(p2));
        //System.out.println("Расстояние между точками А и В: " + distance(p1, p2));
    }
}
