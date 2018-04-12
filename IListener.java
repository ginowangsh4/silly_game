interface IListener {
    // the play rolls the die
    int roll(); 

    // the player chooses to skip this turn
    int skip();

    // the player stops playing with the current score
    void done();
}
