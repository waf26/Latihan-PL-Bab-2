import java.util.Scanner;
public class Tugas2{
	private int jumlah, panjang, lebar, tmp=0, a=0;

	private int[] keliling;
	private int[] jarak;
	private int[] jumlahPutaran;
	private int[] jumlah_waktu;
	private String[] nama_mahasiswa;
	private String[] nim;

public void jumlah(int j){
	jumlah = j;
	keliling  = new int [jumlah];
	jarak  = new int [jumlah];
	jumlahPutaran  = new int [jumlah];
	jumlah_waktu = new int [jumlah];
	nama_mahasiswa = new String [jumlah];
	nim = new String [jumlah];

}
public void lpg(int p, int l){
	panjang = p;
	lebar = l;
}
public void Input(){
	Scanner in = new Scanner (System.in);
	for (int i=0;i<jumlah;i++) {
		nim[i] = in.next();
		nama_mahasiswa[i] = in.next();
		jumlahPutaran[i] = in.nextInt();
		jumlah_waktu[i] = in.nextInt();
	}
}
}