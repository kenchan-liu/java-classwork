package cc;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WestPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int remTime1 = 1000;
	public int tempTime1 = 1000;
	public int tempTime2 = 1000;
	public int remTime2 = 1000;
	private Timer timer1;
	private Timer timer2;
	ImageIcon imageIcon = new ImageIcon("img.jpg");
	Image img = imageIcon.getImage();
	Image newimg = img.getScaledInstance(110,110,java.awt.Image.SCALE_SMOOTH); 
	ImageIcon icon = new ImageIcon(newimg); 
	private static JTextField countdown1 = new JTextField("remain");
	private JTextField countdown2 = new JTextField("remain");
	private JButton single = new JButton("single mode");
	private JButton music = new JButton(icon);
	public void time1() {
	   timer1 = new Timer();
	   timer1.schedule(new TimerTask() {
		   public void run() {
			   remTime1--;
			   countdown1.setText("remain "+remTime1+" sec");
		   	}
	   }, 0, 1000);
   }
	
	public void pause1() {
		timer1.cancel();
	}
	public void pause2() {
		tempTime2 = remTime2;
		timer2.cancel();
	}
	public void time2() {
		   timer2 = new Timer();
		   remTime2 = tempTime2;
		   timer2.schedule(new TimerTask() {
			   public void run() {
				   remTime2--;
		           countdown2.setText("remain "+remTime2+" sec");
		           }
	        }, 0, 1000);
	   }
	public WestPanel(){
		this.setLayout(new GridLayout(4,1));
		add(getsingle());
		add(getMusic());
		add(countdown1);
		add(countdown2);
	}
	private JButton getMusic() {
		// TODO Auto-generated method stub
		music.addActionListener(new ActionListener(){;
		public void actionPerformed(ActionEvent e){
			Var.v.Music();
		}
		});
		return music;
	}

	private JButton getsingle() {
		// TODO Auto-generated method stub
		single.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Var.c.single=true;
			}
			
		});
		return single;
	}
}
