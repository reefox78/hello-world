package exoPokemon;

public class Pokemons {

	private String nom;
	private int niveau = 0;
	private int hp = 0;
	private int atk = 0;

	public Pokemons(String nom) {
		this.nom = nom;
		this.niveau = (int) (Math.random() * 20);
		this.hp = 2 * niveau;
		this.atk = (niveau / 2) + 1;
	}

	public boolean isKO() {
		if (this.hp <= 0) {
			System.out.println(this.getNom() + " est KO");
			return true;
		}
		return false;
	}

	public void soigner() {
		this.hp = 2 * niveau;
	}

	public void attaquer(Pokemons p) {
//		System.out.println(p.getNom() + " = " + p.getHp() + " hp;");
		System.out.print(p.getNom() + " : hp = " + p.hp + " ; ");
		p.hp = p.hp - this.atk;
		System.out.print(p.getNom() + " a perdu " + this.atk + " hp");
		System.out.println("; hp restant = " + p.hp);
		System.out.println(" ");

	}

	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
}
