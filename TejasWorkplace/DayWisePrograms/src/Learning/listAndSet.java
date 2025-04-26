package Learning;

import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class listAndSet {
	public static void main(String[] args) throws Exception {
		/*
		 * FileWriter fw = new FileWriter(
		 * "C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\Learning\\test.txt"
		 * ); fw.write("Tejas");
		 * 
		 * fw.close();
		 */

		/*
		 * // reader BufferedReader br = new BufferedReader(new FileReader(
		 * "C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\Learning\\listAndSet.java"
		 * )); String line; while ((line = br.readLine()) != null) {
		 * System.out.println(line); } br.close();
		 */

		/*
		 * // writing object MyClass myObject = new MyClass(); DataOutputStream dos =
		 * new DataOutputStream( new FileOutputStream(
		 * "C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\Learning\\test.dat")
		 * ); dos.writeInt(10); dos.writeUTF("hello"); dos.close();
		 * 
		 * DataInputStream dis = new DataInputStream(new FileInputStream(
		 * "C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\Learning\\test.dat"
		 * )); int i = dis.readInt(); String s = dis.readUTF(); System.out.println(i);
		 * System.out.println(s); dis.close();
		 * 
		 */

		// Object
		MyClass myObject = new MyClass();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\Learning\\test.dat"));
		oos.writeObject(myObject);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\Learning\\test.dat"));
		MyClass obj = (MyClass) ois.readObject();
		System.out.println(obj);
	}
}
