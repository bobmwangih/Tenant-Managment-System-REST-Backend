package com.bob.springboot;

 public enum TestEnums {

	TOYOTA("Avensis","Axio","VanGuard"),
	NISSAN("JUKE","xTRAIL","PATROL"),
	MITSUBISHI("OUTLANDER","PAJERO","EVOLUTION X"),
	MAZDA("AZELA","AZENTA","ATENZA");

	private String car1;
	private String car2;
	private String car3;
	
	TestEnums(String car1, String car2, String car3) {
		this.car1 = car1;
		this.car2 = car2;
		this.car3 = car3;
	}

	public String getCar1() {
		return car1;
	}

	public void setCar1(String car1) {
		this.car1 = car1;
	}

	public String getCar2() {
		return car2;
	}

	public void setCar2(String car2) {
		this.car2 = car2;
	}

	public String getCar3() {
		return car3;
	}

	public void setCar3(String car3) {
		this.car3 = car3;
	}
	
	
}
 

