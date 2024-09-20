import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class PallindromeCheck {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(10);
        if(checkPallindrome(l)){
          System.out.println("Pallindrome");
        }
        else{
          System.out.println("not pallindrome"); 
    } 
        
    }

    public static boolean checkPallindrome(LinkedList l){
        Collections.reverse(l);
        LinkedList temp=new LinkedList(l);
        System.out.println(temp);
        Collections.reverse(l);
        boolean res=true;
        for(int i=0;i<l.size();i++){
            if(l.get(i) != temp.get(i)){
                res=false;
                break;
            }
               
        }

        return res;
    }
    
}
