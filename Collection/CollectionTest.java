package com.mphasis;


import java.util.*;

class Tastcollection{

    int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tastcollection(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public ArrayList<String> getlist(){
        ArrayList<String> array=new ArrayList<String>();
        System.out.println(array instanceof ArrayList);

        array.add("hai");
        array.add("Mphasis");
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tastcollection that = (Tastcollection) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
public class CollectionTest {

    public static void main(String[] args) {
        Tastcollection task=new Tastcollection(10,20);
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Collection<String> col=task.getlist();

        Iterator<Integer> it=list.iterator();
        Iterator<String> it1=col.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
        while(it1.hasNext()){

            System.out.println("String=>"+it1.next());
        }

    }
}
