package exercise3.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking 
{
    public String flightCompany;
    public String flightID;
    public String passengerFullName;
    public String tripSource = "NANJING";
    public String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
    public String tripDestination = "OULU";
    public String destinationAirport = "OULU AIRPORT";
    public LocalDate departureDate;
    public LocalDate returnDate;
    public int childPassengers;
    public int adultPassengers;
    public int totalPassengers;
    public double departingTicketPrice = 800.0;
    public double returnTicketPrice = 500.0;
    public double totalTicketPrice;
    public String ticketNumber;

    public FlightBooking(String passengerFullName, LocalDate depart, LocalDate returnDate, 
    int childPassengers,int adultPassengers) 
    {
        this.passengerFullName = passengerFullName;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
    }


    public void setFlightCompany(String flightCompany)
    {
        this.flightCompany = flightCompany;
    }
    public String getFlightCompany()
    {

        return flightCompany;
    }

    public void setFlightID(String flightID)
    {
        this.flightID = flightID;
    }
    public String getFlightID()
    {
        return flightID;
    }

    public void setPassengerFullName(String passengerFullName)
    {
        this.passengerFullName = passengerFullName;
    }
    public String getPassengerFullName()
    {
        return passengerFullName;
    }


    public void setTripSource(String tripSource)
    {
        this.tripSource = tripSource;
    }
    public String getTripSource()
    {
        return tripSource;
    }

    public void setSourceAirport(String sourceAirport)
    {
        this.sourceAirport= sourceAirport;
    }
    public String getSourceAirport()
    {
        return sourceAirport;
    }

    public void setTripDestination (String tripDestination )
    {
        this.tripDestination = tripDestination ;
    }
    public String getTripDestination ()
    {
        return tripDestination ;
    }

    public void setDestinationAirport(String destinationAirport)
    {
        this.destinationAirport= destinationAirport;
    }
    public String getDestinationAirport()
    {
        return destinationAirport;
    }

    public void setDepartingDate(LocalDate departureDate)
    {
        this.departureDate= departureDate;
    }
    public LocalDate  getDepartingDate()
    {
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate)
    {
        this.returnDate= returnDate;
    }
    public LocalDate getReturnDate()
    {
        return returnDate;
    }

    public void setChildrenPassengers(int childPassengers)
    {
        this.childPassengers= childPassengers;
    }
    public int getChildrenPassengers()
    {
        return childPassengers;
    }

    public void setAdultPassengers(int adultPassengers)
    {
        this.adultPassengers= adultPassengers;
    }
    public int getAdultPassengers()
    {
        return adultPassengers;
    }

    public void setTotalPassengers(int childPassengers,int adultPassengers)
    {
        this.totalPassengers= childPassengers+adultPassengers;
    }
    public int getTotalPassengers()
    {
        return totalPassengers;
    }

    public void setDepartingTicketPrice(double departingTicketPrice)
    {
        this.departingTicketPrice = departingTicketPrice;
    }
    public double getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(double returnTicketPrice)
    {
        this.returnTicketPrice = returnTicketPrice;
    }
    public double getReturnTicketPrice()
    {
        return returnTicketPrice;
    }

    public void setTotalTicketPrice(double totalTicketPrice)
    {
        this.totalTicketPrice = totalTicketPrice;
    }
    public double getTotalTicketPrice()
    {
        return totalTicketPrice;
    }

    public void setTicketNumber(String ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }
    public String getTicketNumber()
    {
        return ticketNumber;
    }

    public String toString()
    {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;
    }

}
