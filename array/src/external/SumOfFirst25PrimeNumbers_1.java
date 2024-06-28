package external;

public class SumOfFirst25PrimeNumbers_1 {

	public static void main(String[] args) {

		   int count =0;
		   int sum =0;
		   for(int i=2; i<=200;i++){
		     int currentCount=0;
		     for(int j=1;j<=i;j++){
		       if(i%j==0){
		         currentCount=currentCount+1;
		       }
		       if(currentCount>2){
		         break;
		       }
		     }
		     if(currentCount==2){
		       sum =sum+i;
		       count =count+1;
		       System.out.println(i);
		     }
		     if(count==25){
		       break;
		     }
		   }
		   System.out.println(sum);


	}

}


