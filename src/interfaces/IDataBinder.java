package interfaces;

import java.util.List;

import models.Node;

public interface IDataBinder {

	boolean isDataAvailable();

	List<Node> loadMoreData(int count,Node openingFrom);

	void notifyDataSeen(Node seenNode);

}
