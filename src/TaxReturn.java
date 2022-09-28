//assignment 2 project 1;

public class TaxReturn {

    public static final int SINGLE=1;

    public static final int MARRIED =2;
    private static final double RATE1=0.1;
    private static final double RATE2=0.15;
    private static final double RATE3=0.25;
    private static final double RATE1_SINGLE_LIMIT=8000;
    private static final double RATE2_SINGLE_LIMIT=32000;
    private static final double RATE1_MARRIED_LIMIT=16000;
    private static final double RATE2_MARRIED_LIMIT=64000;

    private double income ;
    private double status ;

    public TaxReturn(double aincome , double astatus)
    {
        income = aincome ;
        status = astatus ;

    }
    public double getTax()
    {
        double tax1=0 ;
        double tax2=0 ;
        double tax3=0;

        if(status==SINGLE)
        {
            if(income<=RATE1_SINGLE_LIMIT)
            {
                tax1 = income * RATE1;

            }
            else if(income<=RATE2_SINGLE_LIMIT)
            {
                tax1 = RATE1*RATE1_SINGLE_LIMIT;
                tax2 = RATE2*(income-RATE1_SINGLE_LIMIT);

            }
            else {
                tax1 = RATE1*RATE1_SINGLE_LIMIT;
                tax2 = RATE2*(income-RATE1_SINGLE_LIMIT);
                tax3 = RATE3*(income-RATE1_SINGLE_LIMIT-RATE2_SINGLE_LIMIT);

            }
        }
        else {
            if(income<=RATE1_MARRIED_LIMIT)
            {
                tax1 = income * RATE1;

            }
            else if(income<=RATE2_MARRIED_LIMIT)
            {
                tax1 = RATE1*RATE1_MARRIED_LIMIT;
                tax2 = RATE2*(income - RATE1_MARRIED_LIMIT);

            }
            else {
                tax1 = RATE1*RATE1_MARRIED_LIMIT;
                tax2 = RATE2*(income - RATE1_MARRIED_LIMIT);
                tax3 = RATE3*(income - RATE1_MARRIED_LIMIT - RATE2_MARRIED_LIMIT);

            }
        }
        return tax1 + tax2 +tax3 ;

    }
}
