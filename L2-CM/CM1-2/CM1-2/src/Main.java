//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome les L2 !"));
    int j = 0;

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
        IO.println(String.format("j = " + j));
        j++;
    }

    Chanson maChansonPreferee = new Chanson();
    maChansonPreferee.setNomChanson("Serrure5");
    maChansonPreferee.setArtiste("La rvfleuze");
    maChansonPreferee.jouer();
}
