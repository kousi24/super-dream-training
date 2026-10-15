class Solution {
public:
    int clumsy(int n) {
        if(n==1)
        return 1;
        if(n==3||n==2)
        return n*(n-1);
        
        int j=0,prev=n;

        vector<char> signs={'*','/','+','-'};
        char sign='*';
        stack <int> num_stack;
        stack <char> char_stack;

        for(int i=n-1;i>=1;i--)
        {
            if(sign=='*')
            {
                prev=(prev*i);
            }    
            else if(sign=='/')
                prev=(prev/i);
            else if(sign=='+')
            {
                num_stack.push(prev);
                char_stack.push(sign);
                num_stack.push(i);
            }
            else
            {
                char_stack.push(sign);
                prev=i;  
            }
            if(i==1&&sign!='+')
            num_stack.push(prev);

            j++;
            sign=(signs[j%4]);
        }
        int ans=0;
        while(!char_stack.empty())
        {
            int a=num_stack.top();
            char ch=char_stack.top();
            num_stack.pop();
            char_stack.pop();
            if(ch=='+')
            ans+=a;
            else 
            ans-=a;
        }

        ans+=num_stack.top();

        return ans;    
    }
};