class CountOfDivisor{
	public static void main(String[] args){
		int n=15;
		int a=1;
		int count=0;
		while(a<=n/2){
			if(n%a==0){
				count++;
			}
			a++;
		}
		System.out.println(count);
	}
}