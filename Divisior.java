class Divisior{
	public static void main(String[] args){
		int a=1;
		int n=12;
		while(a<=n/2){
			if(n%a==0){
				System.out.println(a);
			}
			a++;
		}
	}
}