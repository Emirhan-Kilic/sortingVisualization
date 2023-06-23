import javax.swing.*;
import java.awt.*;

public class BarGraph extends JPanel {

	private final int[] data;

	public BarGraph(int[] data) {
		this.data = data;
		this.setBackground(new Color(41,41,41));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		int width = getWidth();
		int height = getHeight();
		int barCount = data.length;
		int margin = 20;

		int barWidth = (width - 2 * margin) / barCount;

		int maxValue = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > maxValue) {
				maxValue = value;
			}
		}

		double scale = (double) (height - 2 * margin) / maxValue;

		g2d.setColor(new Color(61,238,235));
		for (int i = 0; i < barCount; i++) {
			int barHeight = (int) (data[i] * scale);
			int x = margin + i * barWidth;
			int y = height - margin - barHeight;
			g2d.fillRect(x, y, barWidth, barHeight);
		}
	}
}
