import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;


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
	private JButton shuffleDataButton;
	private static int[] inputData;
	private int currentAlg;
	private Timer timer;
	private int[] backupData;

	private final algorithm algObj;


	public mainPage() {
		algObj = new algorithm();

		centerMenuJpanel.setLayout(new BoxLayout(centerMenuJpanel, BoxLayout.Y_AXIS));
		currentAlg = 1;
		inputData = fillTheArray();
		backupData = inputData.clone();

		int delay = 100;
		ActionListener animate = e -> oneStep();
		timer = new Timer(delay, animate);

		bubbleSortRadioButton.addActionListener(e -> {
			reloadTheAnimation();
			currentAlg = 1;
		});
		selectionSortRadioButton.addActionListener(e -> {
			reloadTheAnimation();
			currentAlg = 2;
		});
		insertionSortRadioButton.addActionListener(e -> {
			reloadTheAnimation();
			currentAlg = 3;
		});



		BarGraph barGraph = new BarGraph(inputData);
		centerMenuJpanel.add(barGraph);

		shuffleDataButton.addActionListener(e -> {

			try {
				timer.stop();
			} catch (Exception ignored) {
			} finally {
				inputData = fillTheArray();
				backupData = inputData.clone();
				displayBars();
			}

		});


		playButton.addActionListener(e -> startAnimation());
		stopButton.addActionListener(e -> stopTheAnimation());
		restartButton.addActionListener(e -> reloadTheAnimation());
	}


	public void oneStep() {

		//1-Bubble Sort
		//2-Selection Sort
		//3-Insertion Sort
		//4-Merge Sort
		//5-Quick Sort

		if (currentAlg == 1) {
			algObj.bubbleSort(inputData);
		} else if (currentAlg == 2) {
			algObj.selectionSort(inputData);
		} else if (currentAlg == 3) {
			algObj.insertionSort(inputData);
		}

		displayBars();
	}

	public void startAnimation() {

		try {
			if (!timer.isRunning()) {
				
				timer.start();
			}
		} catch (Exception ignore) {

		}

	}


	public void displayBars() {
		BarGraph test = new BarGraph(inputData);
		centerMenuJpanel.removeAll();
		centerMenuJpanel.add(test);
		centerMenuJpanel.revalidate();
		centerMenuJpanel.repaint();

	}

	public void reloadTheAnimation() {
		try {
			timer.stop();
		} catch (Exception ignored) {
		} finally {
			inputData = backupData.clone();
			algObj.restartK();
			displayBars();
		}

	}


	public void stopTheAnimation() {
		try {
			timer.stop();
		} catch (Exception ignored) {
		}
	}

	public static int[] fillTheArray() {
		Random rand = new Random();
		int[] data = new int[100];
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(1, 101);
		}

		return data;
	}

	public JPanel getMainMenuJpanel() {
		return mainMenuJpanel;
	}
}
