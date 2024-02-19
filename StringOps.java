public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest( "Hello World"));
        System.out.println(capVowelsLowRest("One two tHRee world"));
        System.out.println(camelCase("Hello World"));
        System.out.println(camelCase("  tWo wordS"));
        
    }

    public static String capVowelsLowRest (String string) {
        String ans= "";
        for ( int i = 0; i < string.length(); i++){
            char cur = string.charAt(i);
            if(isUppercase(cur)){
                if(isVowel(cur)){
                    ans = ans + cur;}
                else {
                    cur = (char)(cur + 32);
                   ans = ans + cur;
                }
            }
            else if (isLowerCase(cur)) {
                if(isVowel(cur)){
                    cur = (char)(cur - 32);
                    ans = ans + cur;
                }
                else{
                    ans = ans + cur;}
            }
           else if( !isLowerCase(cur) && !isLowerCase(cur)){
                ans = ans + cur;
           }
           }
              return ans;  
            }
       
        
       
       
  

    public static String camelCase (String string) {
       int i = 0;
       String ans ="";
       boolean prevSpace = false;
        while (string.charAt(i) == 32){
            i++;
        }
        char c = string.charAt(i);
        if(isUppercase(c))
            c = (char)(c + 32);
        ans = ans + c;
        i++;
        while( i < string.length()){
           c = string.charAt(i);
           if(prevSpace){
            if(isLowerCase(c)){
                c = (char)(c - 32);
                ans = ans + c;
                prevSpace = false;
            }
            else{
                ans = ans + c;
                prevSpace = false;
            }   
           } else {
            if(isUppercase(c)){
                c = (char)(c + 32);
                ans = ans + c;
                prevSpace = false;
            }
            else{
                ans = ans + c;
                prevSpace = false;
            }   
           }
            if(string.charAt(i) == 32)
                prevSpace = true;
            i++;
            
        }
        return ans;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0; 
        int t = 0;
        for ( int i =0; i < string.length(); i++){
            if( string.charAt(i) == chr)
                count++;
        }
        int [] ans = new int [count];
        for (int j = 0; j < string.length(); j++){
            if ( string.charAt(j) == chr) {
                ans[t] = j;
                t++;
            }
        }

        return  ans;
    }

    public static boolean isUppercase (char c){
        return ( c >= 65 && c <= 90);
    }

    public static boolean isLowerCase (char c){
        return ( c >= 97 && c <= 122);
    }

    public static boolean isVowel (char c){
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'o':
            case 'O':
            case 'i':
            case 'I':
            case 'u':
            case 'U':
                return true;
            default:
                return false;

        }
    }

}
