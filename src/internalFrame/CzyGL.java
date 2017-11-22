package internalFrame;

import java.awt.EventQueue;

import internalFrame.czyGl.ShanChuCaoZuoYuan;
import internalFrame.czyGl.TJCzy;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class CzyGL extends JInternalFrame {
	public CzyGL() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 491, 287);
		setTitle("����Ա����");
		JTabbedPane tabPane = new JTabbedPane();
		final TJCzy tjPanel = new TJCzy();
		final ShanChuCaoZuoYuan delPanel = new ShanChuCaoZuoYuan();
		tabPane.addTab("��Ӳ���Ա", null, tjPanel, "��Ӳ���Ա");
		tabPane.addTab("ɾ������Ա", null, delPanel, "ɾ������Ա");
		getContentPane().add(tabPane);
		tabPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				delPanel.initTable();
			}
		});
		pack();
		setVisible(true);
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
			         public void run()
			         {
			        	 JFrame frame = new JFrame();
			     		 frame.setBounds(100, 100, 800, 600); 
			     		 desktopPane = new JDesktopPane();
			    		 frame.getContentPane().add(desktopPane);
			    		 JInternalFrame internalFrame = new CzyGL();
			    		 desktopPane.add(internalFrame);
			    		 internalFrame.setVisible(true);
			        	 frame.setVisible(true);
			         }
		             JDesktopPane desktopPane;
				});
	}
}
