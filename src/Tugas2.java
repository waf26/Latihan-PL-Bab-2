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
public void getJarak(){
	for (int i=0;i<jumlah;i++) {
		keliling[i] = (panjang+lebar)*2;
		jarak[i] = jumlahPutaran[i]*keliling[i];
	}
}
public void Tampilkan(){
	for (int i=0;i<jumlah;i++) {
		System.out.println(nama_mahasiswa[i]+" "+jarak[i]);
	}
}
public void Bandingkan(){
	tmp = jumlah_waktu[0];
	for (int i=1;i<jumlah;i++) {
		if(jumlah_waktu[i]<tmp){
			tmp = jumlah_waktu[i];
			a = i;
		}
	}
	System.out.println(nama_mahasiswa[a]);
}
}
}