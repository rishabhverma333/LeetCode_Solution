class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int max=Integer.MIN_VALUE;
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(isVowel(ch)){
                count++;
            }
            if(j-i+1==k){
                max=Math.max(count,max);
                if (isVowel(s.charAt(i))) {
                    count--;
                }
                i++;
                }  
            
        }
        return max;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u';
    }
}