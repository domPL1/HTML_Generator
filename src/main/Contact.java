package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Contact extends Site {
    @Override
    public void creatSite(File file) throws FileNotFoundException
    {
        String dane = new String();
        Random gen = new Random();
        Contact.a=new PrintWriter(file);   
        a.println("<HTML>");
        a.println("<BODY>");
        for (int i=0;i<6;i++)
        {
            dane=dane.concat(Character.toString((char) ((char)gen.nextInt(25)+97)));
        }
        a.println("<H1>Imie: "+dane+"</H1>");
        dane="";
         for (int i=0;i<6;i++)
        {
            dane=dane.concat(Character.toString((char) ((char)gen.nextInt(25)+97)));
        }
        a.println("<H1>Nazwisko: "+dane+"</H1>");
        dane="";
         for (int i=0;i<16;i++)
        {
            dane=dane.concat(Character.toString((char) ((char)gen.nextInt(25)+97)));
        }
        a.println("<H1>Adres: "+dane+"</H1>");
        dane="";
         for (int i=0;i<6;i++)
        {
            dane=dane.concat(Character.toString((char) ((char)gen.nextInt(25)+97)));
        }
        a.println("<H1>Miasto: "+dane+"</H1>");
        dane="";
        for (int i=0;i<9;i++)
        {
            dane=dane.concat(Integer.toString(gen.nextInt(9)));
        }
        a.println("<H1>Telefon: "+dane+"</H1>");
        a.println("</BODY>");
        a.println("</HEAD>");
        a.close();
    }
}
