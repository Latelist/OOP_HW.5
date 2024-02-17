package view;

import model.generators.NotesGenerator;
import model.groups.Group;
import model.groups.StudyGroup;

/*
S — принцип единственной ответственности. Класс отвечает только за вывод текста в консоль.
 */
public class TextExpression {

    public void studyGroupConsole(StudyGroup studyGroup) {
        System.out.println(studyGroup.toString());
        }

    public void groupConsole(Group group) {
        System.out.println(group.toString());
    }

    public void notesConsole(NotesGenerator notesGenerator) {
        System.out.println(notesGenerator.toString());
    }
}
