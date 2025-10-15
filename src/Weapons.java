public enum Weapons {
    ESPADA(5), LANZA(4), ARCO(3), NUDILLOS(2), COSMOS(6);
    private final int danho;
    Weapons(int danho) {
        this.danho = danho;
    }
    public int getDanho() { return danho; }
}
