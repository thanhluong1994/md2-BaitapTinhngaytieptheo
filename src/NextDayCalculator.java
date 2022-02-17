public class NextDayCalculator {

    public static final String plash = "/";

    public static String testDay(int day, int month, int year) {
        int newDay = day;
        int newMonth = month;
        int newYear = year;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    newDay = 1;
                    newMonth = ++month;
                }
                else {
                    newDay=++day;
                    newMonth=month;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day==30){
                    newDay=1;
                    newMonth=++month;
                }
                else {
                    newDay=++day;
                    newMonth=month;
                }
                break;
            case 2:
                if(day==28&year==2018){
                    newDay=1;
                    newMonth=++month;
                }
                else {
                    if(day==29&year==2020) {
                    newDay=1;
                    newMonth=++month;
                    }
                    else
                        newDay = ++day;
                        newMonth = month;
                    }
                break;
            case 12:
                if(day==31){
                    newDay=1;
                    newMonth=1;
                    newYear=++year;
                }
                else {
                    newDay=++day;
                    newMonth=month;
                    newYear=year;
                }
        }
                return newDay + plash + newMonth + plash + newYear;
        }
    }

