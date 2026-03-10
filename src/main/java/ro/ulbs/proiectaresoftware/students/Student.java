package ro.ulbs.proiectaresoftware.students;

public class Student {
    private int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.nume = nume;
        this.prenume = prenume;
        this.formatieDeStudiu = formatieDeStudiu;
    }
    public String toString(){
        return String.format("%d                 %s      %s    %s",numarMatricol,prenume,nume,formatieDeStudiu);
    }
    public boolean compare(Student s1 )
    {
        if((s1.numarMatricol==numarMatricol) && (s1.nume.equals(nume)) &&s1.prenume.equals(prenume) && s1.formatieDeStudiu.equals(formatieDeStudiu)) return true;
    return false;
    }
}
