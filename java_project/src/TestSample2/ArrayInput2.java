package TestSample2;

import java.util.*;

//3. 배열을 아래와 같이 선언하고, 조건에 맞게 5개의 숫자를 입력받아서 배열에 순차적으로 넣으시오.
//조건 1) 입력받은 숫자는 1부터 10사이의 값이어야 하며, 이외의 숫자를 입력할 경우 재입력하도록 한다.
//조건 2) 기존에 입력된 숫자와 중복되어서는 안되며 중복된 숫자를 입력할 경우 재입력하도록 한다.

public class ArrayInput2 {
	    public static void main(String[] args) {
	        int arr[] = new int[5];
	        Scanner s = new Scanner(System.in);
	        	for(int i = 0; i<5; i++) {
	        		System.out.println((i+1)+" 번째 숫자를 입력하세요:");
	        		int num = s.nextInt();
	        		if(num >= 1 || num <= 10) {
	        			arr[i] = num;   
	        		} else {
	        			System.out.println("1부터 10사이의 숫자를 입력하세요:");
	        			i--;
	        		}
	        		
	        		
	        		}
	        	
	        
	       
	        	
	        	
	        	
	    }
	}


