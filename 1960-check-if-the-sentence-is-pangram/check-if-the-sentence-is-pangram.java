class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
       HashSet<Character> set=new HashSet<>();

       for(char c : sentence.toCharArray()){
              if(Character.isLetter(c)){
                    
                    set.add(c);
              }
              }

              return set.size() == 26;

    }
}