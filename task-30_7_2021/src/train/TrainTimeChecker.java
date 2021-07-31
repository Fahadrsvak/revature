package train;

public class TrainTimeChecker {

	public static void main(String[] args) {
		TrainRoutes trainRoutes[]= {
				new TrainRoutes("Yasvantpur Jn", "YPR", "", "23.48"),
				new TrainRoutes("Guntakal Jn", "GTL", "03.45", "03.50"),
				new TrainRoutes("Secundrabad Jn", "SC", "08.55", "9.10"),
				new TrainRoutes("Balharshah", "BPQ", "13.30", "13.35"),
				new TrainRoutes("Habibganj", "HBJ", "21.20", "21.25"),
				new TrainRoutes("Jhansi Jn", "JHS", "01.15", "01.20"),
				new TrainRoutes("Delhi S Rohilla", "DEE", "07.00", ""),

		};
		Train train1=new Train("Yasvantpur Delhi Sarai Rohilla AC Duronto Express",12213, trainRoutes);
		train1.printTrainTime();

	}

}
