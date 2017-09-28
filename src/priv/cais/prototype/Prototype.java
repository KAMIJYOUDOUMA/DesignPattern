/**
 * 原型模式
 */
package priv.cais.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    private List<Integer> list;

    /* 浅克隆 */
    public Object shallowClone() throws CloneNotSupportedException {
//        Prototype proto = new Prototype();
//        proto.string=this.string;
//        proto.list=this.list;
//        proto.obj=this.obj;
//        return proto;
    	return (Prototype)super.clone();
    }

    /* 深克隆 */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    public String toString(){
    	return "String:"+this.string+"\t\tList Length:"+(list==null?0:list.size());
    }

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}