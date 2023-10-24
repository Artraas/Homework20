package exercise2_4;

import java.util.Objects;

class Monitor extends Device {
    public int resolutionX;
    public int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {

        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor() {

    }

    @Override
    public String toString() {
        return "Monitor:" +
                " manufacturer = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber +
                ", X = " + resolutionX +
                ", Y = " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
}
