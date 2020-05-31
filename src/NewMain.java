import javax.swing.SwingUtilities;

public class NewMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                   
        new Tic_Tac_ToeGUI();
            }
    });
    }  
}
