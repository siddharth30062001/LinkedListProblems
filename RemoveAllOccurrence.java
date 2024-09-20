import java.util.LinkedList;
import java.util.Scanner;

class RemoveAllOccurrence {

    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList();
        System.out.println("Enter the element");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(60);
        l.add(30);
        removeElement(l, n);

    }

    public static void removeElement(LinkedList l,int n){
        for(int i=0;i<l.size();i++){
            if(l.get(i)==(Integer)n){
                 l.remove(i);
            }
        }
        System.out.println(l);
    }
    
}
