package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField North;

    @FXML
    private TextField South;

    @FXML
    private TextField East;

    @FXML
    private TextField West;

    @FXML
    private Button xml;

    @FXML
    private Button json;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    /*
    @FXML
    private void initialize() {
        ToggleGroup group = new ToggleGroup();
        radioButton.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
    }
    */

    @FXML
    protected void onJsonButtonClick(){
        String nord = North.getText();
        String sud = South.getText();
        String est = East.getText();
        String ouest = West.getText();

        callWebService callWebService = new callWebService();
        callWebService.initializeService("http://api.geonames.org/");

        String response = callWebService.callCitiesAndPlaceNameInfoService("citiesJSON",nord,sud,est,ouest,"fr","me");

        System.out.println("Reponse : \n"+ response);
    }
    @FXML
    protected void onXmlButtonClick(){
        json.setCancelButton(false);
    }

}