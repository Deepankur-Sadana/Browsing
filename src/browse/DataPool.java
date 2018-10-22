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
	 * @param count
	 * @return nodes in the range of {0 to count} if available
	 */
	List<Node> getNodesToSee(int count) {
		LinkedList<Node> list = new LinkedList<>();
		while (list.size() < count && initialList.size() > 0) {
			list.add(initialList.pollFirst());
		}
		return list;

	}

}
