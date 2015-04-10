package edu.calstatela.cs202.tran.lab13;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GuiApp extends JFrame {

	private static final long serialVersionUID = -2962525985768164209L;
	private JPanel leftPanel = null;
	private JPanel rightPanel = null;
	private CanvasWidget canvas = null;
	
	private GamePlay gamePlay = new GamePlay();
	
	public GuiApp() {
		super("Gui App is my name");  // call parent's constructor
		
		GridLayout applicationLayout = new GridLayout(1,2);
	    setLayout(applicationLayout);

	    rightPanel = new JPanel();
	    leftPanel = new JPanel();
	    canvas = new CanvasWidget(300,300);

	    // left panel
	    leftPanel.setLayout( new GridLayout(1,1) );
	    leftPanel.add(canvas);

	    // right panel
	    rightPanel.setLayout( new FlowLayout() );
	    SliderController sl = new SliderController(gamePlay, canvas);
	    rightPanel.add (sl);
	    
	    add(leftPanel);
	    add(rightPanel);
	}

	void Run() {
	    this.setSize(800, 400);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		GuiApp app = new GuiApp();
		app.Run();
	}
}
