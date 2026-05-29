package entities;

public class Student {
    private String name;
    private double trimestre1;
    private double trimestre2;
    private double trimestre3;


    public double notaFinal (){
        return trimestre1+trimestre2 +trimestre3;
    }

    public String aprovacao (){
        if (notaFinal()>=60.00){
            return "PASS";
        }
        else {
            return String.format("FAILED %nMISSING %.2f POINTS",60.00-notaFinal());

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String aluno) {
        this.name = aluno;
    }

    public double getTrimestre3() {
        return trimestre3;
    }

    public void setTrimestre3(double trimestre3) {
        this.trimestre3 = trimestre3;
    }

    public double getTrimestre2() {
        return trimestre2;
    }

    public void setTrimestre2(double trimestre2) {
        this.trimestre2 = trimestre2;
    }

    public double getTrimestre1() {
        return trimestre1;
    }

    public void setTrimestre1(double trimestre1) {
        this.trimestre1 = trimestre1;
    }
}
