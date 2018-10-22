package browse;

import java.util.List;

import interfaces.IDataBinder;
import models.Node;

public class BrowsingDataProvider implements IDataBinder {

	private BrowsingDataProvider() {

	}

	private static DataPool dataPool = new DataPool(null);

	static BrowsingDataProvider dataProvider = new BrowsingDataProvider();

	@Override
	public boolean isDataAvailable() {
		return dataPool.isDataAvailable();
	}

	@Override
	public List<Node> loadMoreData(int count) {
		return dataPool.getNodesToSee(count);
	}

	@Override
	public void notifyDataSeen(Node seenNode) {
		dataPool.markNodeAsSeen(seenNode);

	}

}
