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
        
        Rectangle rect4 = new Rectangle(150,250,500,400);
        rect4.setFill(Color.BROWN); 
        
        // 4 Rectangle Pillars In Front Of House 
        
        Rectangle rect5 = new Rectangle(165,250,35,310);
        rect5.setFill(Color.WHITE); 
        Rectangle rect6 = new Rectangle(300,250,35,310);
        rect6.setFill(Color.WHITE); 
        Rectangle rect7 = new Rectangle(465,250,35,310);
        rect7.setFill(Color.WHITE); 
        Rectangle rect8 = new Rectangle(600,250,35,310);
        rect8.setFill(Color.WHITE); 
        
        // Small Rectangle Boxes Under Pillars 
        
        Rectangle pill1 = new Rectangle(160,560,45,15);
        pill1.setFill(Color.ORANGE); 
        Rectangle pill2 = new Rectangle(295,560,45,15);
        pill2.setFill(Color.ORANGE); 
        Rectangle pill3 = new Rectangle(460,560,45,15);
        pill3.setFill(Color.ORANGE); 
        Rectangle pill4 = new Rectangle(595,560,45,15);
        pill4.setFill(Color.ORANGE); 
        
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
        Rectangle bb3 = new Rectangle(215,435,25,20); 
        Rectangle bb4 = new Rectangle(255,435,25,20); 
        Rectangle bb5 = new Rectangle(215,465,25,20); 
        Rectangle bb6 = new Rectangle(255,465,25,20); 
        Rectangle bb7 = new Rectangle(215,495,25,20); 
        Rectangle bb8 = new Rectangle(255,495,25,20); 
        Rectangle bb9 = new Rectangle(215,525,25,20); 
        Rectangle bb10 = new Rectangle(255,525,25,20); 
        
        Rectangle rect11 = new Rectangle(362,380,75,190);
        rect11.setFill(Color.WHITE); 
        
        Rectangle bb11 = new Rectangle(365,405,25,20); 
        bb1.setFill(Color.BLACK); 
        Rectangle bb12 = new Rectangle(405,405,25,20); 
        Rectangle bb13 = new Rectangle(365,435,25,20); 
        Rectangle bb14 = new Rectangle(405,435,25,20); 
        Rectangle bb15 = new Rectangle(365,465,25,20); 
        Rectangle bb16 = new Rectangle(405,465,25,20); 
        Rectangle bb17 = new Rectangle(365,495,25,20); 
        Rectangle bb18 = new Rectangle(405,495,25,20); 
        Rectangle bb19 = new Rectangle(365,525,25,20); 
        Rectangle bb20 = new Rectangle(405,525,25,20); 
        
        Rectangle rect12 = new Rectangle(512,400,75,170);
        rect12.setFill(Color.WHITE); 
        
        Rectangle bb21 = new Rectangle(515,405,25,20); 
        bb1.setFill(Color.BLACK); 
        Rectangle bb22 = new Rectangle(555,405,25,20); 
        Rectangle bb23 = new Rectangle(515,435,25,20); 
        Rectangle bb24 = new Rectangle(555,435,25,20); 
        Rectangle bb25 = new Rectangle(515,465,25,20); 
        Rectangle bb26 = new Rectangle(555,465,25,20); 
        Rectangle bb27 = new Rectangle(515,495,25,20); 
        Rectangle bb28 = new Rectangle(555,495,25,20); 
        Rectangle bb29 = new Rectangle(515,525,25,20); 
        Rectangle bb30 = new Rectangle(555,525,25,20); 
        
        
        // Rectangle Steps (Grey)
        
        Rectangle sidestep1 = new Rectangle(150,575,55,5); 
        sidestep1.setFill(Color.GREY);
        Rectangle sidestep2 = new Rectangle(595,575,55,5); 
        sidestep2.setFill(Color.GREY);
        
        Rectangle step1 = new Rectangle(205,575,390,10); 
        step1.setFill(Color.GREY);
        Rectangle step2 = new Rectangle(195,585,410,10); 
        step2.setFill(Color.GREY);
        Rectangle step3 = new Rectangle(185,595,430,10); 
        step3.setFill(Color.GREY);
        Rectangle step4 = new Rectangle(175,605,450,10); 
        step4.setFill(Color.GREY);
        Rectangle step5 = new Rectangle(165,615,470,10); 
        step5.setFill(Color.GREY);
        Rectangle step6 = new Rectangle(155,625,490,10); 
        step6.setFill(Color.GREY);
        Rectangle step7 = new Rectangle(145,635,510,10); 
        step7.setFill(Color.GREY);
        Rectangle step8 = new Rectangle(135,645,530,10); 
        step8.setFill(Color.GREY);
        Rectangle step9 = new Rectangle(125,655,550,10); 
        step9.setFill(Color.GREY);
        Rectangle step10 = new Rectangle(115,665,570,10); 
        step10.setFill(Color.GREY);
        Rectangle step11 = new Rectangle(105,675,590,10); 
        step11.setFill(Color.GREY);
        
        
        Group sp = new Group(rect,rect1,lnl1,lnl2,lnl3,lnl4,rect3,rect4,rect5,rect6,rect7,rect8,rect9,rect10,rect11,rect12,circ1,circ2,circ3,circ4,
                             circ5,circ6,circ7,circ8,pill1,pill2,pill3,pill4,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18,bb19,bb20,bb21,
                             bb22,bb23,bb24,bb25,bb26,bb27,bb28,bb29,bb30,step1,step2,step3,step4,step5,step6,step7,step8,step9,step10,step11,sidestep1,sidestep2);
         
        
        /* For Loop To Create Steps In Front Of House 
            
            Rectangle[] rectangle = new Rectangle[11]; 
            for(int i=0; i < 11; i++){
        
            rectangle[i] = new Rectangle(); 
            rectangle[i].setLayoutX(175 + i); 
            rectangle[i].setLayoutY(575 + i); 
            sp.getChildren().add(rectangle[i]); 
      
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