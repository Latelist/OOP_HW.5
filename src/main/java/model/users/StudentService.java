package model.users;

/*
I — принцип разделения интерфейсов. Отдельный интерфейс для студентов — преподавателям не нужна эта функция.
 */

public interface StudentService {
    public double calculateAverage();
}
