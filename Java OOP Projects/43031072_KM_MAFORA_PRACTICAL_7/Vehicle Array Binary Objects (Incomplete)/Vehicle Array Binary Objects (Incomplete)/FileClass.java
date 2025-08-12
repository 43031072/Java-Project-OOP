
/**
 * Write a description of class FileClass here.
 * 
 * @author (KM MAFORA 43031072) 
 * @version (15 April 2024)
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileClass
{
    private Vehicle [] arrVehicles = new Vehicle[20];
    private int count = 0;
    
 public void readFromFile(String fileName)
   {
    try
        {
            Scanner sc = new Scanner(new FileReader(fileName));

            while (sc.hasNext())
            {
              String line = sc.nextLine();
              String [] info = line.split(",");

              String owner = info[0];
              String regNum = info[1];
              String make = info[2];
              int year = Integer.parseInt(info[3]);
              double price = Double.parseDouble(info[4]);                 
              arrVehicles[count] = new Vehicle(owner, regNum, make, year, price);
              count++;
            }
                
            sc.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error using the file");
        }
    }
    
    public int getCount()
    {
        return count;
    }
        
    public Vehicle [] getVehiclesArr()
    {
        return arrVehicles;
    }
    
    public void writeToFile(String fileName) {
        try {
            PrintWriter fileWrite = new PrintWriter(new FileWriter(fileName));
            for (int k = 0; k < count; k++) {
                fileWrite.println(arrVehicles[k].getOwner() + "@" + arrVehicles[k].getPrice());
            }
            fileWrite.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating the file");
        }
   
    }
    
    public void writeObjects(String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (int k = 0; k < count; k++) {
                objectOutputStream.writeObject(arrVehicles[k]);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing objects to file: " + e.getMessage());
        }
    }
    














}
