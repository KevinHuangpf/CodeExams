import java.util.*;


public class Main2 {
 
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        scanner.close();
        System.out.println(XY(n,k));	
        
    }    
    private static  int XY(int n, int k){
		int count=0;
    	for(int y=1;y<=n;y++){
    		for(int i=1,m=k;y*i+m<=n;i++){
    			count++;
    			while(y*i+(++m)<=n)
    			{
    				count++;
    			}
    	}
    	}  	
    	return ++count;
    	
    }

}
