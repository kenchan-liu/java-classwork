package v1;

	public class cdbook {
		cd[] cds=new cd[1000];
		void add(int i,int num,double p,String n){
			if(cds[i]==null){
				cds[i]=new cd(i,n,num,p);
			}
			else{
				cds[i].setRemain(cds[i].getRemain()+num);
			}
		}
		void remove(int i,int n,double price){
			if(cds[i].getRemain()>n){
				cds[i].setRemain(cds[i].getRemain()-n);
			}
			else{
				cds[i]=null;
			}
		}
		cd find(int i){
			return cds[i];
		}
		public String toString(){
			int count=0;
			for(int i=0;i<1000;i++){
				if(cds[i]!=null)
					count++;
			}
			return "categories"+count;
		}
		void list(){
			for(int i=0;i<1000;i++){
				if(cds[i]!=null){
					System.out.println("id:"+cds[i].getId()+" name:"+cds[i].getName()+" remains:"+cds[i].getRemain());
				}
			}
		}
	}
