/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EmployeeInfo {
    private int id;
    private String employeeName;       
    private String gender;
    private String address;
    private Double balance;
    private String position;
    
    EmployeeInfo(int id,String employeeName ,String gender, String address,Double balance,String position )
    {
        this.id=id;
        this.employeeName=employeeName;
        this.gender=gender;
        this.address=address;
        this.balance=balance;
        this.position=position;
    }
    
    public int getid(){
        return id;
    }public String getName(){
        return employeeName;
    }public String getgender(){
        return gender;
    }public String getaddress(){
        return address;
    }public Double getBalance(){
        return balance; 
    }public String getposition(){
        return position;
    }
    
}
