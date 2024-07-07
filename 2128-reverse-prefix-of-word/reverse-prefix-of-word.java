class Solution {
    public String reversePrefix(String word, char ch) {
       int j=0;
       
            char[] c=word.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]==ch){
                    while(i>j){
                        char temp=c[i];
                         c[i]=c[j];
                         c[j]=temp;
                        i--;
                        j++;
                }
                return new String(c);

                }
            }
            return word;

        }
    
}