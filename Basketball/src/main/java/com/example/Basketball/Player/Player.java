package com.example.Basketball.Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.persistence.*;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
@Entity
@Table(name="PLAYER_TBL")
public class Player {

    @Id
    @SequenceGenerator(name="player_sequence", sequenceName="player_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    private long id;
    private String name;
    private double height;
    private int jNum;
    private double ppg;

    @Transient
    private int age;

    public Player(){
        
    }

    public Player(String n, double h, int j, double p){
        this.name = n;
        this.height = h;
        this.jNum = j;
        this.ppg = p;
    }

    public Player(long i, String n, double h, int j, double p){
        this.id = i;
        this.name = n;
        this.height = h;
        this.jNum = j;
        this.ppg = p;
    }


    public long getId(){
        return id;
    }

    public double getPpg() {
        return ppg;
    }
    public int getjNum() {
        return jNum;
    }
    public void setjNum(int jNum) {
        this.jNum = jNum;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPpg(double ppg) {
        this.ppg = ppg;
    }
    
    public String toString(){
        return 
        "Player: " + id + 
        "\nName: " + name + 
        "\nJersey no: " + jNum + 
        "\nHeight: " + height + 
        "\nPpg: " + ppg;
    }
}
