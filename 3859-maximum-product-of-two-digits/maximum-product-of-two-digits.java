class Solution {
    public int maxProduct(int n) {
        int largest=0;
        int secondLargest=0;
        for(int i=n;i!=0;i=i/10)
        {
            int digit=i%10;
            
            if(digit>largest)
            {
                secondLargest=largest;
                largest=digit;
            }
            else if(largest>=digit && digit>=secondLargest)
            {
                secondLargest=digit;
            }

        }
        return largest*secondLargest;


        
    }
}