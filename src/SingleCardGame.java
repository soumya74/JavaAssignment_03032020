import java.util.Optional;

public class SingleCardGame extends CardGame {
	
	public void startGame() {
		for(Player p: players) {
			Optional<Card> c = cardDeck.getCard();
			
			if(c.isPresent()) {
				p.addCard(c.get());
			} else {
				System.out.println("No more cards present in deck");
			}
		}
	}

}
