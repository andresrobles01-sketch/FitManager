package co.edu.uptc.presenter;

import co.edu.uptc.view.MainFrame;


public class Presenter{
    private MainFrame mainFrame;
    
    public Presenter() {
        mainFrame = new MainFrame(this);
    }
    
    public void init() {
        mainFrame.setVisible(true);
    }
    
}
