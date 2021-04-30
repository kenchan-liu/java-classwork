package cc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Net {
	public static final int PORT = 8972;
	private BufferedReader in;
	private PrintWriter out;
	private Socket s;
	public void startListen() {
		new Thread() {
			public void run() {
				try {
					@SuppressWarnings("resource")
					ServerSocket ss = new ServerSocket(PORT);
					s = ss.accept();
					in = new BufferedReader(new InputStreamReader(
							s.getInputStream()));
					out = new PrintWriter(s.getOutputStream(), true);
					startReadThread();
				} catch (Exception e) {
					e.printStackTrace();
				}
			};
		}.start();
		Var.c.setLocalColor(Model.BLACK);
	}
	private void startReadThread() {
		new Thread() {
			public void run() {
				while (true) {
					try {
						String line = in.readLine();
						parseLine(line);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	protected void parseLine(String line) {
		if (line.startsWith("PutChess:")) {
			parsePutChess(line);
		}else if(line.startsWith("Chat:")){
			parseChat(line);
		}
		else if(line.startsWith("f")){
			parseForfeit(line);
		}
	}
	private void parseForfeit(String line) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "ƒ„”Æ¡À");
		Var.m.clear();
		Var.v.removeAll();
		Var.v.repaint();
	}
	private void parseChat(String line) {
		// TODO Auto-generated method stub
		line = line.substring(5);
		String text=line;
		Var.c.netChat(text);
	}
	private void parsePutChess(String line) {
		line = line.substring(9);
		String[] param = line.split(",");
		int row = Integer.parseInt(param[0]);
		int col = Integer.parseInt(param[1]);
		Var.c.netPressChess(row, col);
	}
	public boolean connect(String ip) {
		try {
			Var.c.setLocalColor(Model.WHITE);
			s = new Socket(ip, PORT);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
			startReadThread();
			return true;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public void sendChat(String msg){
		out.println("Chat:"+msg);
	}
	public void sendChess(int row, int col) {
		out.println("PutChess:" + row + "," + col);
	}
	public void rematchRequest(){
		out.println("1");
	}
	public void forfeit() {
		// TODO Auto-generated method stub
		out.println("f");
	}
}
