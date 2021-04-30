package p;
import java.io.File;
public class GetAll {
    static int count=0;
    static long size=0;
    static int directory=0;
	public static void main(String[] args) {
        File file=new File("F:\\computer_design_experiment");
        traverse(file);System.out.println("all files "+count+" size "+size+" directories "+directory);
    }
    public static void  traverse(File file){
        File []files=file.listFiles();
        if (files==null){
            return;
        }
        for (File file1:files){
                if (file1.isFile()){
                    System.out.println(file1.getPath());count++;size=size+file1.length();
                }
                else{
                     traverse(file1);
                     directory++;
                }
        }
    }
}
