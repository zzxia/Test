import java.util.List;
import java.util.ArrayList;

public class Test{
    public static void main(String args[]){
//跟数组类似，不定长长度,下标从0开始 
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        String s=arrayList.get(1);
        System.out.println(s); 
        arrayList.remove(1);
        for (int i=0;i<arrayList.size();i++){
           String s1=arrayList.get(i);
           System.out.println(s1);
        }
    }


}
