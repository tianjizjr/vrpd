package evrpdtw;

import java.util.*;

public class Route{

	public double cost;
	public double v_distance;
	public double d_distance;
	public double time;
	
	public boolean depart;//whether depart;
	
	public Map<Integer, Integer> droneNext; // 无人机的下一站; 没有则是null
	public Map<Integer, Integer> dronePrev; // 无人机的上一站; 没有则是null
	public ArrayList<Integer> vehicleRoute;
	
	public Route() {
		droneNext = new HashMap<Integer, Integer>();
		dronePrev = new HashMap<Integer, Integer>();
		vehicleRoute = new ArrayList<Integer>();
	}
	
	public boolean check() {
		
		return true;
	}
	
	public String toString() {
		
		return "";
	}
}
