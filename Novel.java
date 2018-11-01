public class Novel extends Buku{
	public int harga;
	public Novel(String judul,int harga){
		super(judul);
		this.harga=harga;
	}
	public Novel(String judul){
		super(judul);
	}
	public void tampilharga(){
		System.out.println("harganya = "+harga);
	}
}