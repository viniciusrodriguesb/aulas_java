package exercicio;

public class LivrosTeste {

	public static void main(String[] args) {
		Livros[] meusLivros = new Livros[3];

		int x = 0;

		meusLivros[0].titulo = "Java forever";
		meusLivros[1].titulo = "Java em orbita";
		meusLivros[2].titulo = "Cozinhe com Java";
		meusLivros[0].autor = "bob";
		meusLivros[1].autor = "sue";
		meusLivros[2].autor = "ian";

		while (x < 3) {
			System.out.println(meusLivros[x].titulo);
			System.out.println(" de ");
			System.out.println(meusLivros[x].autor);
			x = x + 1;
		}
	}
}
