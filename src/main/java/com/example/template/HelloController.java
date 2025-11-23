package com.example.template;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class HelloController {

    public Button btnClick;
    public GridPane gPain;
    private Button[][] btn=new Button[12][12];
    private tile[][] board=new tile[12][12];

    public void handleClick(ActionEvent actionEvent) {
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j]=new Button();
                gPain.add(btn[i][j],j,i);
                //adding it in oppisite order so row,column works.
            }
        }
        EventHandler z=new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(event.getSource());
                //down casting
                //((Button) event.getSource()).setText("hello");
                int row=GridPane.getRowIndex(((Button) event.getSource()));
                int column=GridPane.getColumnIndex(((Button) event.getSource()));
                System.out.println("("+row+","+column+")");
                btn[row][column].setText("s");
                checkBomb(board,column,row);
            }
        };

        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn.length; j++) {
                btn[i][j].setOnAction(z);
            }
        }
    }

    public void checkBomb(tile[][] array,int col,int row){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if(array[i][j].getBomb()){
                    System.out.println("("+row+","+col+")"+" is a bomb.");
                }
            }
        }
    }
    public void checkNumSurroundingBomb(tile[][] array,int col,int row){

    }


    public int random(int max,int min){
        return (int)(Math.random()*(max-min))+min;
    }
}