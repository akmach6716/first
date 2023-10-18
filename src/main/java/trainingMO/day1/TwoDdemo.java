package trainingMO.day1;
public class TwoDdemo {
	public static void main(String[] args) {
		Object [][] student= new Object[2][3];
		student[0][0]="Sachin";
		student[0][1]="batsmen";
		student[0][2]="54";
		student[1][0]="Rohit";
		student[1][1]="batsmen";
		student[1][2]="52";		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{   
				System.out.println(student[i][j]);				 
				
			}	}	} }
