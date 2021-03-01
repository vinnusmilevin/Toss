package com.mphasis.lambda;

interface Datatest{
    public void display(String data,int n);
}

class Perform{


    public int perform(Datatest print) {
        print.display("Mphasis",30);

        return 0;
    }
}

public class Lambdatest1{

    public static void main(String[] args) {
        Datatest lambdat=(text,number)-> System.out.println(text+number);
        Perform task=new Perform();
        task.perform(lambdat);
       // lambdat.display("Mphasis",30);
    }
}
