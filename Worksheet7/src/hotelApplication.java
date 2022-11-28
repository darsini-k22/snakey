import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


class MonthOutOfRangeException extends Exception{
    public MonthOutOfRangeException(String s){
        super(s);
    }
}

class DayOutOfRangeException extends Exception{
    public DayOutOfRangeException(String s){
        super(s);
    }
}

class YearOutOfRangeException extends Exception{
    public YearOutOfRangeException(String s){
        super(s);
    }
}
class Hotel {
    int am;
    int ad;
    int ay;
    int dm;
    int dd;
    int dy;

    String aDate;
    String dDate;

    public Hotel(int am, int ad, int ay, int dm, int dd, int dy) {
        this.am = am;
        this.ad = ad;
        this.ay = ay;
        this.dm = dm;
        this.dd = dd;
        this.dy = dy;
    }

    Date convertArrivalDate(){
        GregorianCalendar arrivalDate=new GregorianCalendar(ay,am,ad);
        return arrivalDate.getTime();
    }

    Date convertDepartureDate(){
        GregorianCalendar departureDate=new GregorianCalendar(dy,dm,dd);
        return departureDate.getTime();
    }

}

public class hotelApplication {

    public static void main(String[] argc){
        Scanner sc=new Scanner(System.in);

          String option="y";
        while(true){

            try{
                System.out.println("Enter arrival month (1-12):");
                String aMonth=sc.nextLine();
                int am=Integer.parseInt(aMonth);

                System.out.println("Enter arrival day (1-31):");
                String aDay=sc.nextLine();
                int ad=Integer.parseInt(aDay);

                System.out.println("Enter arrival year:");
                String aYear=sc.nextLine();
                int ay=Integer.parseInt(aYear);

                System.out.println("Enter departure month (1-12):");
                String dMonth=sc.nextLine();
                System.out.println("Enter departure day (1-31):");
                String dDay=sc.nextLine();
                System.out.println("Enter departure year:");
                String dYear=sc.nextLine();
                int dm=Integer.parseInt(dMonth);
                int dd=Integer.parseInt(dDay);
                int dy=Integer.parseInt(dYear);
                if( dm<1 || dm>12) {
                    throw new MonthOutOfRangeException("MonthOutOfRangeException: Month should be within the range 1 to 12");
                }
                else if( dd <1 || dd>31){
                    throw new DayOutOfRangeException("DayOutOfRangeException: Day should be within the range 1 to 31");
                }
                else if( dy<=0 || dy>2022){
                    throw new YearOutOfRangeException("YearOutOfRangeException: Day should not be lesser than or equal 0 or greater than 2022");
                }
                else if(am <1 || am>12 ) {
                    throw new MonthOutOfRangeException("MonthOutOfRangeException: Month should be within the range 1 to 12");
                }
                else if(ad <1 || ad>31 ){
                    throw new DayOutOfRangeException("DayOutOfRangeException: Day should be within the range 1 to 31");
                }
                else if(ay<=0 || ay>=2022 ){
                    throw new YearOutOfRangeException("YearOutOfRangeException: Day should not be lesser than or equal 0 or greater than 2022");
                }
                else{
                    Hotel h1=new Hotel(am,ay,ad,dm,dy,dd);
                    System.out.println(h1.convertArrivalDate());
                    System.out.println(h1.convertDepartureDate());
                    break;

                }




            }catch(NumberFormatException en){
                System.out.println("NumberFormatException occurred!");
            } catch (MonthOutOfRangeException em){
                System.out.println(em.getMessage());
            }catch (DayOutOfRangeException ed){
                System.out.println(ed.getMessage());
            }catch (YearOutOfRangeException ey){
                System.out.println(ey.getMessage());
            }


        }




    }
}
