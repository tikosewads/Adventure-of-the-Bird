import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuccessWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuccessWorld extends World
{

    /**
     * Constructor for objects of class SuccessWorld.
     * 
     */
    public SuccessWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(800, 600, 1); 
       GreenfootImage bgBirdWorld = new GreenfootImage("Success_Background.jpg");
       bgBirdWorld.scale(getWidth(), getHeight());
       setBackground(bgBirdWorld);
    }
}
