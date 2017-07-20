package player;
import java.util.Scanner;
public class RemoveDuplicateLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Word:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();

String b=s.nextLine();
for(int i=0;i<a.length();i++){
	for(int j=0;j<b.length();j++){
		if(a.charAt(i)!=b.charAt(j)){
			b=b+a.charAt(i);
		}
	}
}
System.out.println("The Word is:"+b);
	}

}
