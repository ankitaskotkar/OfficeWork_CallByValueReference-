
public class CallByValue {

public static void main(String[] args) {
	
	CallByValue obj= new CallByValue();
	int p=10;
	int q=20;
	obj.sum(p, q);
	obj.sum(20, 30);
}
public void sum(int i, int j) {
	System.out.println(i+j);
}

}
