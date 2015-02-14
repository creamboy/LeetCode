public class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        Stack<Character> list=new Stack<Character>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{') list.push(c);
            else{
                if(list.size()==0) return false;
                char t=list.pop();
                if(c==')'&&t!='(') return false;
                if(c=='}'&&t!='{') return false;
                if(c==']'&&t!='[') return false;
            }
        }
        if(list.size()!=0) return false;
        return true;
    }
}