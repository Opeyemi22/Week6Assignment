package com.mycompany.week6assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
     
    public void start(Stage stage) {
        
        // Sky Blue (Sky) Background
        Rectangle rect = new Rectangle(0,0,800,350);
        rect.setFill(Color.SKYBLUE); 
        
        // Light Green (Grass) Background
        Rectangle rect1 = new Rectangle(0,350,800,500);
        rect1.setFill(Color.LAWNGREEN); 
        
        // White Trangle (Roof) 
        Line lnl1 = new Line (400,0,100,200); 
        Line lnl2 = new Line (400,0,700,200); 
        Line lnl3 = new Line (400,200,700,200); 
        Line lnl4 = new Line (100,200,700,200); 
        
        // Rectangle Beneath The Roof 
        
        Rectangle rect3 = new Rectangle(150,200,500,70); 
        rect3.setFill(Color.WHITE); 
        
        
        Group sp = new Group(rect,rect1,lnl1,lnl2,lnl3,lnl4,rect3);
        var scene = new Scene(sp, 800, 800);
        stage.setScene(scene);
        stage.setTitle("Opeyemi Orioke"); 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}