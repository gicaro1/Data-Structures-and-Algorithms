package practice_JavaCode;

public class FindRepeated {
	
	
	public static void main(String[] args) {
		
		freqCount("cardenas");
	}
	
	public static void freqCount( String str) {
		
		str = str.replace(" ", "");
		while (str.length() > 0 ) {
			
			char ch = str.charAt(0);
			System.out.print(ch + " "+ countChar(str, ch));
			str = str.replace("" +  ch, "");// for each iteration we replace the first character with blank space
			
		}
		
		
		
		
		
		
	}
	
	public static int countChar( String str, char ch) {
        int   count = 0;
      while ( str.indexOf(ch) != -1) {// 1-  check if the particular characteris the within the given string 
    	  							  // 2-  all the characters have position posive form 0 to 10 for instance
            count++;				  // 3-  if  any element is found the indexOf method will return -1 
            
            // 1- index of retrieve the index of the current element or character 
            //2- substring reduce length of the string starting with the current element +1 plus one 
             str = str.substring((str.indexOf(ch)+1));
          }
      //System.out.println(count);
     return count ;
	}
}



