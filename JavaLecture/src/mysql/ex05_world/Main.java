package mysql.ex05_world;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CityDAO cDao = new CityDAO();
		
		City city = cDao.getCityById(2340);
		System.out.println(city);
		System.out.println("======================================================");
		
		City city2 = cDao.getCityByName("수원");
		System.out.println(city2);
		System.out.println("======================================================");
		
		List<City> city3 = cDao.getCityList("KOR", 5);
		for (City c : city3)
			System.out.println(c);
		System.out.println("======================================================");
		
		City city4 = new City("화성", "KOR", "Kyonggi", 500000);
		cDao.insertCity(city4);
		City city5 = cDao.getCityByName("화성");
		System.out.println(city5);
		System.out.println("======================================================");
		
		city = cDao.getCityByName("Puchon");
		city.setName("부천");
		city.setPopulation(850000);
		cDao.updateCity(city);
		city = cDao.getCityByName("부천");
		System.out.println(city);
		System.out.println("======================================================");
		
		cDao.deleteCity(5028);
		city = cDao.getCityByName("화성");
		if (city.getName() == null)
			System.out.println("화성이 없습니다.");
		else
			System.out.println(city);
	}

}
