package javabasic.oop;

import java.util.ArrayList;
import java.util.List;

public class DeviceMain {

	public static void main(String[] args) {

//		Device device = new Device(); // 객체 만들기
//		device.setName("장비"); // 방법 1, 메소드로 데이터 세팅, 개별적으로 세팅할 때
//		device.setPrice(0); // Device의 가격은 너무 광범위하기 때문에 기본값인 0을 기입
//		device.setWeight(0); // Device의 무게는 너무 광범위하기 때문에 기본값인 0을 기입
		
//		// Device 객체 생성
//		Device device = new Device("장비", 0, 0); // 방법 2, 생성자로 데이터 세팅, 전체적으로 세팅할 때
//		
//		// Monitor 객체 생성
//		Monitor monitor = new Monitor(50, 50);
//		
//		// Keyboard 객체 생성
//		Keyboard keyboard = new Keyboard(108, "기계식");
//				
//		// Printer 객체 생성
//		Printer printer = new Printer(20000, "컬러");
		
		// 만약 Device의 종류가 엄청 많다면 한계가 있기 때문에 타입을 일원화시킴
		// Device 객체 생성
		Device device = new Device("장비", 0, 0); // 방법 2, 생성자로 데이터 세팅, 전체적으로 세팅할 때
		device.on();
		device.off();
		
		// Monitor 객체 생성
		Device monitor = new Monitor(50, 50);
		monitor.on();
		monitor.off();
		
		// Keyboard 객체 생성
		Device keyboard = new Keyboard(108, "기계식");
		keyboard.on();
		keyboard.off();
				
		// Printer 객체 생성
		Device printer = new Printer(20000, "컬러");
		printer.on();
		printer.off();
		
//		List<Device> deviceList = new ArrayList<Device>();
//		deviceList.add(monitor);
//		deviceList.add(keyboard);
//		deviceList.add(printer);
//		
//		for (Device each : deviceList) {
//			each.on();
//			each.off();
//		}
		
		List<Object> deviceList = new ArrayList<Object>();
		deviceList.add(monitor);
		deviceList.add(keyboard);
		deviceList.add(printer);
		
		for (Object each : deviceList) {
			((Device)each).on(); // Object에 on, off 메소드가 없기 때문에 에러가 뜬다. 그러므로 (Device)를 붙여 하위형변환을 시켜줘야 함.
			((Device)each).off(); // 위에서 상위형변환이 일어났었기 때문에 하위형변환 할 수 있다.
		}
		
		Object device2 = new Device("랜카드", 20000, 500);
		((Device)device2).on();
		((Device)device2).off();
		
		// 키보드 하나 Object 타입으로 만들어서 켜고 꺼보세요!
		Object keyboard2 = new Keyboard(128, "멤브레인");
		((Keyboard)keyboard).on();
		((Keyboard)keyboard).off();
		
	} // main

} // class
