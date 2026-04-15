/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author vladu
 */
public class Game {
    private int n;
    private int stickCount;
    
    private ArrayList<Stick> alSticks = new ArrayList<>();
    
    public Game(int n){
        this.n=n;
        
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                alSticks.add(new HorizontalStick());
            }else if(i%2 ==1){
                alSticks.add(new VerticalStick());
            }
            
        }
    }
    
    public int getStickCount(){
        return stickCount;
    }
    
    public void clicked(Point p){
        for(Stick s : alSticks){
            if(s.collides(p)){
                alSticks.remove(s);
                stickCount--;
            }
        }
    }
    
    public void drawAll(Graphics g){
        for(Stick s : alSticks){
        s.draw(g);
    }
        
    }
    
    
    
}
