import java.util.*;

public class ATM_Simulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("==========ATM==========");


        int p=2345; //DEFAULT PIN FOR SIMULATION
        float saving=34000; //DEFAULT BALANCE FOR SAVINGS ACCOUNT FOR SIMULATION 
        float current=23456; // DEFAULT BALANCE FOR CURRENT ACCOUNT FOR SIMULATION 


        int attempts=0;
        boolean loggedIn=false;

        while(attempts<3){
            System.out.println("\nEnter Your PIN");
            int pin=sc.nextInt();

            if(pin==p){
                System.out.println("\nLOGIN SUCCESSFUL !");
                loggedIn=true;
                break;
            }
            else{
                attempts++;
                System.out.println("\nINCORRECT PIN !");
                System.out.println(("Attempts left="+(3-attempts)));
            }

        }

        if(!loggedIn){
            System.out.println("\n\n====== ATM LOCKED ! ====== ");
        }
        else{    
            System.out.println("\nCHOOSE YOUR ACTION");
            System.out.println("1-Balance check");
            System.out.println("2-Cash withdraw");
            System.out.println("3-Cash Deposit");

            int action=sc.nextInt();


            switch(action){

                case 1:System.out.println("\nBALANCE:\nSaving Account= "+saving+"/-\nCurrent Account= "+current+"/-");
                break;

                case 2:System.out.println("\n1-From Savings \n2-From current");
                        int c=sc.nextInt();

                        if(c==1){
                            System.out.println("\nEnter the ammount to withdraw");
                            float b=sc.nextFloat();
                            System.out.println("\nCash Wthdrawn="+b+"/-");
                            System.out.println("Balance left= "+(saving-b)+"/-");
                        }
                        else if(c==2){
                            System.out.println("Enter the ammount to withdraw");
                            float e=sc.nextFloat();
                            System.out.println("\nCash Wthdrawn="+e+"/-");
                            System.out.println("Balance left= "+(current-e)+"/-");
                        } 
                break;

                case 3:System.out.println("\n1-In Savings \n2-In current");
                        int d=sc.nextInt();

                        if(d==1){
                            System.out.println("\nEnter the ammount to deposit");
                            float a=sc.nextFloat();
                            System.out.println("\nDEPOSITED SUCCESSFULLY !");
                            System.out.println("Updated Balance= "+(saving+a)+"/-");
                        }
                        else if(d==2){
                            System.out.println("Enter the ammount to deposit");
                            float a=sc.nextFloat();
                            System.out.println("\nDEPOSITED SUCCESSFULLY !");
                            System.out.println("Updated Balance= "+(current+a)+"/-");
                        }
                 break;

                default:
                    System.out.println("\nINVALID ACTION ");
            }   
        }

    }
}
