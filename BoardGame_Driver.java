/*Thomas Boehme
*Card/board game similar to Magic and Chess - driver.
*start date: 2/11/2017
*last edited: 2/25/2017
*finish date: ----
*/

//package to the rest of the board game files
package Card_Board_Game;

//imports needed for the program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//the main class used in the program
class BoardGame_Driver{
   private JPanel gameBoard = new JPanel();
   private JFrame frame = new JFrame("");
   private GridLayout gameGrid = new GridLayout(); //sets the grid for the game
   private int[] frameSize = new int[2];           //holds onto the size of the frame
   private int[] spaceSize = new int[2];           //gives a specifc size for the spaces based on frame size
   private final int X = 0, Y = 1;                 //sets the numbers for list variables as X and Y
   private int numberOfSpaces;
   
   //main method
   public static void main(String[] args){
      java.awt.EventQueue.invokeLater(new Runnable(){
         public void run(){
            createStandardUI();
         }
      });
   }
   //creates UI set up
   private static void createStandardUI(){
      JFrame frame = new JFrame("Game Board");
      frame.setSize(500,500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new BoardGame_Driver().getMainComponent());
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   
   //returns the panel currently being used
   private JComponent getMainComponent(){
      drawGameGrid();
      return gameBoard;
   }
   
   private void drawGameGrid(){
      Dimension dim = frame.getBounds().getSize();//gets the size of the the frame to draw grid
      frameSize[X] = (int) dim.getWidth();        //converts the double for the width to an int
      frameSize[Y] = (int) dim.getHeight();       //converts the double for the height to an int
      numberOfSpaces = 8;
      spaceSize[X] = frameSize[X] / 8;
      spaceSize[Y] = frameSize[Y] / 8;
      System.out.println("The size of the frame is: " + frameSize[X] + ", " + frameSize[Y]);
      System.out.println("The size of the frame is: " + spaceSize[X] + ", " + spaceSize[Y]);
   }
}