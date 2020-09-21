import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
public class BobII extends Robot
{
    public BobII(){
        super(Color.RED);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     */

    public void behave(){
        int f = 1;
        if(false){//Math.random() > 0.95){
            switch(Greenfoot.getRandomNumber(4)){
                case 0: up();
                case 1: down();
                case 2: left();
                case 3: right();
            }
        }else{
            int x = getX();
            int y = getY();
            if( x % 2 == f){
                if(isClearUp()){
                    up();
                } else {
                    right();
                }
            } else {
                if(isClearDown()){
                    down();
                }else{
                    right();
                }
            }
        }
    }
}
