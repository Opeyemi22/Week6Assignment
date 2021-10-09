package com.mycompany.week6assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        
        Rectangle rect3 = new Rectangle(150,200,500,50); 
        rect3.setFill(Color.WHITE); 
        
        // Brown Square Block (House Block) 
        
        Rectangle rect4 = new Rectangle(150,250,500,350);
        rect4.setFill(Color.BROWN); 
        
        // 4 Rectangle Pillars In Front Of House 
        
        Rectangle rect5 = new Rectangle(165,250,35,320);
        rect5.setFill(Color.WHITE); 
        Rectangle rect6 = new Rectangle(300,250,35,320);
        rect6.setFill(Color.WHITE); 
        Rectangle rect7 = new Rectangle(465,250,35,320);
        rect7.setFill(Color.WHITE); 
        Rectangle rect8 = new Rectangle(600,250,35,320);
        rect8.setFill(Color.WHITE); 
        
        // Grey Rectangle Box 
        
        Rectangle rect9 = new Rectangle(362,270,75,55);
        rect9.setFill(Color.GREY); 
        
        
         // 8 Circles On Top Of Pillars 
        
        Circle circ1 = new Circle(165,265,13);
        circ1.setFill(Color.BLACK); 
        Circle circ2 = new Circle(200,265,13);
        Circle circ3 = new Circle(300,265,13);
        Circle circ4 = new Circle(335,265,13);
        Circle circ5 = new Circle(465,265,13);
        Circle circ6 = new Circle(500,265,13);
        Circle circ7 = new Circle(600,265,13);
        Circle circ8 = new Circle(635,265,13);
        
        // 3 Doors With Black Boxes In Them; 
        
        Rectangle rect10 = new Rectangle(212,400,75,170);
        rect10.setFill(Color.WHITE); 
        
        Rectangle bb1 = new Rectangle(215,405,25,20); 
        bb1.setFill(Color.BLACK); 
        Rectangle bb2 = new Rectangle(255,405,25,20); 
        Rectangle bb3 = new Rectangle(215,430,25,20); 
        Rectangle bb4 = new Rectangle(255,430,25,20); 
        Rectangle bb5 = new Rectangle(); 
        Rectangle bb6 = new Rectangle(); 
        Rectangle bb7 = new Rectangle(); 
        Rectangle bb8 = new Rectangle(); 
        Rectangle bb9 = new Rectangle(); 
        Rectangle bb10 = new Rectangle(); 
        
        Rectangle rect11 = new Rectangle(362,380,75,190);
        rect11.setFill(Color.WHITE); 
        
        Rectangle bb11 = new Rectangle(); 
        Rectangle bb12 = new Rectangle(); 
        Rectangle bb13 = new Rectangle(); 
        Rectangle bb14 = new Rectangle(); 
        Rectangle bb15 = new Rectangle(); 
        Rectangle bb16 = new Rectangle(); 
        Rectangle bb17 = new Rectangle(); 
        Rectangle bb18 = new Rectangle(); 
        Rectangle bb19 = new Rectangle(); 
        Rectangle bb20 = new Rectangle(); 
        
        Rectangle rect12 = new Rectangle(512,400,75,170);
        rect12.setFill(Color.WHITE); 
        
        Rectangle bb21 = new Rectangle(); 
        Rectangle bb22 = new Rectangle(); 
        Rectangle bb23 = new Rectangle(); 
        Rectangle bb24 = new Rectangle(); 
        Rectangle bb25 = new Rectangle(); 
        Rectangle bb26 = new Rectangle(); 
        Rectangle bb27 = new Rectangle(); 
        Rectangle bb28 = new Rectangle(); 
        Rectangle bb29 = new Rectangle(); 
        Rectangle bb30 = new Rectangle(); 
        
        
         Group sp = new Group(rect,rect1,lnl1,lnl2,lnl3,lnl4,rect3,rect4,rect5,rect6,rect7,rect8,rect9,rect10,rect11,rect12,circ1,circ2,circ3,circ4,
                              circ5,circ6,circ7,circ8,bb1,bb2,bb3,bb4);
         
       
        
 
        
        // For Loop To Create Steps In Front Of House 
        
        
        /*  for(int i=0; i < 8; i++){
        
            circles[i] = new Circle(); 
            circles[i].setLayoutX(165 + i); 
            circles[i].setLayoutY(165 + i); 
            sp.getChildren().add(circles[i]); 
      
        }
        
        
        */
        
        
        
        
        
        var scene = new Scene(sp, 800, 800);
        stage.setScene(scene);
        stage.setTitle("Opeyemi Orioke"); 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}