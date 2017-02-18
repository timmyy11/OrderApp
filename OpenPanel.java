import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Box;
import java.awt.event.ActionListener;

public class OpenPanel extends JPanel{

  Box box = Box.createVerticleBox();
  JButton[] menueButtons;

  public OpenPanel(MainGui mg){

  }

  public void switchPage(String plabel){

  }

  public class MainMenuListener implements ActionListener{
    public void actionPerfromed(actionEvent e){
      if(e.getSource().getText().equalsIgnoreCase("order"){
        switchPage("orderPanel");
      }
    }
  }
}
