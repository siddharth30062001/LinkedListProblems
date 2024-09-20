import java.util.LinkedList;

class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {
        
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(20);
        l.add(30);
        l.add(100);
        LinkedList l1=new LinkedList();
        l1.add(30);
        l1.add(42);
        l1.add(20);
        l1.add(20);
        
        commonObject(l, l1);
        
    }

    public static void commonObject(LinkedList l,LinkedList l1){
        LinkedList rs=new LinkedList();

       for(int i=0;i<l.size();i++){
        for(int j=0;j<l1.size();j++){
            if(l1.contains(l.get(i)) && !rs.contains(l.get(i)))
                 rs.add(l.get(i));
                 break;
        }
       }
       System.out.println(rs);
    }
    
}
