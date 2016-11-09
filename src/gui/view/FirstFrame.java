package gui.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{
	private GUIController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(GUIController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new FirstPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Boring App");
		this.setSize(new Dimension(600, 400));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
