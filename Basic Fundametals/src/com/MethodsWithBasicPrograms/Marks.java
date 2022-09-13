package com.MethodsWithBasicPrograms;

public class Marks {
	public void StudentMarks(int telugu ,int english,int maths,int physics, int science) {
		
		double total= telugu+english+maths+physics+science;
		double percentage=(total/500)*100;
		double avarage=total/5;
		
		System.out.println("The total Marks :"+total);
		System.out.println("Percentage :"+percentage);
		System.out.println("average :"+Math.round(avarage));
	}
	public static void main(String[] args) {
		
		Marks avg=new Marks();
		
		avg.StudentMarks(50, 23, 50, 80, 98);
	}

}
