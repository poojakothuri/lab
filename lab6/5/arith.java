package complex;

public class arith {
   public int rp,ip;
    public void arith(){
        rp=0;
        ip=0;
    }
   public void arith(int rp,int ip){
        this.rp=rp;
        this.ip=ip;
    }
    public void add(arith a1,arith a2){
        rp=a1.rp+a2.rp;
        ip=a1.ip+a2.ip;
    }
   public void sub(arith a1,arith a2){
        rp=a1.rp-a2.rp;
        ip=a1.ip-a2.ip;
    }
}
