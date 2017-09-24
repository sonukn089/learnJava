class Hundred{
	
	public static void main(String[] args) {
    
    	for(int i = 1; i <=10; i++) {
    		for(int j = 1; j <= 10; j++) {
    			if(i == 10) {
    				System.out.print((j)+""+0+"\t");
    			}
    			else {
    				String a = "";
    				if(!(j-1 == 0)){
    					a = j-1+"";
    				}
    				System.out.print(a+i+"\t");
    			}
    		}
    		System.out.println("");
    	}

	}

}