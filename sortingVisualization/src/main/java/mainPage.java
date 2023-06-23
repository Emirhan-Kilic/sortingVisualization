import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPage {
	private JPanel mainMenuJpanel;
	private JPanel leftMenuJpanel;
	private JPanel centerMenuJpanel;
	private JButton playButton;
	private JButton restartButton;
	private JButton stopButton;
	private JPanel algChooseJpael;
	private JRadioButton bubbleSortRadioButton;
	private JRadioButton selectionSortRadioButton;
	private JRadioButton insertionSortRadioButton;
	private JRadioButton mergeSortRadioButton;
	private JRadioButton quickSortRadioButton;
	private int[] inputData;
	private int currentAlg;
	//1-Bubble Sort
	//2-Selection Sort
	//3-Insertion Sort
	//4-Merge Sort
	//5-Quick Sort

	public mainPage() {

		currentAlg = 1;


		bubbleSortRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopTheAnimation();
				currentAlg = 1;
			}
		});
		selectionSortRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopTheAnimation();
				currentAlg = 2;
			}
		});
		insertionSortRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopTheAnimation();
				currentAlg = 3;
			}
		});
		mergeSortRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopTheAnimation();
				currentAlg = 4;
			}
		});
		quickSortRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopTheAnimation();
				currentAlg = 5;
			}
		});




		int[] data = {5, 10, 8, 3, 6}; // Replace with your own data


		centerMenuJpanel.setLayout(new BoxLayout(centerMenuJpanel, BoxLayout.Y_AXIS));
		BarGraph barGraph = new BarGraph(data);
		centerMenuJpanel.add(barGraph);
	}


	public static void displayBars() {

	}

	public static void reloadTheAnimation() {
		//todo
	}

	public static void startTheAnimation() {
		//todo
	}

	public static void stopTheAnimation() {
		//todo
	}

	public JPanel getMainMenuJpanel() {
		return mainMenuJpanel;
	}
}
