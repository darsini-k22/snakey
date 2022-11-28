
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PassengerTicket {
    private int seatNo;
    private boolean seatAvailable;
    private String seatStatus;
    private String passengerName;
    private String passengerGender;
    private String departure;
    private String destination;
    private String departureDateTime;
    private String issueDateTime;
    private double totalPrice;

    public PassengerTicket(int seatNo, boolean seatAvailable, String seatStatus, String passengerName, String passengerGender, String departure, String destination, String departureDateTime, String issueDateTime, double totalPrice) {
        this.seatNo = seatNo;
        this.seatAvailable = seatAvailable;
        this.seatStatus = seatStatus;
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.issueDateTime = issueDateTime;
        this.totalPrice = totalPrice;
    }

    public PassengerTicket() {
        this.seatNo = 0;
        this.seatAvailable = true;
        this.seatStatus = "";
        this.passengerName = "";
        this.passengerGender = "";
        this.departure = "";
        this.destination = "";
        this.departureDateTime = "yyyy/mm/dd HH:mm:ss";
        this.issueDateTime = "yyyy/mm/dd HH:mm:ss";
        this.totalPrice =0;
    }



    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(boolean seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public String getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(String issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

     abstract void setTotalPrice(double totalPrice);

    @Override
    public String toString() {
        return "PassengerTicket{" +
                "seatNo=" + seatNo +
                ", seatAvailable=" + seatAvailable +
                ", seatStatus='" + seatStatus + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", passengerGender='" + passengerGender + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDateTime='" + departureDateTime + '\'' +
                ", issueDateTime='" + issueDateTime + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}


class BusTicket extends PassengerTicket{
    private int distance;
    private double serviceCharge;

    public BusTicket(int seatNo, boolean seatAvailable, String seatStatus, String passengerName, String passengerGender, String departure, String destination, String departureDateTime, String issueDateTime, double totalPrice, int distance) {
        super(seatNo, seatAvailable, seatStatus, passengerName, passengerGender, departure, destination, departureDateTime, issueDateTime, totalPrice);
        this.distance = distance;

    }

    public BusTicket(int distance) {
        this.distance = distance;
    }

    BusTicket(){
        this.distance=0;
        this.serviceCharge=0;
    }

    @Override
    void setTotalPrice(double totalPrice) {
        totalPrice=distance*0.08+serviceCharge;
    }
}

interface TicketOperations{
    public boolean makeReservation(BusTicket ticket,String name,String gender);
    public boolean cancelReservation(BusTicket ticket);

    public boolean buyTicket(BusTicket ticket,String name,String gender);

    public boolean cancelTicketSold(BusTicket ticket);

}

class Officer implements TicketOperations{
    private String name;
    private String address;

    Officer(){
        this.name="";
        this.address="";
    }

    Officer(String name,String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean makeReservation(BusTicket ticket, String name, String gender) {
        ticket.setSeatStatus("RESERVED");
        ticket.setPassengerName(name);
        ticket.setPassengerGender(gender);
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }

    @Override
    public boolean cancelReservation(BusTicket ticket) {
        ticket.setSeatAvailable(true);
        ticket.setSeatStatus("AVAILABLE");
        ticket.setPassengerName("");
        ticket.setPassengerGender("");
        ticket.setIssueDateTime("yyyy/MM/dd HH:mm:ss");
        return true;
    }

    @Override
    public boolean buyTicket(BusTicket ticket, String name, String gender) {
        ticket.setPassengerName(name);
        ticket.setPassengerGender(gender);
        ticket.setSeatAvailable(false);
        ticket.setSeatStatus("SOLD");
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }

    @Override
    public boolean cancelTicketSold(BusTicket ticket) {
        ticket.setSeatAvailable(true);
        ticket.setSeatStatus("AVAILABLE");
        ticket.setPassengerName("");
        ticket.setPassengerGender("");
        ticket.setIssueDateTime("yyyy/MM/dd HH:mm:ss");
        return true;
    }
}