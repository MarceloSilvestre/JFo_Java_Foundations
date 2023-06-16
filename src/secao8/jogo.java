package secao8;

public class jogo {
    private double Temperatura;
    private int ID;
    private Equipe Time1;
    private Equipe Time2;
    private int    PlacarTime1;
    private int    PlacarTime2;

    public int getPlacarTime1() {
        return PlacarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        PlacarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return PlacarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        PlacarTime2 = placarTime2;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double temperatura) {
        Temperatura = temperatura;
    }

    public Equipe getTime1() {
        return Time1;
    }

    public void setTime1(Equipe time1) {
        Time1 = time1;
    }

    public Equipe getTime2() {
        return Time2;
    }

    public void setTime2(Equipe time2) {
        Time2 = time2;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }
}
