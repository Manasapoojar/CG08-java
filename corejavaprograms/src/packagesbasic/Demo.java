package packagesbasic;// user defined package
// import java.  - built in package

import com.tnsif.accessmodifierprogram.Publicdemo;

public class Demo { //class location
	String me=" mansa";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java");
		 Publicdemo p = new Publicdemo();
			
			System.out.println(p.a);
			//System.out.println(p.b); private method can't access in diff. class
			//System.out.println(p.s); protected method can't access in diff. packages
	}

}
