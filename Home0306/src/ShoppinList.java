

	public class ShoppinList {
	String id;
	String name;

	ShoppinList(){

	}

	ShoppinList(String id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "ShoppinList [id=" + id + ", name=" + name + "]";
	}

//	public String toString(Product p,Member m) {
//		return m.id+"\t"+p.name;
//	}


}