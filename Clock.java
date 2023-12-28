package oop1;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
hours=0;minutes=0;seconds=0;
    }

    public Clock(int h, int m, int s) {
        hours = (h >= 0 && h < 24) ? h : 0;
        minutes = (m >= 0 && m < 60) ? m : 0;
        seconds = (h >= 0 && s < 60) ? s : 0;
    }

    public void setHours(int h) {
        if (h >= 0 && h < 24) {
            hours = h;
        } else if (h >= 24) {
            hours = h % 24;
        } else {
            System.out.println("not valid value");
        }

    }

    public void setMinutes(int m) {
        if (m >= 0 && m < 60) {
            minutes = m;
        } else if (m >= 60) {
            minutes = m % 60;
            hours = hours+m / 60;
        } else {
            System.out.println("not valid value");
        }
    }

    public void setSeconds(int s) {
        if (s >= 0 && s < 60) {
            seconds = s;
        } else if (s >= 60) {
            seconds = s % 60;
            minutes =minutes+ s / 60;
        } else {
            System.out.println("not valid value");
        }
        
    }
    
    public void  incsecond (){
         seconds++;
         if(seconds>59){
             seconds=0;
             minutes++;
         }
         
    }
     public void  incminutes (){
         minutes++;
         if(minutes>59){
             minutes=0;
             hours++;
         }
   }
        public void  inchours (){
          hours++;
         if( hours>23){
              hours=0;
         }
         }
        public Clock addClock(Clock c2){
            Clock c3=new Clock();
          c3.seconds=seconds+c2.seconds;
         if (c3.seconds >= 60) {
            c3.minutes = c3.seconds / 60;
            c3.seconds = c3.seconds % 60;
           
         }
           c3.minutes= c3.minutes+minutes+c2.minutes;
         if (c3.minutes >= 60) {
             c3.hours  = c3.minutes / 60;
            c3.minutes = c3.minutes % 60;
           
         }
             c3.hours=  c3.hours+hours+c2.hours;
         if (c3.hours >= 24) {
            c3.hours= c3.hours % 24;
         }
            
        return c3;}
        
         public Clock subClock(Clock c2){
            Clock c3=new Clock();
         
         if (seconds > c2.seconds) {
            c3.seconds = seconds-c2.seconds;
         }else{
             seconds+=60;
             minutes--;
             c3.seconds = seconds-c2.seconds;
         }
         if ( minutes > c2. minutes) {
            c3.minutes =  minutes-c2.minutes;
         }else{
              minutes+=60;
             hours--;
            c3.minutes =  minutes-c2.minutes;
         }
        c3.hours=hours-c2.hours;  
        return c3;}

 
    public boolean equals(Clock c) {
   
        if (this.hours != c.hours) {
            return false;
        }
        if (this.minutes != c.minutes) {
            return false;
        }
        return this.seconds == c.seconds;
    }

    @Override
    public String toString() {
        return  hours + ":" + minutes + ":" + seconds ;
    }
    public Clock copy(){
        Clock c=new Clock(hours,minutes,seconds);
        return c;
    }
}
