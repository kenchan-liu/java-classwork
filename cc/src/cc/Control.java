package cc;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Control {
	public int winner;
	int localColor = Model.BLACK;
	int otherColor = Model.WHITE;
	boolean single = false;
	boolean openDoor = true;
	public void setLocalColor(int color){
		localColor = color;
		otherColor = -color;
	}
	public void netPressChess(int row, int col) {
		boolean success = Var.m.putChess(row, col, otherColor);
		if (success) {
			openDoor = true;
			Var.v.repaint();
			Var.wp.time2();
			if(Var.wp.remTime1 != 1000)
				Var.wp.pause1();
			winner = Var.m.whoWin();
			if (winner == Model.BLACK) {
				JOptionPane.showMessageDialog(null, "ºÚÆåÓ®");
				Var.m.clear();
				Var.v.removeAll();
				Var.v.repaint();
			} else if (winner == Model.WHITE) {
				JOptionPane.showMessageDialog(null, "°×ÆåÓ®");
				Var.m.clear();
				Var.v.removeAll();
				Var.v.repaint();
			}
			
		}
	}
	public void netChat(String s){
		Var.np.setChatText(s);
	}
	public void userPressChess(int row, int col) {
		if (!openDoor) {
			return;
		}
		if (single) {
			boolean success = Var.m.putChess(row, col, localColor);
			if (success) {
				localColor = -localColor;
				Var.v.repaint();
				if(localColor==-1){
					if(Var.wp.remTime1==1000){
						Var.wp.time1();
						if(Var.wp.remTime2 != 1000){
							Var.wp.pause2();
						}
					}
					else{
						Var.wp.time1();
						Var.wp.pause2();
					}
				}
				else{
					if(Var.wp.remTime2==1000){
						Var.wp.time2();
						if(Var.wp.remTime1 != 1000)
							Var.wp.pause1();
					}
					else{
						Var.wp.time2();
						Var.wp.pause1();
					}
				}
				int winner = Var.m.whoWin();
				if (winner == Model.BLACK) {
					JOptionPane.showMessageDialog(null, "ºÚÆåÓ®");

					Var.m.clear();
					Var.v.removeAll();
					Var.v.repaint();
				} else if (winner == Model.WHITE) {
					JOptionPane.showMessageDialog(null, "°×ÆåÓ®");
					Var.m.clear();
					Var.v.removeAll();
					Var.v.repaint();
				}
			}
		} else {
			boolean success = Var.m.putChess(row, col, localColor);
			if (success) {
				openDoor = false;
				Var.v.repaint();
				Var.wp.time1();
				if(Var.wp.remTime2 != 1000)
					Var.wp.pause2();
				int winner = Var.m.whoWin();
				if (winner == Model.BLACK) {
					JOptionPane.showMessageDialog(null, "ºÚÆåÓ®");
					Var.m.clear();
					Var.v.removeAll();
					Var.v.repaint();
					
				} else if (winner == Model.WHITE) {
					JOptionPane.showMessageDialog(null, "°×ÆåÓ®");
					Var.m.clear();
					Var.v.removeAll();
					Var.v.repaint();
				}
				Var.n.sendChess(row, col);
				if(Var.wp.remTime1 <= 0){
					JOptionPane.showMessageDialog(null,"ÄãÊ±¼äÃ»À²£¡");
					Var.m.clear();
					Var.v.removeAll();
					Var.v.repaint();
				}
			}
		}
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Îå×ÓÆå");
		f.getContentPane().add(Var.np,BorderLayout.NORTH);
		f.getContentPane().add(Var.v, BorderLayout.CENTER);
		f.getContentPane().add(Var.wp,BorderLayout.WEST);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
		f.setVisible(true);
	}
}
