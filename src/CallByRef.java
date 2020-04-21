
public class CallByRef {
	
	int p,q;

	public static void main(String[] args) {
		CallByRef obj= new CallByRef();
		obj.p=10;
		obj.q=20;
		
		//In java call by ref is possible by passing object reference 
          obj.swipeNumbers(obj);
	     
	}
	public void swipeNumbers(CallByRef tobj) {
		int temp=tobj.p;
	     tobj.p=tobj.q;
	    tobj.q=temp;
	    
	   System.out.println(tobj.p);
	   System.out.println(tobj.q);
	}
}
