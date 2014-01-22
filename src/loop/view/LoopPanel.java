package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import loop.controller.LoopController;

/**
 * Panel for the Loop Project
 * @author zeas9357
 * @version 1.0 11/5/13 Basic framework, setupPanel, setupListeners methods.
 */
public class LoopPanel extends JPanel
{
	private SpringLayout baseLayout;
	private LoopController baseController;
	private JTextArea loopTextArea;
	private JButton submitButton;
	private JScrollPane textPane;
	
	/**
	 * Creates a LoopPanel object linked via controller for MVC paradigm.
	 * @param baseController The linked controller object.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10,20);
		textPane = new JScrollPane(loopTextArea);
		submitButton = new JButton("click here C',");
		
		setupLayout();
		setupListeners();
		setupPanel();
	}
	/**
	 * Adds all components to the panel, set color and component settings.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(120, 50, 60));
		this.add(submitButton);
		this.add(textPane);
		
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 69, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, loopTextArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, loopTextArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, loopTextArea, 174, SpringLayout.WEST, this);
		add(loopTextArea);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
					loopTextArea.append(baseController.getLoopResults());
			}
		});
	}
	
}
