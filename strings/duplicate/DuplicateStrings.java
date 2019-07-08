import java.util.*;




class DuplicateStrings{

public static void main(String args[]){

pri("programming");
pri("Java");

}

public static void pri(String word)
{char[] c = word.toCharArray();
Map<Character,Integer> hm = new HashMap<Character,Integer>();

for(Character ch : c)
{
   if(hm.containsKey(ch)){

     hm.put(ch,hm.get(ch)+1);
    }
   else{
      hm.put(ch,1);
}
}
    


Set<Map.Entry<Character,Integer>> e = hm.entrySet();

System.out.println("list");

for(Map.Entry<Character,Integer> entry :e){

  if(entry.getValue() >1){
    System.out.printf("%s :%d %n",entry.getKey(),entry.getValue());
}
}
}
}









