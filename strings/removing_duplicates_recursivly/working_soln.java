class Solution{//https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates/0
    public static String removeDuplicate(String str){
        int len=str.length();
        if(len<=1)
            return str;
        String temp="";
        boolean check=false;
        for(int i=0;i<len-1;i++){
            if(str.charAt(i)==str.charAt(i+1))
                check=true;
            else{
                if(check)
                    check=false;
                else
                    temp=temp+str.charAt(i);
            }
        }
        if(str.charAt(len-2)!=str.charAt(len-1))
            temp=temp+str.charAt(len-1);
        return temp;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String str=in.next(),str2;
            
            while(true){
                str2=removeDuplicate(str);
                if(str.compareTo(str2)==0)
                    break;
                str=str2;
            }
            System.out.println(str);
        }
    }
}
