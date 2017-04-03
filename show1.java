package test;

public class show1 {

	public static void main(String[] args) {
		int n1=2;
		int n2=1;
		show oper = new show();
		show2 oper1 = new show2();
		int result1,result2,result3,result4=0;
		result1=oper.addition(n1,n2);
		result2=oper.subtraction(n1, n2);
		result3=oper1.multiplication(n1,n2);
		result4=oper1.division(n1, n2);
		System.out.println(result1+1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
