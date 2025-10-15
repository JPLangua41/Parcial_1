public enum Dios {
    ATHENA(4), HADES(5), POSEIDON(3),
    ZEUS(6), ARES(2);
    private final int defensaExtra;

    Dios(int defensaExtra) {
            this.defensaExtra = defensaExtra;
        }
        public int getDefensaExtra() { return defensaExtra; }
    }