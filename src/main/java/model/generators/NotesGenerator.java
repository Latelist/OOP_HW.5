package model.generators;

import java.util.ArrayList;
import java.util.Random;

public class NotesGenerator {

    private Random rand = new Random();
    private ArrayList<Integer> notes;

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
            strb.append(note).append(" ");
        }
        return strb.toString();
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }
}
