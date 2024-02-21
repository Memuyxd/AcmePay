import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) {
        
        double hourlyPayRate;
        double retireDeduct;
        double regPay;
        double overPay;
        overPay = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter shift >> ");
        int shift = input.nextInt();
        System.out.print("Please enter hours worked >> ");
        double hours = input.nextDouble();

        //payrates
        if(shift == 1){
            hourlyPayRate = 17;


        }
        else if (shift == 2){
            hourlyPayRate = 18.5;
            
            
        }else{
            hourlyPayRate = 22;

            //overtime calculation
        }
        if(hours <= 40 ){
            regPay = hours * hourlyPayRate;
        }
        else{
            regPay = hours * hourlyPayRate;
            overPay = (hours - 40) * hourlyPayRate * 1.5;
        }
        retireDeduct = 0.0;
        //retirement plan
        if (shift == 2 || shift == 3) {
            System.out.printf("Do you want to participate in the retirement plan?%n     Enter 1 for Yes and 2 for No >> ");
            int retireDecision = input.nextInt();
            if (retireDecision == 1) {
                 retireDeduct =  0.03;
                
            }else if (retireDecision == 2) {
                System.out.println("Not entering retirement plan");
            }else{
                System.out.println("invalid input");
            }   
            
        }
        //calculate pay
        double netPay = regPay + overPay;
        double deductAmount = netPay * retireDeduct;
        double netPayTotal = netPay - deductAmount;
        System.out.println("Hours worked is    " + hours);
        System.out.println("Shift:             " + shift);
        System.out.println("Hourly pay rate is " + hourlyPayRate);
        System.out.println("Regular pay is     " + regPay);
        System.out.println("Overtime pay is    " + overPay);
        System.out.println("Retirement deduction is " + deductAmount);
        System.out.println("Net pay is.............." + netPayTotal);
    }
    
}
