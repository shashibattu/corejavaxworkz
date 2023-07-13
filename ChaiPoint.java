class ChaiPoint{
	static String chai[]={null,null,null,null};
	static int j=0;
	
	public static void main(String args[]){
		enter(hello);
		enter(hai);
		enter();
		enter();
		enter(tea);
		enter(cofee);
		enter(biscuite);
		chaiMethod(chai);
		
		
	}
	
	
	
	public static void chaiMethod(String hello[]){
		int i;
		
		for(i=0;i<hello.length;i++){
			
			String s=hello[i];
			System.out.println(s);
		}
	public static void enter(String word){
		
		if(chai[j]!=null){
			chai[j]=word;
			j++;
		}
	}
	}
}