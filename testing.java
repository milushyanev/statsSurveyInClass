import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class testing{
	// Be sure to put your name on this next line...
	
	private static int counter=0;
	private static int menCount=0;
	private static int womenCount=0;
	private static int science=0;
	private static int engineers=0;
	private static int business=0;
	private static int education=0;
	private static int arts=0;
	private static int otherMajor=0;
	private static int alcoholCons=0;
	private static int walcoholCons=0;
	private static int nonAlcCons=0;
	private static int wine=0;
	private static int beer=0;
	private static int vodka=0;
	private static int tequila=0;
	private static int whiskey=0;
	private static int brandy=0;
	private static int otherAlc=0;
	private static int wscience=0;
	private static int wengineers=0;
	private static int wbusiness=0;
	private static int weducation=0;
	private static int warts=0;
	private static int wotherMajor=0;
	private static int wnonAlcCons=0;
	private static int wwine=0;
	private static int wbeer=0;
	private static int wvodka=0;
	private static int wtequila=0;
	private static int wwhiskey=0;
	private static int wbrandy=0;
	private static int wotherAlc=0;
	private static int everyday=0;
	private static int ftweek=0;
	private static int oaweek=0;
	private static int oamonth=0;
	private static int ftamonth=0;
	private static int ltoamonth=0;
	private static int weveryday=0;
	private static int wftweek=0;
	private static int woaweek=0;
	private static int woamonth=0;
	private static int wftamonth=0;
	private static int wltoamonth=0;
	
	
	// Here is some test code that one student had written...
	public static int InputValidation(int validationOne,int validationTwo) {
		Scanner sc=new Scanner(System.in);
		int number;
		do {
		   
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    
		   
		    number = sc.nextInt();
		} while (number <validationOne || number>validationTwo);
		return number;
	}
	public static void main(String[] args) throws IOException
	{	Scanner sc=new Scanner(System.in);
		LinkedList<String> mlist=new LinkedList<String>();
		LinkedList<String> wlist=new LinkedList<String>();
		List<String> lines = Files.readAllLines(Paths.get("D:\\statsProject\\surveys.txt"));
		List<String> lines1 = Files.readAllLines(Paths.get("D:\\statsProject\\result.txt"));
		String menResult="";
		String womenResult="";
		String printResult="";
		String result="";
		String emptyLine="";
		System.out.println("Select size for the sample from 1 to 100");
		System.out.print("-> ");int size=InputValidation(1,100);
		System.out.println("Do you want to enter the survey? Press 1 for YES, 2 for NO");
		int input1=InputValidation(1,2);
		if(input1==1) {
		do{
		System.out.println("Hello Please Answer the following questions using integers from 1 to 5 if possible");
		System.out.println();
		System.out.println("Please enter 1 for Male or 2 for Female");
		System.out.print("->"); int input=InputValidation(1,2);
		if(input==1) {
			menCount++;
		}else if(input==2) {
			womenCount++;
		}
		System.out.println("Please Enter your major");
		System.out.println("1.Science 2.Engineering 3.Business 4.Education 5.Arts 6.Other");
		System.out.print("->"); int input2=InputValidation(1,6);
		if (input==1&&input2==1) {
			science++;
		}else if (input==1&&input2==2) {
			engineers++;
		}else if(input==1&&input2==3) {
			business++;
		}else if (input==1&&input2==4) {
			education++;
		}else if(input==1&&input2==5) {
			arts++;
		}else if(input==1&&input2==6) {
			otherMajor++;
		}else if (input==2&&input2==1) {
			wscience++;
		}else if (input==2&&input2==2) {
			wengineers++;
		}else if(input==2&&input2==3) {
			wbusiness++;
		}else if (input==2&&input2==4) {
			weducation++;
		}else if(input==2&&input2==5) {
			warts++;
		}else if(input==2&&input2==6) {
			wotherMajor++;
		}
		System.out.println("Do you consume Alcohol?");
		System.out.println("1. YES 2. NO");
		System.out.print("->"); int input3=InputValidation(1,2);
		if(input3==1) {
			
			
		System.out.println("What type of the following do you prefer?");
		System.out.println("1.Wine	2.beer	3.vodka	 4.tequila	5.whiskey 6.brandy/cognac 7.other");
		System.out.print("->"); int input4=InputValidation(1,7);
		if (input==1&&input4==1) {
			wine++;
			alcoholCons++;
		}else if (input==1&&input4==2) {
			beer++;
			alcoholCons++;
		}else if (input==1&&input4==3) {
			vodka++;
			alcoholCons++;
		}else if (input==1&&input4==4) {
			tequila++;
			alcoholCons++;
		}else if (input==1&&input4==5) {
			whiskey++;
			alcoholCons++;
		}else if(input==1&&input4==6) {
			brandy++;
			alcoholCons++;
		}else if (input==1&&input4==7) {
			otherAlc++;
			alcoholCons++;
		}else if (input==2&&input4==1) {
			wwine++;
			walcoholCons++;
		}else if (input==2&&input4==2) {
			wbeer++;
			walcoholCons++;
		}else if (input==2&&input4==3) {
			wvodka++;
			walcoholCons++;
		}else if (input==2&&input4==4) {
			wtequila++;
			walcoholCons++;
		}else if (input==2&&input4==5) {
			wwhiskey++;
			walcoholCons++;
		}else if(input==2&&input4==6) {
			wbrandy++;
			walcoholCons++;
		}else if (input==2&&input4==7) {
			wotherAlc++;
			walcoholCons++;
		}
		System.out.println("How often do you consume alcohol beverages?");
		System.out.println("1.Every day	2.few times a week	3.once a week	4.few times a month	5.once a month	\r\n" + 
				"6.less than once a month\r\n" + 
				"");
		
		System.out.print("->"); int input5=InputValidation(1,6);
		if(input==1&&input5==1) {
			everyday++;
		}else if(input==1&&input5==2) {
			ftweek++;
		}else if(input==1&&input5==3) {
			oaweek++;
		}else if(input==1&&input5==4) {
			ftamonth++;
		}else if(input==1&&input5==5) {
			oamonth++;
		}else if(input==1&&input5==6) {
			ltoamonth++;
		}else if(input==2&&input5==1) {
			weveryday++;
		}else if(input==2&&input5==2) {
			wftweek++;
		}else if(input==2&&input5==3) {
			woaweek++;
		}else if(input==2&&input5==4) {
			wftamonth++;
		}else if(input==2&&input5==5) {
			woamonth++;
		}else if(input==2&&input5==6) {
			wltoamonth++;
		}
		result=""+input+" "+input2+" "+input3+" "+input4+" "+input5;
		
		}else if (input3==2) {
			nonAlcCons++;
		result=""+input+" "+input2+" "+input3;
		}
		printResult="Gender Count Scs Engi Bsns Edu Oth ACount Wine Beer Vodka Teq Whis Brd OAlc"
				+ "  1day FTaWeek 1Week FewTMonth 1Month Less1Month";
		menResult="Males -> "+menCount+"    "+science+"   "+engineers+"   "+business+"     "+education+"   "+otherMajor+"   "+
				alcoholCons+"      "+wine+"   "+beer+"     "+vodka+"     "+tequila+"   "+whiskey+"    "+brandy+"   "+otherAlc+"   "
				+"   "+everyday+"      "+ftweek+"     "+oaweek+"        "+ftamonth+"      "+oamonth+"     "+ltoamonth;
		womenResult="Female-> "+womenCount+"    "+wscience+"   "+wengineers+"   "+wbusiness+"     "+weducation+"   "+wotherMajor+"   "+
				walcoholCons+"      "+wwine+"   "+wbeer+"     "+wvodka+"     "+wtequila+"   "+wwhiskey+"    "+wbrandy+"   "+wotherAlc+"   "
				+"   "+weveryday+"      "+wftweek+"     "+woaweek+"        "+wftamonth+"      "+woamonth+"     "+wltoamonth;
		
		mlist.add(menResult);
		wlist.add(womenResult);
		//System.out.println(printResult);
		//System.out.println(mlist.get(counter));
		//System.out.println(wlist.get(counter));
		lines.add(result);
		if(counter==size-1) {
		lines1.add(printResult);
		lines1.add(mlist.get(size-1));
		lines1.add(wlist.get(size-1));
		lines1.add(emptyLine);}
		Files.write(Paths.get("D:\\statsProject\\surveys.txt"), lines);
		Files.write(Paths.get("D:\\statsProject\\result.txt"), lines1);
		counter++;
		if(counter<size) {
		 System.out.println("Do you want to enter the survey? Press 1 for YES, 2 for NO");
			input1=InputValidation(1,2);
			}else {
				input1=2;
			}

		}while(input1!=2); 
		System.out.println("GoodBye");
		}else
		System.out.println("GoodBye");
		
		
			
	}
	
}
