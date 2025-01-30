import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight:");
        float Weight = sc.nextFloat();
        System.out.println("Enter your height:");
        float height = sc.nextFloat();
        float BMI = Weight/(height*height);
        System.out.printf("your BMI is:%f\n",BMI);
        if(BMI<20.5){
            System.out.println("your bmi is Underweight:");
        }else{
            System.out.println("your bmi is Normalweight:");
        }
         sc.close();
    }
}