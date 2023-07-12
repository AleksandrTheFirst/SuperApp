package PrinterHW;


public class CanonPrinter implements IPrinter{
    private int left;
    private int paintVolume;


    public CanonPrinter() {}
    public CanonPrinter(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    @Override
    public int getPaintVolume() {
        return paintVolume;
    }

    @Override
    public void print(String text) {
        System.out.printf("На печать отправлен текст: %s, длина: %s" + "\n", text, text.length());
        if (text.length() >= paintVolume) {
            left = text.length() - paintVolume;
            System.out.printf("Не хватило краски: %s (всего краски в принтере %s)" + "\n", left, paintVolume);
        }
        else {
            paintVolume -= text.length();
            System.out.printf("Текст распечатан: %s, у принтера осталось краски: %s)" + "\n", text, paintVolume);
        }
    }

    @Override
    public void charge(int textLength) {
        this.paintVolume += textLength;
        System.out.printf("Принтер пополнен на длину текста  %s (всего краски в принтере: %s" + "\n",
                textLength,
                (paintVolume));
    }
}
