import javax.swing.*;

public class Display {
	JFrame window;
	public Display() {
		final short width = 1920;
		final short height = 1080;
		window = new JFrame("game");
		window.setSize(width,height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setUndecorated(true);
		window.setVisible(true);
	}
	public void openMainMenu() {
		new MainMenu(window);
	}
}