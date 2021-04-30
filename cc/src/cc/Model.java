package cc;
public class Model {
	public static final int WIDTH = 19;
	public static final int BLACK = 1;
	public static final int WHITE = -1;
	public static final int SPACE  = 0;
	private int[][] data = new int[WIDTH][WIDTH];
	private int lastRow;
	private int lastCol;
	public int getChess(int row,int col){
		if(row>=0&&row<WIDTH&&col>=0&&col<WIDTH){
			return data[row][col];
		}
		return SPACE;
	}
	public void clear(){
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				data[i][j]=0;
			}
		}
		Var.wp.remTime1 = Var.wp.remTime2 =1000;
		Var.wp.pause1();
		Var.wp.pause2();
		
	}
	public int whoWin(){
		int i=1;int q=1;
		while(data[lastRow][lastCol]==data[lastRow+q][lastCol]&&(lastRow+q)<WIDTH){
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
		while((lastCol+q)<WIDTH&&data[lastRow][lastCol]==data[lastRow][lastCol+q]){
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
		while((lastCol+q)<WIDTH&&data[lastRow][lastCol]==data[lastRow+q][lastCol+q]&&(lastRow+q)<WIDTH){
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
		while(lastCol-q>=0&&data[lastRow][lastCol]==data[lastRow+q][lastCol-q]&&(lastRow+q)<WIDTH){
			i++;
			q++;
		}
		q=1;
		while(lastCol+q<WIDTH&&(lastRow-q)>=0&&data[lastRow][lastCol]==data[lastRow-q][lastCol+q]){
			i++;q++;
		}
		q=1;
		if(i>=5)
			return data[lastRow][lastCol];
		return SPACE;
	}
	public boolean putChess(int row,int col,int color){
		if(row>=0&&row<WIDTH&&col>=0&&col<WIDTH){
			if(data[row][col]==SPACE){
				data[row][col] = color;
				setLastRow(row);
				setLastCol(col);
				return true;
			}
		}
		return false;
	}
	public int getLastCol() {
		return lastCol;
	}
	public void setLastCol(int lastCol) {
		this.lastCol = lastCol;
	}
	public int getLastRow() {
		return lastRow;
	}
	public void setLastRow(int lastRow) {
		this.lastRow = lastRow;
	}
}
