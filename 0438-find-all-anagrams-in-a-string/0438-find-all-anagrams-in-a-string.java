class Solution {
    public List<Integer> findAnagrams(String s2, String s1) {
        List<Integer> list = new ArrayList<>();
        if(s1.length()>s2.length()) return list;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for( char ch:s1.toCharArray()){
             map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

         HashMap<Character, Integer> map2 = new HashMap<>();
         int i=0;
        for(int j=0;j<s2.length();j++){
            char ch=s2.charAt(j);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            if(j-i+1>s1.length()){
                char removeCh=s2.charAt(i);
                map2.put(removeCh, map2.get(removeCh) - 1);
                if(map2.get(removeCh)==0){
                     map2.remove(removeCh);
                }
                i++;
            }
            if (map1.equals(map2)) {
                list.add(i);
            }
        }
         return list;
    }
}    
