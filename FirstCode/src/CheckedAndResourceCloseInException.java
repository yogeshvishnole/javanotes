import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CheckedAndResourceCloseInException {
	
      public static void main(String[] args) throws Exception {
    	    
//    	  BufferedReader br = null;
//    	  
//    	  int n;
//    	  
//    	  
//    	  try {
//    		  br = new BufferedReader(new InputStreamReader(System.in));
//    		  System.out.println("Enter a number : ");
//    		  n = Integer.parseInt(br.readLine());
//    		  System.out.println("The user entered number is : " + n);
//    		  
//    	  }catch(Exception e) {
//    		  System.out.println("Error" + e);
//    	  }finally {
//    		  // close the resources
//    		  br.close();
//    	  }
    	  
    	  // Try with resource
    	  int j = 0;
    	  
    	  try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
    		  j = Integer.parseInt(br.readLine());
    	  }
    	  
      }
}
