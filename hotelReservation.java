
public class hotelReservation {

	 List<Hotel> hotelList = new ArrayList<Hotel>();
	 
	 public int addHotel(final String hotelName, final int cusRate) {
		 hotelList.add(getHotel(hotelName, cusRate));
		 return hotelList.size();
	 }

	 public Hotel getHotel(final String hotelName, final int cusRate) {
		 Hotel hotel = new Hotel();
		 hotel.setHotelName(hotelName);
		 hotel.setRate(cusRate);
		 return hotel;
	 }
	 
	  
	 public static void main(String[] args) {

		 HRS hrs = new HRS();
		 hrs.addHotel("Lakewood", 110);
	}

}
