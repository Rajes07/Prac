package com.demo.lvl2;


public class CovertBites{
 
	public static void main(String[] args) {
	
		double size_bytes=1999901221;
		String cnt_size;
		
		double size_kb = size_bytes /1024;
		double size_mb = size_kb / 1024;
		double size_gb = size_mb / 1024 ;
 
		 if (size_gb > 0){
			    cnt_size = size_gb + " GB";
	        }else if(size_mb > 0){
			    cnt_size = size_mb + " MB";
	        }else{
	    	           cnt_size = size_kb + " KB";
	        }	     
		System.out.println("Converted Size: " + cnt_size);			
	}
}