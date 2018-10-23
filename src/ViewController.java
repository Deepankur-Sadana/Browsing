
/**
 * 
 * @author deepankur
 * 
 *         view related components here
 *
 */
public class ViewController {

	void init() {

	}

	ScrollListener mScrollListener;

	void setScrollListener(ScrollListener scrollListener) {
		this.mScrollListener = scrollListener;
	}

	public interface ScrollListener {
		void onViewScrolledOut(int viewId);

		void onViewScrolledIn(int viewId);
	}

}
