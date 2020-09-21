import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
public class BobIII extends Robot
{   
    private final int MODE = 0;// 0 = find dimensions, 1 = find room, 2 = find goal
    private final int STEPS = 1;
    private final int STARTX = 2;
    private final int STARTY = 3;
    private final int DIRECTION = 4;
    public BobIII(){
        super(Color.RED);
    }

    public void init(){
        setMode(0);
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
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave(){
        int mode = getMode();
        int steps = getSteps();
        int x = getX();
        int y = getY();
        if (mode == 0){
            if(steps == 0){
                setStart();
                if(isClearLeft()){
                    setDirection(0);
                } else {
                    setDirection(1);
                }
                down();
            }else{
                if(isClearUp()){
                    up();
                }else{}
            }
        }else if (mode == 2){

        }else if (mode == 3){

        }
        incSteps();
    }

    public void moveDir(int dir){
        if(dir == 0)
            up();
        else if(dir == 1)
            down();
        else if (dir == 2)
            left();
        else
            right();
    }

    public int getMode(){
        return getData(MODE);
    }

    public void setMode(int mode){
        setData(MODE, mode);
    }

    public int getSteps(){
        return getData(STEPS);
    }

    public void incSteps(){
        setData(STEPS, getSteps() + 1);
    }

    public void setStart(){
        setData(STARTX, getX());
        setData(STARTY, getY());
    }

    public int[] getStart(){
        return new int[]{getData(STARTX), getData(STARTY)};
    }

    public void setDirection(int dir){
        setData(DIRECTION, dir);
    }

    public int getDirection(){
        return getData(DIRECTION);
    }
}
