public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();
   
        System.out.println("\nServices turning ON:");
        homeInterface.turnOnAll();
 
        System.out.println("\nServices turning OFF:");
        homeInterface.turnOffAll();
    }
}