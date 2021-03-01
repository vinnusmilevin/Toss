package com.mphasis.lambda;



    interface Data{
        public void display();
    }

public class LambdaTest{

    public static void main(String[] args) {
       Data lambdat=()-> System.out.println("hai");
        lambdat.display();
    }
}