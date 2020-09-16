import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TogglePeriodBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TogglePeriodBtn extends Actor
{

    private static int currentPeriod =3;
    //public int getCurrentPeriod(){
    //    return this.currentPeriod;
    //}
    public void act() 
    {
        Classroom cls = null;
        if(Greenfoot.mouseClicked(this)){ //checks if button is clicked
            if (this.currentPeriod == 3) { //checks if it is period 3
                this.currentPeriod = 2; //if it is, changes to period 2
                setImage("button-blue.png"); //changes image to period 2
                cls = new Classroom();
            }
            else 
            {
                this.currentPeriod = 3; //changes period to period 3
                setImage("button-blue.png"); //changes image to period 3
                cls = new Classroom();
            }
            //getWorld.prepare();
            //System.out.println("In class: " + this.currentPeriod);
        } 
        

    }
    public int getCurrentPeriod() {
        return this.currentPeriod;
    }
}
