package com.mphasis.serilaztion;


import java.io.*;

class Demo implements java.io.Serializable
{   private static final long SerialVersionUID=15l;
    public int a=10;
    public int b=15;

   static int k=10;

}

class SerilaztionTest
{
    public static void main(String[] args)
    {
        Demo object = new Demo();

       try
        {

            FileOutputStream filename = new FileOutputStream("filen.txt");
            ObjectOutputStream out = new ObjectOutputStream(filename);


            out.writeObject(object);

            out.close();
            filename.close();

            System.out.println("Object has been serialized");



            FileInputStream filenamei = new FileInputStream("filen.txt");
            ObjectInputStream in = new ObjectInputStream(filenamei);
            Demo object1=null;

            object1 = (Demo)in.readObject();

            in.close();
            filenamei.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
