package v1;
import java.util.*;
public class model {
	private static model instance=new model();
	private model(){};
	static model getinstance(){return instance;}
	public static final int width=19;
	public static final int b=1;
	public static final int w=-1;
	public static final int space=0;
	private int lastRow=1;
	private int lastCol=1;
	private int[][]data=new int [width][width];
	
	public int getchess(int i,int j){
		return data[i][j];
	}
	public boolean putchess(int row,int col,int color){
		if(row>=0&&row<width&&col>=0&&col<width&&data[row][col]==space){
			data[row][col]=color;
			lastRow=row;
			lastCol=col;
			return true;
		}
		return false;
	}
	public int whowin(){
		int i=1;int q=1;
		while(data[lastRow][lastCol]==data[lastRow+q][lastCol]&&(lastRow+q)<width){
			i++;
			q++;
		}
		q=1;
		while((lastRow-q)>=0&&data[lastRow][lastCol]==data[lastRow-q][lastCol]){
			i++;q++;
		}
		q=1;
		if(i>=5)
			return data[lastRow][lastCol];
		i=1;
		while(data[lastRow][lastCol]==data[lastRow][lastCol+q]&&(lastCol+q)<width){
			i++;
			q++;
		}
		q=1;
		while((lastCol-q)>=0&&data[lastRow][lastCol]==data[lastRow][lastCol-q]){
			i++;q++;
		}
		q=1;
		if(i>=5)
			return data[lastRow][lastCol];
		i=1;
		while(data[lastRow][lastCol]==data[lastRow+q][lastCol+q]&&(lastRow+q)<width&&(lastCol+q)<width){
			i++;
			q++;
		}
		q=1;
		while((lastRow-q)>=0&&lastCol-q>=0&&data[lastRow][lastCol]==data[lastRow-q][lastCol-q]){
			i++;q++;
		}
		q=1;
		if(i>=5)
			return data[lastRow][lastCol];
		i=1;
		while(lastCol-q>=0&&data[lastRow][lastCol]==data[lastRow+q][lastCol-q]&&(lastRow+q)<width){
			i++;
			q++;
		}
		q=1;
		while((lastRow-q)>=0&&data[lastRow][lastCol]==data[lastRow-q][lastCol+q]&&lastCol+q<width){
			i++;q++;
		}
		q=1;
		if(i>=5)
			return data[lastRow][lastCol];
		return 0;
	}
}
