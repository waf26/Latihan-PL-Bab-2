package sc;
import java.util.Scanner;
public class MainTugas2{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		int jumlah=0, p,l;
		
		System.out.print("");
		Tugas2 m1 = new Tugas2();
		j = in.nextInt();
		m1.jumlah(j);
		p = in.nextInt();
		l = in.nextInt();
		m1.lpg(p,l);
	
	}
}