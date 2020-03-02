import java.util.Optional;

public class DoubleCardGame extends CardGame {
	
	public void startGame() {
		for(Player p: players) {
			
			for(int i=0; i<2 ;i++) {
				Optional<Card> c = cardDeck.getCard();
				
				if(c.isPresent()) {
					p.addCard(c.get());
				} else {
					System.out.println("No More card in Deck");
					break;
				}
				
			}
		}
	}
}
