import java.util.ArrayList;
class MethodsInArrayList{
public static void main(String[]args){
ArrayList<Integer> n = new ArrayList<>();
n.add(1);
n.add(0,10);
System.out.println(n);
System.out.println(n.size());
System.out.println(get(0));
n.set(1,25);
System.out.println(n);
n.remove(0);//remove by index
System.out.println(n);
n.clear();
System.out.println(n);
}
}