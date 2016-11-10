package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;

public class SiteFactory {
    public void creatSite(SiteType site) throws FileNotFoundException, IOException
    {   Site a;
        FileChooser file = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("HTML files (*.html)", "*.html");
        file.getExtensionFilters().add(extFilter);
        switch (site) {
            case CONTACT:   a= new Contact();
                            a.creatSite(file.showSaveDialog(null));
                break;
            case GALLERY:   a = new Gallery();
                            a.creatSite(file.showSaveDialog(null));
                break;
            case INFO:      a = new Information();
                            a.creatSite(file.showSaveDialog(null));
                break;
            case NEWS:      a = new News();
                            a.creatSite(file.showSaveDialog(null));
                break; 
        }
        Alert finish = new Alert(Alert.AlertType.INFORMATION);
        finish.setTitle("Generator");
        finish.setHeaderText("Gotowe :-)");
        finish.showAndWait();
    }
}
