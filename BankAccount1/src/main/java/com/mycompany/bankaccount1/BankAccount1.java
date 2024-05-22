
package com.mycompany.bankaccount1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class BankAccount1 {

static int accountNumber=719129236,id,pinumber,number=071-192-9326,answer;
static double initialbalance=80.000,deposit,withdraw,transfer,Savings=10.000; 
static String name,accounttype="Real",homeaddress="2nd  Road kew St",email="deborahtshuma473@gmail.com";
static  LocalDate dateOfBirth;

static public void captureDetails(){
    System.out.println(" AFRICAN BANKING APPLICATION  ");
    Scanner e=new Scanner(System.in);
    System.out.println("Enter your full names ");
     name=e.next();
    System.out.println("Enter your date of birth (year): ");
    int year = e.nextInt();
    System.out.println("Enter your date of birth (month): ");
    int month = e.nextInt();
    System.out.println("Enter your date of birth (day): ");
    int day = e.nextInt();
    dateOfBirth = LocalDate.of(year, month, day);
    System.out.println("Enter your ID number");
     id=e.nextInt();
    System.out.println("Enter your home address");
     homeaddress=e.next();
    System.out.println("Enter your email address");
     email = e.next();
    System.out.println("Enter your celphone number");
     number=e.nextInt();
    System.out.println("Enter any 5 numbers you want");
     pinumber=e.nextInt();
   
    
    System.out.println("account Holder:"+ ""+name);
    System.out.println("Date of Birth:"+" "+dateOfBirth);
    System.out.println("Address:"+" "+homeaddress);
    System.out.println("Email Address:" + " " + email);
    System.out.println("Phone Number:"+" "+number);
    System.out.println("id number:"+""+""+id);
    System.out.println("pinumber:"+""+""+pinumber);
   
    
     }

 static public void MoneyOperation(){
    Scanner d=new Scanner(System.in);
    System.out.println("press 1 to deposit or press 2 to withdraw,press 3 to transfer,"
            + "4 to get transaction,press 5 to check balance , press 6 for your savings,press 7 to get your statement");
    answer=d.nextInt();
    
    if(answer==1){
    System.out.println("how much do you want to deposit");
       deposit=d.nextDouble();
        initialbalance +=deposit;
       LocalDateTime currentDateTime=LocalDateTime.now();
    System.out.println("Amount was deposited in your account.New balance is now: R" + initialbalance + " " + currentDateTime);
     }
 else if(answer==2){
    System.out.println("how much do you want to withdraw");
       withdraw=d.nextDouble();
  if (withdraw <= initialbalance) {
        initialbalance -= withdraw;
        LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Your balance is now: R" + initialbalance + " " + currentDateTime);
    } 
  else {
    System.out.println("Insufficient funds!");
    }
     }
 else if(answer==3){
    System.out.println("how much you want to transfer");
        transfer=d.nextDouble();
        initialbalance-=transfer;
  if (transfer <= initialbalance) {
        initialbalance -= transfer;
        LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Your balance is now: R" + initialbalance + " " + currentDateTime);
    System.out.println("Transfer successful! " + currentDateTime);
    }
  else {
    System.out.println("Insufficient funds! " );
    }
} 
 else if (answer == 4) {
       LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Transactions:");
    System.out.println("Date: " + currentDateTime);
    System.out.println(deposit + " was deposited into: " + accountNumber);
    System.out.println(withdraw + " was withdrawn from: " + accountNumber);
    System.out.println(transfer + " was transferred from: " + accountNumber);
}
 else if (answer == 5) {
        LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Your current balance is: R " + initialbalance + " " + currentDateTime);
}
 else if (answer == 6) {
    System.out.println("Savings account: R" + Savings);
}
 else if(answer==7){
     LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Statement: " + currentDateTime);
    System.out.println("ID Number: " + id);
    System.out.println("Email Address: " + email);
    System.out.println("Address: " + homeaddress);
    System.out.println("Account Holder: " + name);
    System.out.println("Phone Number: " + number);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Type: " + accounttype);
    System.out.println("Initial Balance: R" + initialbalance);
    System.out.println("Savings Account: R" + Savings);
    System.out.println("Withdrawals: R" + withdraw);
    System.out.println("Transfers: R" + transfer);
    System.out.println("Deposits: R" + deposit);
}
     
        
 }
 static public void transferToSavings(){
     Scanner s=new Scanner(System.in);
    System.out.println("Enter 8 for the amount you want to transfer to your savings "); 
    answer=s.nextInt();
  if(initialbalance>=transfer){
    System.out.println("how much you want to transfer to your savings account");
        transfer=s.nextDouble();
       initialbalance-=transfer;
       Savings+=transfer;
    System.out.println("Transfer successful. New balance:R " + initialbalance + ", New savings: " + Savings);
    }
 else {
    System.out.println("Insufficient funds");
    
   }
       
 }
static public void displayAccountInfo(){
    Scanner t =new Scanner(System.in);
    System.out.println("click 9 to display your account information"); 
     answer=t.nextInt();
    System.out.println("Account Number:"+accountNumber);
    System.out.println("Accout Holder:"+name);
    System.out.println("Accout type:"+accounttype);
    System.out.println("Date of Birth:"+" "+dateOfBirth);
    System.out.println("Address:"+" "+homeaddress);
    System.out.println("ID Number: " + id);
    System.out.println("Email Address: " + email);
    System.out.println("Phone Number:"+" "+number);
    System.out.println("Balance: R"+initialbalance);
    System.out.println("Savings Account: R"+Savings);
}
static public void LastDetail(){
  while (answer==9) {
       
            System.out.println("Enter 5 for acknowledging  ,Enter 6 to Exit, Enter 7 to Change your pinumber");
            System.out.println("Choose an option:");
            Scanner e= new Scanner(System.in);
            int option = e.nextInt();
    switch (option) {
              
        case 5:
             System.out.println(" THANK YOU FOR CHOOSING US");
           
             break;
          
        case 6:
             System.exit(0);
            
             break;
                        
                    
         case 7:
    System.out.println("Enter your current pinumber");
            int currentPinumber = e.nextInt();
    System.out.println("Enter your new pinumber" );
            int newPinumber = e.nextInt();
 if (currentPinumber == pinumber) {
        pinumber = newPinumber;
        
        System.out.println("Confirm your new password:");
        int confirmNewPinumber =e.nextInt();
        
        if (confirmNewPinumber==newPinumber) {
            
            currentPinumber = newPinumber;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Pin do not match");
        }
    } else {
        System.out.println("Incorrect current pin");
    }
    break;
   
        default:
    System.out.println("Invalid option");
            }
        }
        
 }

public static void main(String[] args) {
      captureDetails();
      MoneyOperation();
      transferToSavings();
      displayAccountInfo();
      LastDetail();
     
 }
    }
