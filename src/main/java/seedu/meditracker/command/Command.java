package seedu.meditracker.command;

import seedu.meditracker.medication.MedicationList;
import seedu.meditracker.ui.Ui;

public abstract class Command {
    private MedicationList medicationList;

    /**
     * Executes the command.
     *
     * @param medicationList ArrayList of medicines.
     * @param ui Ui object.
     */
    public abstract void execute(MedicationList medicationList, Ui ui);

    /**
     * Returns the boolean to exit the program.
     *
     * @return False which continues program.
     */
    public boolean isExit() {
        return false;
    }
}
