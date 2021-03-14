package sec07.exam01_extends_implements;

import sec03.exam01_multi_type_parameter.Tv;

public class ChildProductAndStorageExample {
public static void main(String[] args) {
	ChildProduct<Tv, String, String> product = new ChildProduct<>();
	product.setKind(new Tv());
	product.setModel("SmartTv");
	product.setCompany("Samsung");
	
	Storage<Tv> storage = new StorageImp<Tv>(100);
	storage.add(new Tv(), 0);
	Tv tv = storage.get(0);
	
}
}
