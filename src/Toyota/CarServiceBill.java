
package Toyota;


public class CarServiceBill {
    
    private String custName, plateNo, carModel, services;
    private double cc, payment;
    private int km;
    private boolean membership;
    
    public CarServiceBill(String custName, String plateNo, String carModel, double cc, int km, boolean membership, String services){
        
        this.custName = custName;
        this.carModel = carModel;
        this.plateNo = plateNo;
        this.services = services;
        this.cc = cc;
        this.km = km;
        this.membership = membership;
        
    }
    
    public void determineFinalPayment(double total){
        
        if(membership = true){
            
            double discount = 0.2*total;
            payment = total-discount;
            
        }
        
        else{
            
            payment = total;
            
        }
        
    }
    
    public String toString(){
        
        String member;
        
        if(membership=true){
            
            member = "Member";
            
        }
        
        else{
            
            member = "Not Member";
            
        }
        
        return "Customer Name: "+custName
                +"\nPlate No: "+plateNo
                +"\nCar Model: "+carModel
                +String.format("\nCC: %.2f", cc)
                +"\nKilometers: "+km
                +"\nMembership: "+member
                +"\nServices: "+services
                +String.format("\nPayment: RM%.2f", payment);
        
    }
    
    public String toStringForFile(){
        
        String member;
        
        if(membership=true){
            
            member = "Member";
            
        }
        
        else{
            
            member = "Not Member";
            
        }
        
        return String.format("%-15s%-15s%-15.2f%-15s%-10s%-15s%-15s%-15s%-15.2f",custName,plateNo,carModel,cc,km,member,services,payment);
        
    }
    
}
