import java.util.Scanner;

public class day {
	public static void main(String arg []) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter date month year\"dd mm yyyy\"");
		int gd,gm,gy,ym,yp,d;
		int[]m=new int[] {0,3,3,6,2,5,0,3,5};
		String[] wd=new String[] {"monday","tuesday","wednesday","thursday","friday","satruday","sunday"};
		//System.out.println("enter year");
		//int year=ip.nextInt();
		gd=ip.nextInt();
		gm=ip.nextInt();
		gy=ip.nextInt();
		ym=gy%100;
		yp=ym%4;
		d=(gd+m[gm-1]+ym+yp+1)%7;
		System.out.println(wd[d]);
		
		//if(year%400==0&&year%4==0&&year%100==0)
		{
		
		//System.out.println("leap year");}
	//	else
		{
			//System.out.println("not a leap year");
		}
		}
	}
}
	


