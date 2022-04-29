package problemstatement5_3;

public class StringRotation {
	public static void printRotatedString(String str)
    {
        int len = str.length();
      
       
        StringBuffer s;
         
        for (int i = 0; i < len; i++)
        {
            s= new StringBuffer();
             
            int j = i;  
            int k = 0;  
      
            
            for (int x = j; x < str.length(); x++) {
                s.insert(k, str.charAt(j));
                k++;
                j++;
            }
      
       
            j = 0;
            while (j < i)
            {
                s.insert(k, str.charAt(j));
                j++;
                k++;
            }
      
            System.out.println(s);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str = new String("strings");
        printRotatedString(str);

	}

}
