
public class replaceStrings {

	public static void main(String[] args) {

		String url = "Mr John Smith    ";

		convertStringToCharArray(url);

	}

	public static char []  convertStringToCharArray ( String url) {
		
		char a = '%';
		char b = '2';
//		char c = '0';
		
		int numberOfSpaces = 0;
		
		@SuppressWarnings("unused")
		int lenghtString = url.length();
		//System.out.println(lenghtString);
		
		char[] content = url.toCharArray();

		for (int i = content.length-1; i >= 0; i--) {
			
			if (content[i] == ' ') {
				numberOfSpaces++;
		
			
				if(numberOfSpaces > 3) {
				
					if (content[i] == ' ' && content[i + 1] != ' ') {
						
						content[i]=a;
						content[i+2]= content[i+1];
					
						content[i+2]=b;
					
						
						numberOfSpaces =  numberOfSpaces -2;
				}
				
			}else {
				
				//System.out.println("sorry the number of spaces are not enough for being placen into the spaces");
			}
			//System.out.println(content[i]);
			 
			}	 
			 
			
}

System.out.println(content);
	

	return content;

}

}
