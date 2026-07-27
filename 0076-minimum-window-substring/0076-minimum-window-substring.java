class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character,Integer> smap=new HashMap<>();
        int left=0;
        int right=0;
        int start=0;
        int minlength=Integer.MAX_VALUE;
        int count=0;
        int req=t.length();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(tmap.containsKey(ch)){
                smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            if(smap.get(ch)<=tmap.get(ch)){
                count++;
            }
            }
            right++;
            while(count==req){
                if(right-left<minlength){
                    minlength=right-left;
                    start=left;
                }
                char remove= s.charAt(left);
                if(tmap.containsKey(remove)){
                    if(smap.get(remove)<=tmap.get(remove)){
                        count--;
                    }
                    smap.put(remove,smap.get(remove)-1);
                }
                left++;  
            }
        }
        if(minlength==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlength);
    }
}