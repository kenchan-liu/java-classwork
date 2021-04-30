package v1;
public class controller {
	controller(){};
	private static controller instance;
	public static controller getinstance(){
		if(instance==null){
			instance=new controller();
		}
		return instance;
	}
	public void report(int row,int col,int color){
		model m=model.getinstance();
		boolean success=m.putchess(row,col,color);
		if(success){
			view.getinstance().repaint();
			int winner=m.whowin();
	
			if(winner==model.b){
				System.out.println("black win");
			}
			else if(winner==model.w){
				System.out.println("white win");
			}
		}
	}
	public static void main(String []args){
		controller.getinstance().begin();
	}
	private void begin(){
		System.out.println("begin");
		while(true){
			view.getinstance().input();
		}
	}
}
