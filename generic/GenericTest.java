package com.mphasis.generic;


class Point<T>{
   T x,y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class GenericTest {


    public static void main(String[] args) {
        Point<Integer> point1=new Point<Integer>(10,10);
        Point<Float> point2=new Point<Float>(10.0F,12.0F);
        System.out.println(
                "hai"+point1+"++++"+point2
        );
    }
}
