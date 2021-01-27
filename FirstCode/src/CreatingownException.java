




public class CreatingownException {
	
	public static void main(String[] args) {
		
		int i,j;
		
		i = 10;
		j = 20;
		  
		try {
			
			int k = 0;
			
//			k = i/j;
			
			
			
			if(k == 0 ) {
				throw new YogeshException("this is mistake");
			}
			
			
			
			
		}catch(YogeshException e) {
			System.out.println( e.getMessage());
		}
		
		
		
	}

}
