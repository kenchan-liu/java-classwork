package cc;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NorthPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton forfeit = new JButton("投降");
	private JTextField ipTF = new JTextField(20);
	private JTextField chatRequest = new JTextField(20);
	private JButton send = new JButton("send");
	private JButton listenBtn = new JButton("开始监听");
	private JButton connectBtn = new JButton("连接");
	public NorthPanel() {
		ipTF.setText("localhost");
		setLayout(new FlowLayout(FlowLayout.CENTER,5,1));
		add(forfeit);
		add(listenBtn);
		add(ipTF);
		add(connectBtn);
		initBtn();
		add(send);
		add(chatRequest);
	}
	public void setChatText(String s){
		chatRequest.setText(s);
	}
	private String getChatText(){
		return chatRequest.getText();
	}
	private void initBtn() {
		listenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Var.n.startListen();
				listenBtn.setEnabled(false);
			}
		});
		connectBtn.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				Var.n.connect(ipTF.getText());
			}
		});
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Var.n.sendChat(getChatText());
			}
		});
		forfeit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Var.n.forfeit();
				JOptionPane.showMessageDialog(null, "你输了");
				Var.m.clear();
				Var.v.removeAll();
				Var.v.repaint();
			}
			
		});
	}
}
