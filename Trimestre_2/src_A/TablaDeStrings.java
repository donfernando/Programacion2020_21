
public class TablaDeStrings {
	private String[] datos;
	private int size;
	private int modCount;
	
	public TablaDeStrings(){
		//datos= new String[10];
		this(10);
	}
	public TablaDeStrings(int tam){
		datos= new String[tam];
		//size=0;
		//modCount=0;
	}
	public int size() {
		return size;
	}
	public boolean add(String s) {
		boolean cabe;
		if(size<datos.length) {
			cabe=true;
			datos[size]=s;
			size++;
			modCount++;
		} else
			cabe=false;
		return cabe;
	}
}
