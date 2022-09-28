public class Year {
    private int yearvalue;

    public void setYearvalue(int yearvalue) {
        this.yearvalue = yearvalue;
    }
    public boolean isLeapYear()
    {
        boolean ayear=false;
        if((yearvalue % 4==0)&&(yearvalue % 100!=0)||(yearvalue % 400==0))
        {
            ayear = true ;

        }
        return  ayear;
    }
}
