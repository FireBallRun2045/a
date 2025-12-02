package com.example.template;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    public Button btnClick;
    public GridPane gPain;
    private Button[][] btn=new Button[12][12];
    private tile[][] board=new tile[12][12];
    private int mode=1;

    public void initalize(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = new tile();
            }
        }
        makeBomb();
    }
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
                checkBomb(column,row);
            }
        };

        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn.length; j++) {
                btn[i][j].setOnAction(z);
            }
        }
    }

    public void checkBomb(int col,int row){
        if(board[row][col].getBomb()){
            System.out.println("("+row+","+col+")"+" is a bomb.");
        }

    }
    public void makeBomb(){
        int b=1;
        for (int i = 0; i < b; i++) {
            int c=random(0,11);
            int r=random(0,11);
            board[r][c].setBomb(true);
            board[r][c].setIfBomborNum(1);
        }
    }
    public void checkNumSurroundingBomb(tile[][] array,int col,int row){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

            }
        }
    }


    public int random(int max,int min){
        return (int)(Math.random()*(max-min))+min;
    }
    public void setEasy(){
        mode=1;
    }
}