package MScCA1;

public class MScCA1Marks
{
    public int sem1Total;
    public int sem2Total;

    public MScCA1Marks(int sem1Total,int sem2Total)
    {
        this.sem1Total=sem1Total;
        this.sem2Total=sem2Total;
    }

    public int getTotalMarks()
    {
        return sem1Total+sem2Total;
    }
}