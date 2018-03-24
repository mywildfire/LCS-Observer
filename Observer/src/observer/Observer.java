package observer;

public class Observer {


    public static void main(String[] args) {
        SearchController searchCtrl = SearchController.getInstance();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
        
        
        
        
        
        //Displaying the list of people
        //once I figure out how to make lists in Java.
    }
    
}
