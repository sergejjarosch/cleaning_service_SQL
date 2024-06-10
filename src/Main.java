import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setCustomer();
    }

    /*ToDo
    - Service definieren und preise setzen.
    - Berechnung zum Quadratmeter und Stockwerke setzen
    -# Standard UI Kalender finden.
    -# Standard UI Input
    - Anfrage mit den Daten zwischenspeichern.
    - Wenn das Datum verfügbar ist wird die Anfrage in der Buchung gespeichert
    - Datum wählen. wenn nicht verfügbar meldung!

     */
    public static void setCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kundenname: ");
        String name = scanner.nextLine();

        System.out.println("E-Mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefon: ");
        String phone = scanner.nextLine();

        System.out.println("Adresse: ");
        String address = scanner.nextLine();

        QueryDB.setCustomer(name, email, phone, address);
        QueryDB.getLastInsertCustomer();//Ausgabe der gespeicherten Daten
    }

}
