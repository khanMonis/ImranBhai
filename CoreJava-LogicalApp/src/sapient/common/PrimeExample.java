package sapient.common;

public class PrimeExample {
	static void checkPrime(int n){
		
		  int i,flag=0;      
		  if(n==0||n==1){  
		   System.out.println(n+"0 and 1 check is not prime number");      
		  }
		  else{  
		   for(i=2;i<=n-1;i++){      
		    if(n%i==0){      
		     System.out.println(n+" prime check is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  } 
		  
		}  

	public static void main(String[] args) {
		checkPrime(11);  
	}
}
