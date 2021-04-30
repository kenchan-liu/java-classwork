package v1;

import java.util.Scanner;
public class view {
	public static view instance=new view();
	view(){};
	public static view getinstance(){return instance;}
	public void input(){
		System.out.println("continue");
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		int color=in.nextInt();
		controller.getinstance().report(row, col, color);
	}
	void repaint(){
		model m=model.getinstance();
		for(int row=0;row<model.width;row++){
			for(int col=0;col<model.width;col++){
				int color=m.getchess(row,col);
				if(color==model.space){
					System.out.print("+");
				}
				if(color==model.b){
					System.out.print(".");
				}
				if(color==model.w){
					System.out.print("o");
				}
			}
			System.out.println();
		}
	}
}
