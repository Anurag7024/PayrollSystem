
public class Payments {
    
    private int id;
    private String employee_name;
    private float balance;
    private String position;
    private float givepay;
    private float totalbalance;
    
    public Payments(int id,String employee_name,float balance,String position,float givepay,float totalbalance){
        this.id=id;
        this.employee_name=employee_name;
        this.balance=balance;
        this.position=position;
        this.givepay=givepay;
        this.totalbalance=totalbalance;
    }
    public int getid(){
        return id;
    }public String getemployee_name(){
        return employee_name;
    }public float getbalance(){
        return balance;
    }public String getPosition(){
        return position;
    }public float getgivepay(){
        return givepay;
    }public float gettotalbalance(){
        return totalbalance;
    }
    
    
}
