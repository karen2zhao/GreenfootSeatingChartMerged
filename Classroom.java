import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.Constructor;

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);

        prepare();
    }
    public void act(){
        prepare();
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    public void prepare()
    {
        NibodhVallapureddy nibodhvallapureddy = new NibodhVallapureddy("Nibodh", "Vallapureddy", 1, 1, 2);
        addObject(nibodhvallapureddy, 1, 1);
        nibodhvallapureddy.sitDown();
        
        KarenZhao karenzhao = new KarenZhao("Karen", "Zhao", 1, 2, 2);
        addObject(karenzhao, 1, 2);
        karenzhao.sitDown();
        
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 1, 3, 2);
        addObject(chelsealee, 1, 3);
        chelsealee.sitDown();

        JoshuaChon joshuachon = new JoshuaChon("Joshua", "Chon", 2, 1, 3);
        addObject(joshuachon, 2, 1);
        joshuachon.sitDown();
        
        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2, 3);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();

        EllaDeGuzman elladeguzman = new EllaDeGuzman("Ella", "DeGuzman", 2, 3, 3);
        addObject(elladeguzman, 2, 3);
        elladeguzman.sitDown();
        
        TogglePeriodBtn button = new TogglePeriodBtn();
        addObject(button, 8, 1);
        
        int currentPeriod = getObjects(TogglePeriodBtn.class).get(0).getCurrentPeriod();
       
        //Uncomment this section below. I commented it to ensure no errors when pushing it to github. This is also where I am getting the error.
        List<Student> students = getObjects(Student.class);
        //currentPeriod =3;
        
        showText("CurrentPeriod " + currentPeriod, 7,1);
      
        for (Student student: students) {
            if (student.getPeriod() == currentPeriod) {
                

            } else {
                System.out.println("Removing student" + student);
                removeObject(student);
            }
        }
    }
  
}

