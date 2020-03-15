package com.example.springparking;

import com.example.springparking.dao.ParkingDao;
import com.example.springparking.dao.PlaceDao;
import com.example.springparking.dao.VehicleDao;
import com.example.springparking.entity.Parking;
import com.example.springparking.entity.Place;
import com.example.springparking.entity.Vehicle;
import com.example.springparking.proxyPattern.IServiceVehicle;
import com.example.springparking.proxyPattern.VehicleProxy;
import com.example.springparking.statePattern.PlaceTrue;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        VehicleDao vehicleDao = context.getBean("vehicleDao", VehicleDao.class);
        PlaceDao placeDao = context.getBean("placeDao", PlaceDao.class);
        ParkingDao parkingDao = context.getBean("parkingDao", ParkingDao.class);



        IServiceVehicle veh1 = new Vehicle();
        veh1.setId(1);
        veh1.setName("Toyota");
        veh1.setColor("white");
        veh1.setBodyType("sedan");

        IServiceVehicle veh2 = new Vehicle();
        veh2.setId(2);
        veh2.setName("Porche");
        veh2.setColor("Black");
        veh2.setBodyType("sedan");

        IServiceVehicle veh3 = new Vehicle();
        veh3.setId(3);
        veh3.setName("BMW");
        veh3.setColor("Yellow");
        veh3.setBodyType("sedan");

        PlaceTrue initialState=new PlaceTrue();

        Place place1=new Place();
        place1.setCurrentState(initialState);
        place1.setPalce_id(1);

        Place place2=new Place();
        place2.setCurrentState(initialState);
        place2.setPalce_id(2);

        Place place3=new Place();
        place3.setCurrentState(initialState);
        place3.setPalce_id(3);

        Parking adk=new Parking();
        adk.setId(1);
        adk.setParkingName("ADK");

        Parking mega=new Parking();
        mega.setId(2);
        mega.setParkingName("Mega");

        parkingDao.addParking(mega);
        parkingDao.addParking(adk);


        mega.addPlace(place2);
        mega.addPlace(place3);
        adk.addPlace(place1);
        System.out.println("");
        vehicleDao.addVehicle((Vehicle)veh1);
        vehicleDao.addVehicle((Vehicle)veh2);
        vehicleDao.addVehicle((Vehicle)veh3);

        vehicleDao.TakePlace((Vehicle)veh1, place1);
        vehicleDao.TakePlace((Vehicle)veh2, place3);

        vehicleDao.TakePlace((Vehicle)veh2, place2);

        vehicleDao.LeavePlace((Vehicle)veh2,place3);
        vehicleDao.LeavePlace((Vehicle)veh1,place2);
        vehicleDao.TakePlace((Vehicle)veh1, place3);
        parkingDao.getFreePlaces(mega);
        parkingDao.getFreePlaces(adk);



    }
}
