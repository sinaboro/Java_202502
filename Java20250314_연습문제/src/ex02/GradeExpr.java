package ex02;

public class GradeExpr {
	private int[] jumsu;
//	private int sum=0;

	public GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	int getTotal() {
		int sum=0;
		for(int i=0; i<jumsu.length; i++)
			sum += jumsu[i];
		
		return sum;
	}
	
	double getAverage() {
		return (double)getTotal()/jumsu.length;
	}
	
	int getGoodScore() {
		int max= jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i])
				max = jumsu[i];
		}
			
		return max;
	}
	
	int getBadScore() {
		int min= jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(min > jumsu[i])
				min = jumsu[i];
		}
		return min;
	}
}
