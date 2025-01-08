// 정올-출력-형성평가5 #105
package java_jungol;

public class Ex21 {
	public static void main(String[] args) {
		City[] cities = { 
				new City("Seoul", "10,312,545", "+91,375"),
				new City("Pusan", "3,567,910", "+5,868"),
				new City("Incheon", "2,758,296", "+64,888"), 
				new City("Daegu", "2,511,676", "+17,230"),
				new City("Gwangju ", "1,454,636", "+29,774")
		};
		
		for(City city : cities) {
			city.printInfo();
		}
	}
}

class City {
	private String name;
	private String population;
	private String growth;

	public City(String name, String population, String growth) {
		this.name = name;
		this.population = population;
		this.growth = growth;
	}

	public void printInfo() {
		System.out.printf("%15s%15s%15s\n", name, population, growth);
	}
}