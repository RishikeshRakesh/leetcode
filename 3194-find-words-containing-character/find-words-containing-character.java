class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
         List<Integer> a=new ArrayList <>();
        for(int i=0;i<words.length;i++){
            String word = words[i];
            for(int j=0;j<word.length();j++){
                char c1=word.charAt(j);
                if(c1==x){
                    a.add(i);
                    break;
                }
            }
        }
        return a;
    }
}