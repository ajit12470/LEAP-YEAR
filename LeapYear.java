import java.util.Scanner;
class LeapYear{
    public static void main(String []args){
        Scanner s1=new Scanner(System.in);
        System.out.println("ENTER YEARS:");
        int Years=s1.nextInt();
        if((Years%4==0 && Years%100 !=0 ) || (Years%400==0)){
                System.out.println(Years +" this is leap Years");
        }
        else{
            System.out.println(Years +" this is not leap years");
        }
        s1.close();
    }
}