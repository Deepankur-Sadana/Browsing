package models;

import java.util.*;

//This is the class which is presented to user and it has pointers to other nodes
/**
 * @author hansel
 *
 */
public class Node {
	NodeData data;
	ArrayList<Node> suggestions;

	public NodeData getData() {
		return data;
	}

	public void setData(NodeData data) {
		this.data = data;
	}

	public ArrayList<Node> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(ArrayList<Node> suggestions) {
		this.suggestions = suggestions;
	}

}
