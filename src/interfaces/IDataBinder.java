package interfaces;

import java.util.List;

import models.Node;

public interface IDataBinder {

	boolean isDataAvailable();

	List<Node> loadMoreData(int count);

	void notifyDataSeen(Node seenNode);

}
