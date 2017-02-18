import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Image;
import java.awt.event.AcionListener;

public class MainGui{

  JFrame frame;
  JPanel holderPanel;
  OpenPanel openPanel;
  final int WIDTH = 1080, HEIGHT = WIDTH*9/12;

  public MainGui(){
    holderPanel = new JPanel();
    holderPanel.setSize(WIDTH, HEIGHT);
    openPanel = new OpenPanel(this);
  }
  public void switchPage(String panelName){

  }
}
