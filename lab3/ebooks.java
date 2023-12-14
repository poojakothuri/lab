import java.util.*;

class books{
    private String  bname,author;
    private int count;
    static private Map<String,books> a=new HashMap<>();
    static private Set<Map.Entry<String,books>> entryset=a.entrySet();
     books(String n,String a,int c){
        bname=n;
        author=a;
        count=c;
     }

   public String toString(){ //overriding toString() method of object class
    return bname+" "+count ;
   }
     
   static void setBooks(){
      a.put("dbms",new books("dbms","iyer",10));
      a.put("wise and otherwise",new books("wise and otherwise","sudha murthy",15));
      a.put("best intentions",new books("best intentions","smitha",5));
      a.put("os",new books("os","anand",2));
      a.put("ss",new books("ss","a.anand",8));
      
   }
   static void print(){
    for(Map.Entry<String,books> it:entryset){
        System.out.println(it.getValue());
    }
}

  static void buy(String n,int c){
    if(a.get(n)==null) System.out.println("book not found");
    else 
    {  if(c<=a.get(n).count){
        a.get(n).count=a.get(n).count-c;
        System.out.println(n+" "+"of count "+ c+ " successfully purchased"); print(); }
        else 
        System.out.println("insufficient no. of books,try with less no.");
    }
    
  }
   }
   
   

class customer{

    private String cid,name,address;
    customer(String i,String n,String a){
        cid=i;
        name=n;
        address=a;
    }
}

class ebooks{
    public static void main(String args[]){
   books.setBooks();
   books.print(); 
  customer c=new customer("1","namkeen","knr");
   books.buy("ss", 2);
   books.buy("os", 3);       
}

}