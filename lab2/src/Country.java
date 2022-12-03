public enum Country {
    KAZAKHSTAN(0.019, 190.8, 2725000), CANADA(0.038, 1991,9985000), DENMARK(0.005, 397.1,42951), NORWAY(0.005, 482.4, 385207), USA(0.331, 23000, 9834000), ICELAND(0.0003, 25.46, 103000), IRELAND(0.005, 498.6,70273), KITO(0.002, 108.4,372), NEW_ZEALAND(0.005, 250,268021), AUSTRALIA(0.025, 1543,7688000);
    private double nas ;

    private double plo;
    private long square;
    private double gdp;
    Country(double nas, double plo, long square){
        this.nas = nas;
        this.plo = plo;
        this.square = square;
    }
    void getNas(){
        System.out.println("This country has " + square);
        System.out.println("This country has " + nas * 1000+"mln");
    }
    double finderGDP(){
        gdp = plo / nas;
        return gdp;
    }
}
