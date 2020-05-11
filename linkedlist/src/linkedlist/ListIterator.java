package linkedlist;

public class ListIterator {

	private Link current;
	private Link previous;
	private LinkList ourLinkList;

	public ListIterator(LinkList list) {
		ourLinkList = list;
		reset();
	}

	public void reset() {
		current = ourLinkList.getFirst();
		previous = null;
	}

	public boolean atEnd() {
		return current.next == null;
	}

	public void nextLink() {
		previous = current;
		current = current.next;
	}

	public Link getCurrent() {
		return current;
	}

	public void insertAfter(int dd) {
		Link newLink = new Link(dd, 0);
		if (ourLinkList.isEmpty()) // empty list
		{
			ourLinkList.setFirst(newLink);
			;
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
}
