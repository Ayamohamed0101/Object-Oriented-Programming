
package oop_lec3_code;
public class Clock {
private int hours ; // 0.23
private int min; //0.59
private int sec;//0.59
// 2 constructor
public Clock(int h,int m ,int s)
{
    if(h>=0&&h<=23)
    
    {     hours=h;}
        else
    { hours=0;}
        
}
public Clock()
{
    hours=0;
    min=0;
    sec=0;
        
}
// setter
    public void sethours(int h )
        {  hours=h;     }
public void setmin(int m )
        {  min=m;     }
public void setsec(int s )
        {  sec=s;     }
// getter
public int gethours( )
        {  return hours;     }
public int getmin( )
        {  return min;     }
public int getsec( )
        {  return sec;     }


// 1- add one second
public void addTick()
{  

if(sec<59)  {sec++;}
else {sec=0;min++ ;}
if(min==60)   {min=0; hours++;}
if(hours==24 )  {hours=0;}

}

// 2- add 1 minute

public void addMinute()
{  
if(min==60)   {min=0; hours++;}
else{min++;}
if(hours==24 )  {hours=0;}

}


public Clock addClock(Clock  c)
{  

Clock res =new Clock() ;
int a = sec+ c.sec;
res.sec =a %60;

if(a>60)
{
 res.min=1;
}

int b=min+c.min +res.min ;
res.min=b%60;
if(b>60)
{ 
    res.hours=1;
}
res.hours= (res.hours +hours+c.hours)%24 ;

return res;
}


public void modifyhour(int h )
{          hours= h%24 ;}
    
}
