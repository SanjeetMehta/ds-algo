package linkedlist;

public class LinkList {
	private Link first;

	public void LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}
	
	public Link getFirst() {
		return first;
	}
	
	public void setFirst(Link f) {
		first=f;
	}

	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public Link deleteElement(int dd) {
		Link current = first;

		while (current.next.next != null) {
			if (current.next.iData == dd) {
				Link temp = current.next;
				current.next = current.next.next;
				temp.next = null;
				return temp;
			}
			current = current.next;
		}
		return null;
	}

	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.Display(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
}
