
/**
 * testVehicle test displays the data from binary and text.
 * 
 * @author (KM MAFORA 43031072) 
 * @version (15 April 2024)
 */
import java.util.Scanner;


import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import javax.swing.JOptionPane;


public class testVehicle {
    public static void main(String[] args) throws Exception {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);

        FileClass file = new FileClass();

        file.readFromFile("VehicleData.txt");

        Vehicle[] arrVehicles = file.getVehiclesArr();
        int count = file.getCount();

        displayList(arrVehicles, count);
        file.writeToFile("NewData.txt");
        
        file.writeObjects("vehicles.ser"); 
        readObjects("vehicles.ser");
    }

    public static void displayList(Vehicle[] arrVehicles, int count) {
        System.out.printf("%-20s%-17s%-20s%-10s%-10s\n", "Owner", "Reg Number", "Make", "Year", "Price(R.c)");

        for (int k = 0; k < count; k++) {
            System.out.println((k + 1) + "." + arrVehicles[k].toString());
        }
    }
    public static void readObjects(String fileName) {
      try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
          System.out.println("Vehicle objects from binary file:");
          Object obj;
          while (true) {
              try {
                  obj = objectInputStream.readObject();
                  if (obj instanceof Vehicle) {
                      System.out.println(obj.toString());
                  }
              } catch (EOFException e) {
                  // End of file reached
                  break;
              }
          }
      } catch (IOException | ClassNotFoundException e) {
          JOptionPane.showMessageDialog(null, "Error reading objects from file: " + e.getMessage());
      }
  }
  
   
    }

