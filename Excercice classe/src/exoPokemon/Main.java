package exoPokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokemons pikachu = new Pokemons("Pikachu");

		Pokemons miu = new Pokemons("Miu");

		System.out.println(pikachu.getNom() + " = hp : " + pikachu.getHp());
		System.out.println(miu.getNom() + " hp :  " + miu.getHp());
		System.out.println(" ");

		while (!pikachu.isKO() && !miu.isKO()) {
			
			System.out.println("test !!!!!!!");
			if (!(pikachu.isKO())) {
				pikachu.attaquer(miu);
			}
			if (!(miu.isKO())) {
				miu.attaquer(pikachu);
			}
		}
	}
	
	test

}
