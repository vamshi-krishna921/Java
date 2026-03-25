class Solution {
    
    public static void pushAtBottom(Stack<Integer> s, int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, val);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> st) {
       if(st.isEmpty()){
           return;
       }
       int top = st.pop();
       reverseStack(st);
       pushAtBottom(st,top);
    }
}
