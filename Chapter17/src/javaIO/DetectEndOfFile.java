package javaIO;
import java.io.*;

public class DetectEndOfFile {

	public static void main(String[] args) {
		try {
			try(DataOutputStream output = new DataOutputStream( new FileOutputStream("test3.dat")))
			{
				output.writeDouble(4.5);
				output.writeDouble(43.25);
				output.writeDouble(3.2);
			}
			try(DataInputStream input = new DataInputStream(new FileInputStream("test3.dat")))
			{
				while(true) {
					System.out.println(input.readDouble());
				}
			}
		}
		catch (EOFException ex) {
			System.out.println("All data was read");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
