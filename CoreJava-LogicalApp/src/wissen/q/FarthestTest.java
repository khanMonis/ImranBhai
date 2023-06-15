package wissen.q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FarthestTest {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int N = Integer.parseInt(br.readLine().trim());
	        int[] A = new int[N];
	        String[] inp = br.readLine().split(" ");
	        for(int i=0;i<N;i++)
	        {
	            A[i] = Integer.parseInt(inp[i]);
	        }
	        int out_ = solve(N, A);
	        System.out.println(out_);

	         wr.close();
	         br.close();
	    }
	    static int solve(int N,int[] A){
	        // Your code goes here
	         int max=0,min=0;
	         for(int i=0;i<N;i++){

	             if(A[i]>0 && A[i]>max){
	                 max=A[i];
	             }else if(A[i]<0 && A[i]<min){
	                 min=A[i];
	             }

	             
	         }

	         if(max>Math.abs(min)){
	             return max;
	         }else{
	           return max;
	         }


	    }
}
