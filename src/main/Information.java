package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Information extends Site {
    @Override
    public void creatSite(File file) throws FileNotFoundException
    {
        String dane = new String();
        Information.a=new PrintWriter(file);   
        a.println("<HTML>");
        a.println("<BODY>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        dane = this.losuj();
        a.println("<P>"+dane+"</P>");
        a.println("</BODY>");
        a.println("</HEAD>");
        a.close();
    }
    private String losuj()
    {
        String dane = new String();
        Random gen = new Random();
        dane="";
         for (int i=0;i<30;i++)
        {
            dane=dane.concat(Character.toString((char) ((char)gen.nextInt(25)+97)));
        }
         return dane;
    }
    
}
