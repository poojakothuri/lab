import java.util.*;

class products{
    private String pid, pname;
    private double price,quantity;
    private static Map<Integer ,products> p=new HashMap<>();
   private static Set<Map.Entry<Integer,products>> entryset=p.entrySet();
    products(String i,String n,double cost,double q){
        pid=i;
        pname=n;
        price=cost;
        quantity=q;
    }
    //it is called when employee object is printed if not overriden default toString method is called
   public String toString(){ //overriding toString() method of object class
    return pid+" "+pname+" "+price+" "+quantity;
   }
     
   static void setProduct(){
       p.put(1,new products("p1","product1",99.90,3));
       p.put(2,new products("p2","product2",20.20,1));
       p.put(3,new products("p3","product3",6.87,1));
       p.put(4,new products("p4","product4",45.50,2));
       p.put(5,new products("p5","product5",40.49,1.5));
      
   }
   static void printall(){
    for(Map.Entry<Integer,products> it:entryset){
        System.out.println(it.getKey()+" "+it.getValue());
    } }
  static double findPrice(int id){
     if(p.get(id)==null) return 0;
      return p.get(id).price;
     }
   static double getQuantity(int id){
     if(p.get(id)==null) return 0;
       
       return p.get(id).quantity;
     }
   }


class retail{
    public static void main(String args[]){
        products.setProduct();
        products.printall();
    System.out.println("enter -1 to exit or enter a no. from 1 to 5 to choose a product and enter corresponding quantity");
    Scanner sc=new Scanner(System.in);
    double cost=0;
    while(true){
        int n=sc.nextInt();
        double p,q1,c;
        if(n==-1) break;
        double q=sc.nextDouble();
        switch(n){
            case 1:
            q1=products.getQuantity(n);
            p=products.findPrice(n);
                 c=(p*q)/q1;
                System.out.println("retail price of p"+n+" is "+c);
                cost+=c;
                // System.out.println(p+" "+q1+" "+q);
                break;
            case 2:{
                 p=products.findPrice(n);
                 q1=products.getQuantity(n);
                 c=(p*q)/q1;
                System.out.println("retail price of p"+n+" is "+c);
                cost+=c;
                break;}
            case 3:
                 p=products.findPrice(n);
                 q1=products.getQuantity(n);
                 c=(p*q)/q1;
                System.out.println("retail price of p"+n+" is "+c);
                cost+=c;
                break;
            case 4:
                 p=products.findPrice(n);
                 q1=products.getQuantity(n);
                 c=(p*q)/q1;
                System.out.println("retail price of p"+n+" is "+c);
                cost+=c;
                break;
            case 5:
                 p=products.findPrice(n);
                 q1=products.getQuantity(n);
                 c=(p*q)/q1;
                System.out.println("retail price of p"+n+" is "+c);
                cost+=c;
                break;
            default:
               System.out.println("select a valid product");

              
              
        }
    }
    System.out.println("total retail price of all products "+cost);
}

}