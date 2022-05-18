
public class AppString {

	public static void main(String[] args) {
		Pelicano[] filhotes = new Pelicano[3];

		Pelicano p1 = new Pelicano();
		Pelicano p2 = new Pelicano();

		p1.setCor("Branco");
		p1.setPeso(10);
		p1.setBico(true);
		p2.setCor("Marrom");

		filhotes[0] = p1;
		filhotes[1] = p2;
		filhotes[2] = new Pelicano();

		filhotes[2].setCor("Preto");
		System.out.println(filhotes[0].getCor());
		System.out.println(filhotes[0].getPeso());
		System.out.println(filhotes[0].getBico());

		filhotes[2].voar();

		for (Pelicano exemplo : filhotes) {
			System.out.println("O pelicano tem a cor : " + exemplo.getCor());
		}
	}
}