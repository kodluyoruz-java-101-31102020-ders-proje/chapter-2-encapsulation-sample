package com.encapsulation.sample.basic;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Car car = new Car("BMW", new BasicEngine());
		
		// aracın motorunu çalıştırıyoruz.
		car.start();
		car.showTemperature();
		
		// Arabanın vites bilgisini değiştirmek için fonksiyon çağırıyoruz.
		// Kapsülleme sayesinde direkt olarak vites bilgisinin değiştirilmesine izin vermiyoruz.
		car.incrementGear();
		
		car.incrementGear();
		
		// vitesi düşür!
		car.decrementGear();
		
		
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Current Gear Value: " + car.getCurrentGear());
		
		car.stop();
		System.out.println("Car engine status: " + car.isEngineActive());
	}

}
