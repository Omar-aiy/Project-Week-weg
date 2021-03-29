package domain;

import java.awt.*;
import java.util.Objects;

public class Cirkel {
    private Point middelpunt;
    private double straal;

    public Cirkel(Point middelpunt, double straal) {
        if (middelpunt == null) throw new IllegalArgumentException();
        if (straal <= 0) throw new IllegalArgumentException();
        if (straal > Math.min(middelpunt.getX(), middelpunt.getY())) throw new IllegalArgumentException();
        this.middelpunt = middelpunt;
        this.straal = straal;
    }

    public Point getMiddelpunt() {
        return middelpunt;
    }

    public double getStraal() {
        return straal;
    }

    public double getOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cirkel cirkel = (Cirkel) o;
        return Double.compare(cirkel.straal, straal) == 0 && Objects.equals(middelpunt, cirkel.middelpunt);
    }

    @Override
    public String toString() {
        String output = "Cirkel met middelpunt " + getMiddelpunt().toString() + " en straal " + getStraal();
        return output;
    }
}
