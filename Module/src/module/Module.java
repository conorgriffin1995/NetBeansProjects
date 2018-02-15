package module;


public class Module {

    private String modName;
    
    private String [] studName;
    private double [] studResults;
    private int n; //number of elements
    
    public Module(){
        
        modName = "null";
        studName = new String [10];
        studResults = new double [10];
        n = 0;
        
    }
    public Module(String modNameIn, int size){
        
        modName = modNameIn;
        studName = new String[size];
        studResults = new double[size];
        n = 0;
        
    }
    public String getName(int index){
        
        return studName[index];
    }
    public double getResult(int index){
        
        return studResults[index];
    }
    private void growArray(){
        String [] temp1 = new String[n+10];
        double [] temp2 = new double[n+10];
        
        studName = new String [n+10];
        for (int i = 0; i < n; i++)
        {
            temp1[i] = studName[i];
            temp2[i] = studResults[i];
        }
        studName = temp1;
        studResults = temp2;
    }
    public void add(String studNameIn, double studResultIn){
        if (n == studName.length){
            growArray();
        }
        studName[n] = studNameIn;
        studResults[n] = studResultIn;
        n++;
    }
    public void indexOf(int size){
        n = 0;
        studResults = new double[size];
        
    }
    public void setResult(int index, double resultIn){
        
        studResults[index] = resultIn;
        
    }
    public void print(){
        System.out.println("Module: "+modName);
        for (int i = 0; i < n; i++){
        System.out.println("Student "+studName[i]+"'s result is \t "+studResults[i]);
        }
    }
}
