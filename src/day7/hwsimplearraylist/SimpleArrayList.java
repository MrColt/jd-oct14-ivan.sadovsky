package day7.hwsimplearraylist;

public class SimpleArrayList {

	private Object[] object;

	SimpleArrayList() {

	}

	public void addFirst(Object addedObject) {
		Object[] tempArray;

		if (object == null) {
			object = new Object[1];
			object[0] = addedObject;
			return;
		}

		tempArray = new Object[object.length + 1];

		tempArray[0] = addedObject;
		for (int i = 1, j = 0; i < tempArray.length; i++, j++) {
			tempArray[i] = object[j];
		}
		object = tempArray;
	}

	public void addLast(Object addedObject) {
		Object[] tempArray;

		if (object == null) {
			object = new Object[1];
			object[0] = addedObject;
			return;
		}

		tempArray = new Object[object.length + 1];

		tempArray[tempArray.length - 1] = addedObject;
		for (int i = 0; i < object.length; i++) {
			tempArray[i] = object[i];
		}

		object = tempArray;
	}

	public void addAfter(Object prevObject, Object addedObject) {

		Object[] tempArray;
		boolean marker = false;

		if (object == null || object.length == 0) {
			throw new IllegalArgumentException(
					"There is no elements in Arraylist!");
		}

		tempArray = new Object[object.length + 1];

		for (int i = 0, j = 0; i < tempArray.length && j < object.length; j++) {
			if (object[j].equals(prevObject)) {
				marker = true;
				tempArray[i] = object[j];
				tempArray[i + 1] = addedObject;
				i = i + 2;
				continue;
			}
			tempArray[i] = object[j];
			i++;
		}

		if (!marker) {
			System.out.println("No such elements!");
			return;
		}

		object = tempArray;

	}

	public Object getByPosition(int position) {

		Object returnObject = null;

		if (object == null || object.length == 0) {
			throw new IllegalArgumentException(
					"There is no elements in Arraylist!");
		}
		if (position < 0 || position > object.length) {
			throw new IllegalArgumentException("Illegal position!");
		}
		for (int i = 0; i < object.length; i++) {
			if (i == position) {
				returnObject = object[i];
			}
		}

		if (returnObject == null) {
			throw new IllegalArgumentException("Nothing is found!");
		}
		System.out.println(returnObject);

		return returnObject;

	}
	
	public void remove(Object removedObject) {

		Object[] tempArray;
		int numberOfFindElements = 0;

		if (object == null||object.length==0) {
			throw new IllegalArgumentException(
					"There is no elements in Arraylist! Nothing could be deleted!");
		}

		for (int i = 0; i < object.length; i++) {
			if (object[i].equals(removedObject)) {
				numberOfFindElements++;
			}
		}

		tempArray = new Object[object.length - numberOfFindElements];

		for (int i = 0, j = 0; i < tempArray.length && j < object.length; j++) {
			if (object[j].equals(removedObject)) {
				continue;
			}
			tempArray[i] = object[j];
			i++;
		}

		if (numberOfFindElements == 0) {
			System.out.println("No such elements!");
			return;
		}

		object = tempArray;

	}

	public void printArrayList() {

		System.err.println("---- Result ----");
		System.out.println();
		System.out.print("[ ");
		for (int i = 0; i < object.length; i++) {
			if (i == object.length - 1) {
				System.out.print(object[i]);
			} else {
				System.out.print(object[i] + ", ");
			}
		}
		System.out.println(" ]");

	}

	public Object[] getObject() {
		return object;
	}

}
