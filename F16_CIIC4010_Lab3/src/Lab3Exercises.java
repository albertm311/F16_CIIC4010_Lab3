import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setTitle("Puerto Rico Flag");
		myFrame.setLocation(550, 250);
		myFrame.setSize(300, 200);

		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);

		myFrame.setVisible(true);
	}
}