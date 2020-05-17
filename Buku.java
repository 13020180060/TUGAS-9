public class Buku 
{
private String pengarang;
private String judul;private Buku() 
{
this("The Naked Traveller", "Trinity");
 }
private Buku(String judul,String pengarang) {this.judul =judul;this.pengarang = pengarang;
}
private void cetakKeLayar()
 {
System.out.println("Judul : " + judul + " Pengarang : " + pengarang);
}
public static void main(String[] args)
{
Buku a,b ;
a = new Buku("Edensor", "Andrea Hirata");
b = new Buku();
a.cetakKeLayar();
b.cetakKeLayar();
}
}
