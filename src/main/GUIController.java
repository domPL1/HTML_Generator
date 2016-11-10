/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author dompl
 */
public class GUIController implements Initializable {
    
    @FXML
    private Button gallery;
    @FXML
    private Button info;
    @FXML
    private Button contact;
    @FXML
    private Button end;
    @FXML
    private Button news;
    
    @FXML
    private void infoClick(ActionEvent event) throws IOException {
        SiteFactory a = new SiteFactory();
        a.creatSite(SiteType.INFO);
    }
    
    @FXML
    private void galleryClick(ActionEvent event) throws FileNotFoundException, IOException {
        SiteFactory a = new SiteFactory();
        a.creatSite(SiteType.GALLERY);
    }
    
    @FXML
    private void contactClick(ActionEvent event) throws FileNotFoundException, IOException {
        SiteFactory a = new SiteFactory();
        a.creatSite(SiteType.CONTACT);
    }
    
    @FXML
    private void newsClick(ActionEvent event) throws IOException {
        SiteFactory a = new SiteFactory();
        a.creatSite(SiteType.NEWS);
    }
    
    @FXML
    private void theEND(ActionEvent event) {
        System.exit(0);
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
