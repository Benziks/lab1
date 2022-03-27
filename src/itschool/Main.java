import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
		
		task28();
		task53();
		task78();
		task103();
		task128();
	}
	 private static	void task28(){ //Даны натуральное число n и вещественное число x. Вычислить S = sin(x)+sinsinx +....
      
double x = Math.random() * 100;
double sum = 0;

double n = Math.random() * 100;

double sn = Math.sin(x);
for (int i = 0; i < n; i++)
{
sum += sn + Math.sin(sn);
sn = Math.sin(sn);
}
      
	    System.out.println(sn);
	}
	
	
	 private static	void task53(){ //Найти сумму 2^2 + 2^3 + 2^4 + ... + 2^10 без возведения в степень.
      int a=2,sum=0;
	    for(int i=1;i<10;i++){
	        
	        a*=2;
	       	sum+=a;
	    }
	    System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	 private static void task78(){//Вычислить приближённо площадь одной арки синусоиды.
      

     double s = 0,  pi=3.14; 
       Scanner b = new Scanner(System.in);
      System.out.println("Введите высоту");
      double y = b.nextInt();
	    for(double i=0.1;i<=9;i++){
	          
        y = Math.sin((pi/10)*i);
        s+=(pi/10) * y;
	  

	
	}
	 
	  System.out.println("Hello World " + s);
    
}
	
	
	
	
	 private static	void task103(){//Известен возраст каждого ученика двух классов. Определить средний возраст учеников каждого класса. В каждом классе учатся по N человек.
      
      Scanner s1 = new Scanner(System.in);
      System.out.println("Введите кол-во учеников в первом классе");
      int n1 = s1.nextInt();
      
      int sum1=0;
	    for(int i=0;i<n1;i++){
	         Scanner b1 = new Scanner(System.in);
      System.out.println("Введите возраст учеников");
	       int a1 = b1.nextInt();
	       	sum1+=a1;
	    }
	    System.out.println("В первом классе средний возраст учеников:  "+sum1/n1);
	    
	    
	    Scanner s2 = new Scanner(System.in);
      System.out.println("Введите кол-во учеников во втором классе");
      int n2 = s2.nextInt();
      
      int sum2=0;
	    for(int i=0;i<n2;i++){
	         Scanner b2 = new Scanner(System.in);
      System.out.println("Введите возраст учеников");
	       int a2 = b2.nextInt();
	       	sum2+=a2;
	    }
	    System.out.println("Во втором классе средний возраст учеников:  " + sum2/n2);
	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	private static void task128(){//Найти двузначное число, равное квадрату числа его единиц, сложенному с кубом числа его десятков.
      
     int a, b,  d;
	    for(int i=10;i<=99;i++){
	         
	   a = i / 10;
	   b = i%10;
	   d = i / 10;
	   if(i ==  b*b + d * d * d  ){
	       	 System.out.println("Hello World " + i);
	    }
	    
	   

	    
	}
	
	
}
	
	
	
	
	
	
	
	
	
	



