import javax.swing.*;
import java.awt.*;

public class MainMenu {
	JFrame screen;
	public MainMenu(JFrame window) {
		screen = window;
		JLabel title = new JLabel("game title");
		title.setOpaque(true);
		title.setSize(100,200);
		title.setBackground(new Color(101,222,0));
		screen.add(title);
	}
}
