import java.util.*;


class FirstNonRepeated{




public static void main(String args[]){

pri("Pprrogramming");
//pri("Programming");
pri("javaj");

}

public static void pri(String word)
{
word = word.toLowerCase();
char[] c = word.toCharArray();
Map<Character,Integer> hm = new LinkedHashMap<>(word.length());

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

  if(entry.getValue() ==1){
    System.out.println(entry.getKey());
    System.out.println(entry.getValue());
      break;
}
}
}
}

