import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class Services {
    //eingabe services in ein ArrayList
    // ArrayList wird itteriert und damit die eweilige ID des Cervices eingeschrieben
    public static void serviceID(){
        try{
            //Eingabe der IDs
            System.out.println("Folgende Dienstleistungen werden angeboten:\n" +
                    "1 = Staub saugen\n" +
                    "2 = Boden wischen\n"+
                    "3 = Staub wischen\n"+
                    "durch komma getrennt bitte eingeben.");

            System.out.println("Folgender Service wurde gebucht:");

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Geben Sie bitte erneut ein");
            serviceID();
        }

    }
    public static void getServicesID(){
        try{
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] inputSplit = input.split(","); //Die zahle an den Kommas splitten
            ArrayList<Integer> numbers = new ArrayList<>();
            for (String serviceString : inputSplit ){
                numbers.add(Integer.parseInt(serviceString.trim()));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }



    /*ToDo
    - ArrayList mit # .size iterierend in sql übergeben
    Methode die nach länge der Array list jede mal einen statement sendet mit der
    service zahl und der jeweiligen kunden id
     */

    /*
    Methode- Service speichern
     */

}
