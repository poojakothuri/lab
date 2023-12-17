import java.util.*;
import complex.arith;
class complexNumMain{
    public static void main(String args[]){
    arith a1=new arith();
    arith a2=new arith();
    a1.rp=10;a1.ip=5;
    a2.rp=3;a2.ip=6;
    arith a3=new arith();
    a3.add(a1,a2);
    System.out.println(a3.rp+("+"+a3.ip+"i"));
     a3.sub(a1,a2);
     if(a3.ip<0)
    System.out.println(a3.rp+(a3.ip+"i"));
    else 
     System.out.println(a3.rp+("+"+a3.ip+"i"));
}

}