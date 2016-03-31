
public class BigThingClass implements BigThing{
	int size=1000;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
		if(size==0){
			throw new IllegalArgumentException();
		}
	}
}