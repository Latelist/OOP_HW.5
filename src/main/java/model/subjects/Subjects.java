package model.subjects;

public enum Subjects {
    MATH("Математика"), PROGRAMMING("Информатика"), LITERATURE("Литература"),
    ENGLISH("Английский язык"), HISTORY("История"), ART ("Искусство");
    private String ruName;

    Subjects(String ruName) {
        this.ruName = ruName;
    }

    public String getRuName() {
        return ruName;
    }
}
