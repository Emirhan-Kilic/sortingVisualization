
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;

public class mainFrame {


	public mainFrame() {
		FlatMacDarkLaf.setup();

		JFrame mainFrameOfApp = new JFrame("Sorting GUI");
		mainFrameOfApp.setSize(1240, 768);
		mainFrameOfApp.setLocationRelativeTo(null);
		mainFrameOfApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrameOfApp.getContentPane().add(new mainPage().getMainMenuJpanel());
		mainFrameOfApp.setVisible(true);
	}
}
