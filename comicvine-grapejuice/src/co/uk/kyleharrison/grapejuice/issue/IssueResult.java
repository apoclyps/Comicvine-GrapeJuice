package co.uk.kyleharrison.grapejuice.issue;

import java.util.ArrayList;

public class IssueResult {

	private ArrayList<?> field_list = new ArrayList<Object>();
	private String deck;
	
	public IssueResult() {
		super();
		setDeck(null);
	}

	public ArrayList<?> getField_list() {
		return field_list;
	}

	public void setField_list(ArrayList<?> field_list) {
		this.field_list = field_list;
	}

	public String getDeck() {
		return deck;
	}

	public void setDeck(String deck) {
		this.deck = deck;
	}
	
}
