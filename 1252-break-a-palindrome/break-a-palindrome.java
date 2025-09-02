class Solution {
    public String breakPalindrome(String palindrome) {
          if(palindrome.length()<=1)
          return "";

        char letters[]=palindrome.toCharArray();
        int i=0;
        boolean flag=false;
      while(i<letters.length/2)
      {
          if(letters[i]!='a'){

     

            letters[i]='a';
            flag=true;
              return new String(letters);
            
          }
          i++;
               
      }
      if(flag==false)
      letters[letters.length-1]='b';
         return new String(letters);


        
        
    }
}