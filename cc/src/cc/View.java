package cc;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URI;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class View extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int sx=20,sy=20,unit=20;
	int gap = 30;
	File f;
	URI uri;
	URL url;
    private Image image = (Image) new ImageIcon("F:\\timg.jpg").getImage();  

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0,getSize().width,
			     getSize().height, this);
		drawPanel(g);
		drawChess(g);
		  
	}
	public View() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				int w = getWidth();
				int h = getHeight();
				int min = Math.min(w, h);
				unit = (min-gap*2)/(Model.WIDTH-1);
				sx = (w - unit*(Model.WIDTH-1))/2;
				sy = (h - unit*(Model.WIDTH-1))/2;
				repaint();
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				int row = (y-sy)/unit;
				if((y-sy)%unit>unit/2){
					row++;
				}
				int col = (x-sx)/unit;
				if((x-sx)%unit > unit/2){
					col++;
				}
				Var.c.userPressChess(row,col);
			}
		});
		
	}
	private void drawChess(Graphics g) {
		Color oldColor = g.getColor();
		for(int row=0;row<Model.WIDTH;row++){
			for(int col=0;col<Model.WIDTH;col++){
				int chess = Var.m.getChess(row, col);
				if(chess==Model.BLACK){
					g.setColor(Color.black);
					g.fillOval(sx+col*unit-unit/2, sy+row*unit-unit/2, unit, unit);
				}else if(chess==Model.WHITE){
					g.setColor(Color.white);
					g.fillOval(sx+col*unit-unit/2, sy+row*unit-unit/2, unit, unit);
				}
			}
		}
		g.setColor(oldColor);
	}
	private void drawPanel(Graphics g) {
		for(int i = 0 ; i< Model.WIDTH;i++){
			g.drawLine(sx, sy+unit*i, sx+(Model.WIDTH-1)*unit, sy+unit*i);
			g.drawLine(sx+unit*i, sy, sx+unit*i, sy+(Model.WIDTH-1)*unit);
		}
	}
	void Music(){               
		 try {      
		 f = new File("CDImage_01.wav"); //绝对路径
		                uri = f.toURI();
		                url = uri.toURL(); 
		                AudioClip aau; 
		                aau = Applet.newAudioClip(url);
		                aau.loop();  //单曲循环
		            } catch (Exception e) 
		           { 
		               e.printStackTrace();
		           } 
		         }
}
