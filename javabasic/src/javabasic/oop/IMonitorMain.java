package javabasic.oop;

public class IMonitorMain {

	public static void main(String[] args) {

		IMonitor imonitor = new IMonitorImpl(); // IMonitorImpl이 아니라 IMonitor인 이유는 상위타입이 있을경우 상위타입을 적어줘야하기 때문이다.
		imonitor.powerOn();                              // IMonitor가 아니라 IMonitorImpl이 가지고 있는 것들이 추출된다.
		imonitor.brightUp();
		imonitor.brightDown();
		imonitor.powerOff();
		
	} // main

} // class
