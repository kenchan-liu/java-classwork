package v0_1;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
import static net.mindview.util.SwingConsole.*;
public class BLayout extends JFrame{
	public BLayout(){
		JPanel jp1=new JPanel();
		jp1.setSize(400,400);
		jp1.setLayout(new GridLayout(6,4));
		jp1.add(new JButton("%"));
		jp1.add(new JButton("CE"));
		jp1.add(new JButton("C"));
		jp1.add(new JButton("delete"));
		jp1.add(new JButton("1/x"));
		jp1.add(new JButton("^2"));
		jp1.add(new JButton("^1/2"));
		jp1.add(new JButton("/"));
		jp1.add(new JButton("7"));
		jp1.add(new JButton("8"));
		jp1.add(new JButton("9"));
		jp1.add(new JButton("*"));
		jp1.add(new JButton("4"));
		jp1.add(new JButton("5"));
		jp1.add(new JButton("6"));
		jp1.add(new JButton("-"));
		jp1.add(new JButton("1"));
		jp1.add(new JButton("2"));
		jp1.add(new JButton("3"));
		jp1.add(new JButton("+"));
		jp1.add(new JButton("+/-"));
		jp1.add(new JButton("0"));
		jp1.add(new JButton("."));
		jp1.add(new JButton("="));
		add(BorderLayout.NORTH,new JTextArea(5,20));
		add(BorderLayout.CENTER,jp1);
	}
	public static void main(String[]args){
		run(new BLayout(),600,400);
	}
}
