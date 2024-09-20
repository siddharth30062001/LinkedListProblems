import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class RemoveNode{

    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(100);
        removeObject(l, n);
        System.out.println(l);
        

    }
    public static void removeObject(LinkedList e,int n){
        if(n<e.size() && n>=0){
            e.remove(e.size()-n);
        }
        else{
            System.out.println("Not in range");
        }

    }

}