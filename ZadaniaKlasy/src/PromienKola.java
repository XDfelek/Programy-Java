public class PromienKola {
    public int promien;

    public void setPromien(int promien) {
        this.promien = promien;
    }

    public int getPromien() {
        return promien;
    }

    public double getPole() {
        double temp = Math.PI * (double)promien * 2;
        return temp;
    }

    public double getObwod() {
        double temp = Math.sqrt(promien) * Math.PI;
        return temp;
    }

    public void doubleSize() {
        this.promien = this.promien * 2;
    }
}
