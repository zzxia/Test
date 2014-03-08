import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Test{
     public static void main(String args[]){
        /* HashSet<String> hashSet=new HashSet<String>();
         Set<String> set=hashSet;(向上转型) // 把具体的实现类对象转成接口类对象，也可用下面更简洁的写法*/
         Set<String> set=new HashSet<String>();
         boolean b1=set.isEmpty();
         System.out.println(b1);
         set.add("a");
         set.clear();
         set.add("b");
         set.add("c");
         set.remove("c");
         int i=set.size(); //得到SET总共有多少元素
         System.out.println(set.size());

//集合的获取需要用到Iterator<--Collection<--Set<--HashSet   继承关系
//                                       <--List<--ArrayList 
//hasNext()  返回的是Boolean值，还有元素，返回真，   next()返回下一个元素
         //调用Set对象的Iterator方法，会生成一个迭代器对象，该对象用于遍历整个Set
         Iterator<String> it=set.iterator();//生成一个叠代器对象
         /*boolean b2=it.hasNext();
         if (b2){
             String s3=it.next(); //取下一个值，然后邮标下移一位
             System.out.println(s3);
         } */
         while(it.hasNext()){
             String s4=it.next();
             System.out.println(s4);
         }
     }
}
