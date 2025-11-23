package com.example.template;

public class tile {
    Boolean flagged=false;
    Boolean revealed=false;
    int num;
    Boolean bomb;
    public tile(Boolean bomb){
        this.bomb=bomb;
    }
    public void updateFlag(Boolean status){
        flagged=status;
    }
    public Boolean getFlag(){return flagged;}
    public void setBomb(Boolean b){bomb=b;}
    public Boolean getBomb(){return bomb;}
    public void updateReveal(Boolean reveal){revealed=reveal;}
    public Boolean getReveal(){return revealed;}
    public void setNum(int n){num=n;}
    public int getNum(){return num;}
}
