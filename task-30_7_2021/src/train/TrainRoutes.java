package train;

public class TrainRoutes {
	private String arrTime;
	private String depTime;
	private String stationName;
	private String stationCode;
	
	//private int isStarts_Ends;
	public TrainRoutes(String stationName, String stationCode, String arrTime,String depTime) {
		super();
		this.stationName = stationName;
		this.stationCode = stationCode;
		this.arrTime=arrTime;
		this.depTime=depTime;
		//this.isStarts_Ends = isStarts_Ends;
		
		
		/*if(isStarts_Ends==111) {
			arrTime=time;
			depTime=time+0.05f;
		}
		if(isStarts_Ends==001) {
			depTime=time;
		}
		if(isStarts_Ends==110) {
			arrTime=time;
		}
		*/
	}
	public void printStationTime(int stationNum) {
		 System.out.printf("%4d %-5s %-15s %8s %8s\n",stationNum,stationCode,stationName,arrTime,depTime);

	}
	




}
	
