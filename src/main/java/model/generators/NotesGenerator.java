package model.generators;

import java.util.ArrayList;
import java.util.Random;

public class NotesGenerator {

    Random rand = new Random();
    public ArrayList<Integer> notes;

    public NotesGenerator() {
        notes = generateNotes();
    }

    public ArrayList<Integer> generateNotes() {
        ArrayList<Integer> notes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            notes.add(rand.nextInt(1, 6));
        }
        return notes;
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder("Оценки: ");
        for (Integer note : notes) {
            strb.append(note + " ");
        }
        return strb.toString();
    }
}
