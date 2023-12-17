package mseva;
import java.util.*;
interface functions {
    void greet();
    void promptUser();
}

public class mseva_functions implements functions{
    Scanner sc=new Scanner(System.in);
    public Map<String,String[]> diseases=new HashMap<>();

    String[] Ap={"stomach ache","vomiting","low eye sight","muscle ache","fever"};
    String[] A={"stomach ache","vomiting","low eye sight","fever","fatigue"};
    String[] BC={"stomach ache","vomiting","low eye sight","skin allergy","low bp"};
    String[] PC={"stomach ache","vomiting","low eye sight","fever","fatigue"};
     String[] symptoms;
     List<String> result=new ArrayList<>();
    public mseva_functions(){
        setData();
        greet();
        promptUser(); 
        findDiseases();
     }
    void setData(){
    diseases.put("Acute pancreatitis", Ap);
    diseases.put("Appendicitis",A);
    diseases.put("Bladder Cancer",BC);
    diseases.put("Pancreatic Cancer",PC); }

    public void greet(){
        System.out.println("Welcome to M-seva");
    }
    public void promptUser(){
        System.out.println("enter your symptoms (space separated)");
        String input=sc.nextLine();
        symptoms=input.split(",");
    }
   void findDiseases(){
    Set<Map.Entry<String,String[]>> es=diseases.entrySet();
    for(Map.Entry<String,String[]> it:es){//iterating over keys
        int f=0,size=0;
        size=it.getValue().length;//checking if all symptoms of each disease are satisfied or not
        for(String sym:symptoms){
            String disease=sym.trim();
             for(String s:it.getValue()){
                 if(s.equals(disease.toLowerCase())){
                    f++;
                 }
             }
        }
        if(f==size)
        result.add(it.getKey());
        

   }
  
     
   
   System.out.println("possible diseases based on symptoms are ");
   for(String it:result){
    System.out.println(it);
   }

} }

