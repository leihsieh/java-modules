package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] list;
	
	public ArrayList() {
		list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();
		return list[loc];
	}
	
	public void add(T val) {
		T[] tList = (T[])new Object[list.length + 1];
		for(int i = 0; i < list.length; i++) {
			tList[i] = list[i];
		}
		tList[list.length] = val;
		list = tList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > list.length - 1) throw new IndexOutOfBoundsException();
		
		T[] tList = (T[])new Object[list.length + 1];
		
		int ctr = 0;
		
		for(int i = 0; i < tList.length; i++) {
			if(i == loc) {
				tList[i] = val;
			}else {
				tList[i] = list[ctr++];
			}
		}
		list = tList;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();
		
		for(int i = 0; i < list.length; i++) {
			if(i == loc) {
				list[i] = val;
				break;
			}
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();

		int ctr = 0;
		T[] tList = (T[])new Object[list.length - 1];
		for(int i = 0; i < list.length; i++) {
			if(i != loc) {
				tList[ctr++] = list[i];
			}
		}
		
		list = tList;
	}
	
	public boolean contains(T val) {
		for(T t : list) {
			if(t.equals(val)) {
				return true;
			}
		}
		return false;
	}
}