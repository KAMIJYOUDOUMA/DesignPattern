package priv.cais.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype p1=new Prototype();
		List<Integer> list=new ArrayList<>();
		p1.setString("original");
		p1.setList(list);
		Prototype p2=(Prototype)p1.shallowClone();
		Prototype p3=(Prototype)p1.deepClone();
		print(p1,p2,p3);


		p1.setString("changed ");
		list.add(1);
		p1.setList(list);
		print(p1,p2,p3);
	}

	static void print(Prototype p1,Prototype p2,Prototype p3){
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
