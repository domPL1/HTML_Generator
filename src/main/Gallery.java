package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import javafx.stage.FileChooser;

public class Gallery extends Site{

    @Override
    public void creatSite(File file) throws FileNotFoundException{
        FileChooser img = new FileChooser();
        FileChooser.ExtensionFilter extFilter2 = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.png");
        FileChooser.ExtensionFilter extFilter1 = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.jpg");
        FileChooser.ExtensionFilter extFilter3 = new FileChooser.ExtensionFilter("GIF files (*.gif)", "*.gif");
        FileChooser.ExtensionFilter extFilter4 = new FileChooser.ExtensionFilter("All files", "*.*");
        img.getExtensionFilters().addAll(extFilter1,extFilter2,extFilter3,extFilter4);
        List<File> k = img.showOpenMultipleDialog(null);
        Gallery.a=new PrintWriter(file); 
        a.println("<HTML>");
        a.println("<BODY>");
        for (int i=0;i<k.size();i++)
        {
            a.println("<IMG SRC="+k.get(i).getPath()+">");
        }
        a.println("</BODY>");
        a.println("</HTML>");
        a.close();
    }
}

