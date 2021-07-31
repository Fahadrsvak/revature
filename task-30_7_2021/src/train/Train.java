package train;

public class Train {
	
	
	private String name;
	private int trainNumber;
	private TrainRoutes[] trainRoute;
	private int stationNum=0;

	public Train(String name, int trainNumber, TrainRoutes[] trainRoute) {
		//super();
		this.name = name;
		this.trainNumber = trainNumber;
		this.trainRoute = trainRoute;
	}


	public void printTrainTime() {
		System.out.println();
		System.out.println(name +"("+trainNumber+")");
		
		System.out.println("-----------------------------------------------");
		System.out.println("   #   code        Station      Arr.     Dep.");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < trainRoute.length; i++) {
			
			stationNum++;
			trainRoute[i].printStationTime(stationNum);
		
		}
		System.out.println("------------------------------------------------");

	}	
}
	