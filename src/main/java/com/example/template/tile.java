package com.example.template;

public class tile {
    Boolean flagged=false;
    Boolean revealed=false;
    int num;
    Boolean bomb;
    int intstatus=0;
    public tile(){
    }
    public void updateFlag(Boolean status){
        flagged=status;
    }
    public Boolean getFlag(){return flagged;}
    public void setBomb(Boolean b){bomb=b;}
    public Boolean getBomb(){return bomb;}
    public int getIfBomborNum(){return intstatus;}
    public void setIfBomborNum(int num){intstatus=num;}
    public void updateReveal(Boolean reveal){revealed=reveal;}
    public Boolean getReveal(){return revealed;}
    public void setNum(int n){num=n;}
    public int getNum(){return num;}
}
