
enum suit {
	DIAMONDS,
	CLUBS,
	HEARTS,
	SPADES
}


public class Card implements Comparable<Card> {

	private suit s;
	private Integer v;
	
	Card(suit s, Integer v){
		this.s = s;
		this.v = v;
	}
	
	public suit getS() {
		return s;
	}
	public void setS(suit s) {
		this.s = s;
	}
	public Integer getV() {
		return v;
	}
	public void setV(Integer v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Card [s=" + s + ", v=" + v + "]";
	}

	@Override
	public int compareTo(Card c2) {
		
		if (this.getV().equals(c2.getV())) {
			return c2.getS().ordinal() - this.getS().ordinal();
		}
		
		return c2.getV() - this.getV();
	}
	
	
	
	
}
