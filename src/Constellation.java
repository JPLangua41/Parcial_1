public enum Constellation {
        ARIES(5, 3), TAURO(4, 4), GEMINIS(6, 2), CANCER(3, 5), LEO(7, 1), VIRGO(6, 3),
        LIBRA(5, 4), SCORPIO(6, 2), SAGITARIO(7, 2), CAPRICORNIO(4, 5), ACUARIO(5, 3), PISCIS(3, 6);

        private final int ataque;
        private final int defensa;

        Constellation(int ataque, int defensa) {
            this.ataque = ataque;
            this.defensa = defensa;
        }

        public int getAtaque() { return ataque; }
        public int getDefensa() { return defensa; }
}
