class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=0,len=s.length();
        for(int i=0;i<len;i++)
        {
            int num=0;
            if(Character.isDigit(s.charAt(i)))
            {
                while(i<len && Character.isDigit(s.charAt(i)))
                    num=num*10+(s.charAt(i++)-'0');
                if(prev>=num)
                return false;
                prev=num;
            }
        }
        return true;
        
    }
}