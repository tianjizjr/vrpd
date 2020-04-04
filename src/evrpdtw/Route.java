package evrpdtw;

import java.util.*;

public class Route{

	public double cost;
	public double weight;
	public double v_distance;
	public double d_distance;
	public double time;
	public boolean depart;//whether depart;
	
	public ArrayList<Integer> vehicleRoute;
	
	public HashMap<Integer, Integer> droneNext;
	public HashMap<Integer, Integer> dronePrev;
	
	public Route() {
		cost = 0;
		weight = 0;
		v_distance = 0;
		d_distance = 0;
		time = 0;
		depart = false;
		vehicleRoute = new ArrayList<Integer>();
		droneNext = new HashMap<Integer, Integer>();
		dronePrev = new HashMap<Integer, Integer>();
	}
	
	public Route(Route r) {
		cost = r.cost;
		weight = r.weight;
		d_distance = r.d_distance;
		v_distance = r.v_distance;
		time = r.time;
		depart = r.depart;
		vehicleRoute = new ArrayList<Integer>(r.vehicleRoute);
		droneNext = new HashMap<Integer, Integer>(r.droneNext);
		dronePrev = new HashMap<Integer, Integer>(r.dronePrev);
	}

	public String toString() {
		
		return " ";
	}
}