import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	private int id;
	private String name;
	private int horsePower;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public StreamDemo(int id, String name, int horsePower) {
		super();
		this.id = id;
		this.name = name;
		this.horsePower = horsePower;
	}

	public static void main(String[] args) {
		StreamDemo demo = new StreamDemo(1, "Ford Mustang", 700);
		StreamDemo demo1 = new StreamDemo(2, "Aston martin DBS", 820);
		StreamDemo demo3 = new StreamDemo(3, "Mini Cooper", 720);
		StreamDemo demo4 = new StreamDemo(3, "Mini Cooper CountryMan", 620);

		List<StreamDemo> list = new ArrayList<StreamDemo>();
		list.add(demo);
		list.add(demo3);
		list.add(demo1);
		list.add(demo4);

		List<StreamDemo> sortedDemo = list.stream().sorted((n1,n2) ->{
			if(n1.getHorsePower()==n2.getHorsePower()) {
				return n1.getName().compareTo(n2.getName());
			}
			else if(n1.getHorsePower()>n2.getHorsePower()) {
				return 1;
			}else return -1;
		}).collect(Collectors.toList());
		sortedDemo.forEach(n -> System.out.println(n.getName()+" "+n.getHorsePower()+" "+n.getId()));

	}

}
