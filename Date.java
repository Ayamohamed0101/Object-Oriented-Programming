
package date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(day>31||day<1){
            System.out.println("Invalid day and the default day that we use=1");
            this.day=1;
        }else
        this.day = day;
         if(month>12||month<1){
            System.out.println("Invalid month and the default month that we use=1");
           this. month=1;
        }else
        this.month = month;
         if(year>9999||year<1000){
            System.out.println("Invalid year and the default year that we use=1");
           this. year=1;
        }else 
        this.year = year;
    }

    public int getDay() {
        
        return day;
    }

    public void setDay(int day) {
        if(day>31||day<1){
            System.out.println("Invalid day and the default day that we use=1");
            this.day=1;
        }else
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>12||month<1){
            System.out.println("Invalid month and the default month that we use=1");
           this. month=1;
        }else
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
         if(year>9999||year<1000){
            System.out.println("Invalid year and the default year that we use=1");
           this. year=1;
        }else
        this.year = year;
    }
    @Override
    public String toString(){
        return day+" DD/"+month+" MM/"+year+" yyyy";
    }
    public void addDay(){
        if(day==31){
            day=1;
            if(month==12){
                month=1;
                if(year==9999){
                    System.out.println("Invalid ");
                    return;
                }
                else
                    year++;
            }
            else month++;
        }
        else
            day++;
    }
    public void subDay(){
        if(day==1){
            day=31;
            if(month==1){
                month=12;
                if(year==1000){
                    System.out.println("invalid");
                    return;
                }
                   
                else
                    year--;
            }else
                month--;
        }
        else
            day--;
    }
    public boolean isMagic(){
        String s;
        s=Integer.toString(day)+Integer.toString(month)+Integer.toString(year);
        for(int i=1; i<s.length();i++){
            if(s.charAt(0)!=s.charAt(i))
                return false;
        }
        return true;
    }
    public boolean isEqual(Date d){
         String t1=toString();
        String t2=d.toString();
       if(t1.equals(t2))
          return true;
       else 
           return false;
    }
}
