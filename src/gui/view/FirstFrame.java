package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{
	private GUIController baseController;
	
	public FirstFrame(GUIController baseController)
	{
		super();
		this.baseController = baseController;
		
	}
}
