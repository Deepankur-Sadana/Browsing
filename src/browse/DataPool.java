package browse;

import java.util.*;

import models.Node;

/**
 * 
 * This will have all the data objects needed for rendering
 * 
 * @author Deepankur
 *
 */
public class DataPool {

	private static DataPool sDataPool;
	LinkedList<Node> initialList;

	HashSet<Node> viewedNodes;

	/**
	 * 
	 * @param initialList :- to be loaded from server/DB
	 */
	DataPool(LinkedList<Node> initialList) {
		this.initialList = initialList;
		this.viewedNodes = new HashSet<>();
	}

	/**
	 * 
	 * @param initialList to be passed only once while calling this class first time
	 * @return the static instance of DataPool
	 */
	public static DataPool getInstance(LinkedList<Node> initialList) {
		if (sDataPool == null)
			sDataPool = new DataPool(initialList);
		return sDataPool;
	}

	void markNodeAsSeen(Node seen) {
		viewedNodes.add(seen);
	}

	boolean isNodeSeen(Node node) {
		return viewedNodes.contains(node);
	}

	/**
	 * 
	 * @param count       maximum count of nodes in case there are no auto suggested
	 *                    nodes available
	 * @param openingFrom
	 * @return nodes in the range of {0 to count} if available
	 */
	List<Node> getNodesToSee(int count, Node openingFrom) {
		LinkedList<Node> suggestions = new LinkedList<>();

		if (openingFrom != null && openingFrom.getSuggestions() != null) {
			suggestions.addAll(openingFrom.getSuggestions());
		}

		while (suggestions.size() < count && initialList.size() > 0) {
			suggestions.add(initialList.pollFirst());
		}
		return suggestions;

	}

	boolean isDataAvailable() {
		return initialList.size() != 0;
	}

}
